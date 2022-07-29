package gof;

import gof.Singleton.SingletonEager;
import gof.Singleton.SingletonLazy;
import gof.Singleton.SingletonLazyHolder;
import gof.Strategy.Comportamento;
import gof.Strategy.ComportamentoAgressivo;
import gof.Strategy.ComportamentoDefensivo;
import gof.Strategy.ComportamentoNormal;
import gof.Strategy.Robo;
import gof.facade.Facade;

public class Teste {

	public static void main(String[] args) {
		
		//SINGLETON
		
		//Devem sempre repetir seu mesmo endereçõ de memória
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//FACADE
		
		Facade facade = new Facade();
		facade.migrarCliente("Anderson", "59120-410");
	}

}
