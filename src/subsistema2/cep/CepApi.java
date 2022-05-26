package subsistema2.cep;

public class CepApi {
		
	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Pires do Rio";
	}
	
	public String recuperarString(String cep) {
		return "GOIÁS";
	}

	public String recuperarEstado(String cep) {
	
		return "GO";
	}

}
