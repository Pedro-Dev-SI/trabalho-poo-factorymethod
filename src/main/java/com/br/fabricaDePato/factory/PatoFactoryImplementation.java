package com.br.fabricaDePato.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.fabricaDePato.factory.constants.PatoTypeConstants;
import com.br.fabricaDePato.factory.implementation.PatoDeBorracha;
import com.br.fabricaDePato.factory.implementation.PatoDeMadeira;
import com.br.fabricaDePato.factory.implementation.PatoDePapel;
import com.br.fabricaDePato.factory.implementation.PatoDeVerdade;

@Service
public class PatoFactoryImplementation {
	
	@Autowired
	private PatoDeBorracha patoDeBorracha;
	
	@Autowired
	private PatoDeMadeira patoDeMadeira;
	
	@Autowired
	private PatoDePapel patoDePapel;
	
	@Autowired
	private PatoDeVerdade patoDeVerdade;
	
	private static final Map<String, Pato> handler = new HashMap<String, Pato>();
	
	@PostConstruct
	private Map<String, Pato> getObject() {
		handler.put(PatoTypeConstants.PATO_DE_BORRACHA, patoDeBorracha);
		handler.put(PatoTypeConstants.PATO_DE_MADEIRA, patoDeMadeira);
		handler.put(PatoTypeConstants.PATO_DE_PAPEL, patoDePapel);
		handler.put(PatoTypeConstants.PATO_DE_VERDADE, patoDeVerdade);
		return handler;
	}
	
	public static Pato createInstance(String pato) throws Exception {
		return Optional.ofNullable(handler.get(pato)).orElseThrow(() -> new IllegalArgumentException("Pato inválido"));
	}
}
