/*
 * MARTIN, Robert Cecil. UML for Java Programmers. Prentice Hall. 2002. p. 33.
 * MOHAN, Permanand. Fundamentals of Object-Oriented Programming in Java. 
 * CreateSpace Independent Publishing Platform, 2013. p. 144.
 * REED Jr. Developing Applications with Java™ and UML. Addison Wesley, 2001.
 */
package agregacao1N;

import java.util.ArrayList;
import java.util.List;

public class Todo {
	private List<Parte> partes;
	
	// Agregacao por construtora - criacao da colecao
	public Todo() {
		this.partes = getPartes();
	}

	public List<Parte> getPartes() {
		if (this.partes == null)     // inicializacao LAZY (preguicosa)
			this.partes = new ArrayList<Parte>();
		return this.partes;
	}

	// escrita / injecao por construtora - item da colecao
	public Todo(Parte parte) {
		setParte(parte);
	}

	// escrita / injecao por metodo - item da colecao
	public void setParte(Parte parte) {
		getPartes().add(parte);
	}

	// leitura por metodo - item da colecao - busca pela chave Id
	public Parte getParte(int parteId) {
		Parte parte = null;

		for (int i = 0; i < partes.size(); i++) {
			if (partes.get(i).id == parteId) {
				parte = partes.get(i);
				break;
			}
		}
		return parte;
	}
}


