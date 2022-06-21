package com.br.fabricaDePato.factory.implementation;

import org.springframework.stereotype.Component;

import com.br.fabricaDePato.factory.Pato;

@Component
public class PatoDeBorracha implements Pato{

	@Override
	public String descricao() {
		return "Sou o mais divertido, as criaças me amam, sou fofo, e posso fazer diferentes barulhos";
	}
}
