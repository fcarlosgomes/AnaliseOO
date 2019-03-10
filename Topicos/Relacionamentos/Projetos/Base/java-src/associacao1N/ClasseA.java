/*
 * MARTIN, Robert Cecil. UML for Java Programmers. Prentice Hall. 2002. p. 33.
 * MOHAN, Permanand. Fundamentals of Object-Oriented Programming in Java. 
 * CreateSpace Independent Publishing Platform, 2013. p. 144.
 * REED Jr. Developing Applications with Java™ and UML. Addison Wesley, 2001.
 */
package associacao1N;

import java.util.ArrayList;
import java.util.List;

public class ClasseA {
	private List<ClasseB> listaDeB;

	// criacao da colecao
	public ClasseA() {
		this.listaDeB = getListaDeB();
	}

	public List<ClasseB> getListaDeB() {
		if (this.listaDeB == null) // inicializacao LAZY (preguicosa)
			this.listaDeB = new ArrayList<ClasseB>();
		return this.listaDeB;
	}

	// escrita / injecao por construtora - item da colecao
	public ClasseA(ClasseB b) {
		setB(b);
	}

	// escrita / injecao por metodo - item da colecao
	public void setB(ClasseB b) {
		getListaDeB().add(b);
	}

	public void removeB(int b_Id) {
		
		for (int i = 0; i < listaDeB.size(); i++) {
			if (listaDeB.get(i).id == b_Id) {
				listaDeB.remove(i);
				break;
			}
		}
	}

	// leitura por metodo - item da colecao - busca pela chave Id
	public ClasseB getB(int b_Id) {
		ClasseB b = null;

		for (int i = 0; i < listaDeB.size(); i++) {
			if (listaDeB.get(i).id == b_Id) {
				b = listaDeB.get(i);
				break;
			}
		}
		return b;
	}
}
