package br.com.dio.api;

public class ResultadoExame {

	private ResultadoExame(){
        super();
    }

        

	public static void gerarAso(String paciente, Integer senhaAtendimento, String exame, String hospital,
			String horarioConsulta, String horarioColeta) {
		System.out.println("SEU ASO FOI GERADO COM SUCESSO");
		System.out.println("Paciente: " + paciente);
        System.out.println("Senha Atendimento: " + senhaAtendimento);
        System.out.println("Tipo Exame Ocupacional: " + exame);
        System.out.println("Cl�nica de Atendimento: " + hospital);
        System.out.println("Hor�rio da Consulta: " + horarioConsulta);
        System.out.println("Hor�rio da Coleta: " + horarioColeta);
	}
}
