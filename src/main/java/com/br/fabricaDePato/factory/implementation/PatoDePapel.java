package com.br.fabricaDePato.factory.implementation;

import org.springframework.stereotype.Component;

import com.br.fabricaDePato.factory.Pato;

@Component
public class PatoDePapel implements Pato{
	
	@Override
	public String descricao() {
		return "Se me jogar na água eu desmancho =(";
	}
}
