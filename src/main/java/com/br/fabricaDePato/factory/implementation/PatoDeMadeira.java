package com.br.fabricaDePato.factory.implementation;

import org.springframework.stereotype.Component;

import com.br.fabricaDePato.factory.Pato;

@Component
public class PatoDeMadeira implements Pato{
	
	@Override
	public String descricao() {
		return "Continuo não fazendo nada, sirvo pra decorar e os cupins me amam";
	}
}
