package com.br.fabricaDePato.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.br.fabricaDePato.factory.Pato;
import com.br.fabricaDePato.factory.PatoFactoryImplementation;

@RestController
public class FabricaDePatoController {
	
	@GetMapping("/fabrica-de-pato/{pato-type}")
	public String getPatoTypeInfo(@PathVariable("pato-type") String pato) throws Exception {
		
		Pato patoFactory = PatoFactoryImplementation.createInstance(pato);
		return patoFactory.descricao();
	}
}
