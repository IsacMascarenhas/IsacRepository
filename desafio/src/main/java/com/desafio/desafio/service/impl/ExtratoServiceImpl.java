package com.desafio.desafio.service.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

import com.desafio.desafio.controller.ExtratoController;
import com.desafio.desafio.models.DadosLegadoExtratoModel;
import com.desafio.desafio.models.ExtratoModel;
import com.desafio.desafio.service.ExtratoService;
import com.desafio.desafio.util.GsonTransformer;

@Component
public class ExtratoServiceImpl implements ExtratoService {

	@Override
	public List<ExtratoModel> getExtrato() {
		try {

			InputStream inputStream = ExtratoController.class.getResourceAsStream("/lancamento-conta-legado.json");
			List<String> doc = IOUtils.readLines(inputStream, "UTF-8");
			String dadosLegado = String.join("\n", doc);

			DadosLegadoExtratoModel d = GsonTransformer.toObject(dadosLegado, DadosLegadoExtratoModel.class);

			
			List<ExtratoModel> extratos = new ArrayList();

			d.getListaControleLancamento().forEach(o -> {
				ExtratoModel extrato = new ExtratoModel();
				String dadosBancarios = o.getNomeBanco() + " AG "
						+ o.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroAgencia() + " CC "
						+ o.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroContaCorrente();

				extrato.setDadosBancarios(dadosBancarios);
				extrato.setDataDeConfirmacao(o.getDataEfetivaLancamento());
				extrato.setDataDoLancamento(o.getDataLancamentoContaCorrenteCliente());
				extrato.setDescricao(o.getLancamentoContaCorrenteCliente().getNomeTipoOperacao());
				extrato.setNumero(o.getLancamentoContaCorrenteCliente().getNumeroRemessaBanco().toString());
				extrato.setSituacao(o.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa());
				extrato.setValorFinal(d.getTotalControleLancamento().getValorLancamentos());

				extratos.add(extrato);
			});

			return extratos;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
