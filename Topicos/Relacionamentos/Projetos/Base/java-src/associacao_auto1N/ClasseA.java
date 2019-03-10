/*
 * MARTIN, Robert Cecil. UML for Java Programmers. Prentice Hall. 2002. p. 33.
 * MOHAN, Permanand. Fundamentals of Object-Oriented Programming in Java. 
 * CreateSpace Independent Publishing Platform, 2013. p. 144.
 * REED Jr. Developing Applications with Java™ and UML. Addison Wesley, 2001.
 */
package associacao_auto1N;

import java.util.ArrayList;
import java.util.List;

public class ClasseA {
	private List<ClasseA> instanciasDeA;

	public ClasseA() {
		// Cria a lista de instancias
		getInstanciasDeA();
	}

	// injecao por construtora - item da colecao
	public ClasseA(ClasseA instanciaDeA) {
		setInstanciaDeA(instanciaDeA);
	}

	// injecao por metodo - item da colecao
	public void setInstanciaDeA(ClasseA instanciaDeA) {
		getInstanciasDeA().add(instanciaDeA);
	}

	public List<ClasseA> getInstanciasDeA() {
		// inicializacao LAZY (preguicosa)
		if (instanciasDeA == null)
			this.instanciasDeA = new ArrayList<ClasseA>();
		return this.instanciasDeA;
	}
}


