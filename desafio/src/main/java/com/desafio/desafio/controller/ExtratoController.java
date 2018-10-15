package com.desafio.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.desafio.service.ExtratoService;

@RestController
public class ExtratoController {

	@Autowired
	public ExtratoService extratoService;

	@GetMapping(value = "/getExtrato")
	public String getExtrato() {
		return extratoService.getExtrato().toString();
	}

	public ExtratoService getExtratoService() {
		return extratoService;
	}

	public void setExtratoService(ExtratoService extratoService) {
		this.extratoService = extratoService;
	}
}
