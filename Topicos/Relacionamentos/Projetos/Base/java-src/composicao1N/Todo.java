/*
 * MARTIN, Robert Cecil. UML for Java Programmers. Prentice Hall. 2002. p. 33.
 * MOHAN, Permanand. Fundamentals of Object-Oriented Programming in Java. 
 * CreateSpace Independent Publishing Platform, 2013. p. 144.
 * REED Jr. Developing Applications with Java™ and UML. Addison Wesley, 2001.
 */
package composicao1N;

import java.util.ArrayList;
import java.util.List;

// Composicao
public class Todo {
	private List<Parte> partes;
	private Listagem listagem = new Listagem();

	// Composicao por construtora - criacao da colecao
	public Todo() {
		this.partes = getPartes();
	}

	public List<Parte> getPartes() {
		// inicializacao LAZY (preguicosa)
		if (this.partes == null)
			this.partes = new ArrayList<Parte>();
		return this.partes;
	}

	public void listagem() {
		this.listagem.setPartes(this.getPartes());
		this.listagem.listarPartes();
	}

	// injecao por construtora - item da colecao
	public Todo(Parte parte) {
		setParte(parte);
	}

	// injecao por metodo - item da colecao
	public void setParte(Parte parte) {
		getPartes().add(parte);
	}

	// leitura por metodo - item da colecao
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

