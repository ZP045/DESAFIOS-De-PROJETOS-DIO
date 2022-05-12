package criar.robos.gof;

import criar.robos.gof.singleton.SingletonEager;
import criar.robos.gof.singleton.SingletonLazy;
import criar.robos.gof.singleton.SingletonLazyHolder;
import criar.robos.gof.strategy.Comportamento;
import criar.robos.gof.strategy.ComportamentoFeliz;
import criar.robos.gof.strategy.ComportamentoApaixonado;
import criar.robos.gof.strategy.ComportamentoNormal;
import criar.robos.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
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
		
		// Strategy
		
		Comportamento apaixonado = new ComportamentoApaixonado();
		Comportamento normal = new ComportamentoNormal();
		Comportamento feliz = new ComportamentoFeliz();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(apaixonado);
		robo.mover();
		robo.mover();
		robo.mover();
                robo.setComportamento(feliz);
		robo.mover();
		
	}

}
