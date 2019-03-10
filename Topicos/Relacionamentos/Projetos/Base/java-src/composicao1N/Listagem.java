/*
 * MARTIN, Robert Cecil. UML for Java Programmers. Prentice Hall. 2002. p. 33.
 * MOHAN, Permanand. Fundamentals of Object-Oriented Programming in Java. 
 * CreateSpace Independent Publishing Platform, 2013. p. 144.
 * REED Jr. Developing Applications with Java™ and UML. Addison Wesley, 2001.
 */
package composicao1N;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listagem {
	private List<Parte> partes;

	// injecao por metodo - colecao
	public void setPartes(List<Parte> partes) {
		this.partes = partes;
	}

	public List<Parte> getPartes() {
		// inicializacao LAZY (preguicosa)
		if (this.partes == null)
			this.partes = new ArrayList<Parte>();
		return this.partes;
	}

	public void listarPartes() {
		for (int i = 0, n = this.getPartes().size(); 1 < n; i++) {
			System.out.println("Parte " + i + ": " 
								+ this.getPartes().get(i).toString());
		}
	}

	public void listar2Partes() {
		for (Parte parte : this.getPartes()) {
			System.out.println(parte);
		}
	}

	public void listar3Partes() {
		Iterator<Parte> parteIterator = this.getPartes().iterator();
		while (parteIterator.hasNext()) {
			System.out.println(parteIterator.next());
		}
	}

	public void listar4Partes() {
		int i = 0;
		while (i < this.getPartes().size()) {
			System.out.println(this.getPartes().get(i));
			i++;
		}
	}

	public void listar5Partes() {
		this.getPartes().forEach((parte) -> {
			System.out.println(parte);
		});
	}
}

