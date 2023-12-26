package br.com.dio.api;

public class ExameOcupacionalApi {

	public static ExameOcupacionalApi instancia = new ExameOcupacionalApi();
	
	private ExameOcupacionalApi() {
		super();
	}
	
	public static ExameOcupacionalApi getInstancia(){
        return instancia;
    }

	public String pacienteAtendido(String nomePaciente){
        return nomePaciente;
    }
	
	public String tipoExame(String tipoExame){
        return tipoExame;
    }
	
    public String clinicaRenovacao(){
        return "Clinica ASSO Medicina do Trabalho";
    }

    public Integer numeroAtendimento (){
        return 2057;
    }

    public String horarioConsulta() {
        return "09:45";
    }

    public String horarioColeta() {
        return "10:05";
    }
}
