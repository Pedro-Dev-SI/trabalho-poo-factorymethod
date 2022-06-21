package com.br.fabricaDePato.factory.implementation;

import org.springframework.stereotype.Component;

import com.br.fabricaDePato.factory.Pato;

@Component
public class PatoDeVerdade implements Pato{
	
	@Override
	public String descricao() {
		return "Não sei fazer nada direito, mas sou fofo e faço quack";
	}
}
