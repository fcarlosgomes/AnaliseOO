/*
 * MARTIN, Robert Cecil. UML for Java Programmers. Prentice Hall. 2002. p. 33.
 * MOHAN, Permanand. Fundamentals of Object-Oriented Programming in Java. 
 * CreateSpace Independent Publishing Platform, 2013. p. 144.
 * 
 * A agregacao eh um tipo associacao e, portanto, seus codigos são semelhantes.
 * A diferenca entre a agregacao e associacao eh semantica.
 * Agregacao eh uma 'meronimia', uma associacao todo-parte.
 */
package agregacao11;     // 11, multiplicidade 1 para 1

public class Todo {
	Parte parte;         // campo ponteiro do relacionamento

	public Todo(Parte parte) {          // agregacao pelo construtor
		this.parte = parte;
	}

	public Todo() {                     // construtor vazio, a agregacao serah via setter
	}
	
	public void setParte(Parte parte) { // agregacao por setter
		this.parte = parte;
	}

	public Parte getParte() {
		return this.parte;
	}

}

