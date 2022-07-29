package gof.facade;

import gof.Subsistema1.crm.CrmService;
import gof.Subsistema2.cep.CepApi;

public class Facade {
	
	public void migrarCliente( String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		CrmService.gravarCliente(nome, cep, estado,cidade);
	}

}
