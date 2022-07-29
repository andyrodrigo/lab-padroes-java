package gof.Subsistema2.cep;

public class CepApi {
	
	private static CepApi instancia =  new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade( String cep) {
		return "Paju�ara";
	}
	
	public String recuperarEstado( String estado) {
		return "RN";
	}

}
