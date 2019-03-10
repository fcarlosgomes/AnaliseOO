/*
 * MARTIN, Robert Cecil. UML for Java Programmers. Prentice Hall. 2002. p. 33.
 * MOHAN, Permanand. Fundamentals of Object-Oriented Programming in Java. 
 * CreateSpace Independent Publishing Platform, 2013. p. 144.
 */
package composicao11;

public class Todo {
	Parte parte;

	public Todo() {
		this.parte = new Parte();
	}

	public Parte getParte() {
		return this.parte;
	}

}


