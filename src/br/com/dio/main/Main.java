package br.com.dio.main;

import br.com.dio.service.impl.AtendimentoService;

public class Main {

	public static void main(String[] args) {
		
		AtendimentoService service = new AtendimentoService();
		
		service.novoConvocacao("Rodrigo Freitas", "Exame Admssional");
		
	}

}
