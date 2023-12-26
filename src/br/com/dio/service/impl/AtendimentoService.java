package br.com.dio.service.impl;

import br.com.dio.api.ExameOcupacionalApi;
import br.com.dio.api.ResultadoExame;

public class AtendimentoService {

	public void novoConvocacao(String nomePaciente, String tipoExame) {
		String paciente = ExameOcupacionalApi.getInstancia().pacienteAtendido(nomePaciente);
		String exame = ExameOcupacionalApi.getInstancia().tipoExame(tipoExame);
		String hospital = ExameOcupacionalApi.getInstancia().clinicaRenovacao();
        Integer senhaAtendimento = ExameOcupacionalApi.getInstancia().numeroAtendimento();
        String horarioConsulta = ExameOcupacionalApi.getInstancia().horarioConsulta();
        String horarioColeta = ExameOcupacionalApi.getInstancia().horarioColeta();

        ResultadoExame.gerarAso(paciente, senhaAtendimento, exame, hospital, horarioConsulta, horarioColeta);
		
	}

}
