/*
 * MARTIN, Robert Cecil. UML for Java Programmers. Prentice Hall. 2002. p. 33.
 * MOHAN, Permanand. Fundamentals of Object-Oriented Programming in Java. 
 * CreateSpace Independent Publishing Platform, 2013. p. 144.
 */
package associacao11_;

public class ClasseA {
	ClasseB b;

	public ClasseA() {
		super();
	}
	
	public ClasseA(ClasseB b) {
		this.b = b;
	}

	public void setB(ClasseB b) {
		this.b = b;
	}
	
	public ClasseB getB() {
		return this.b;
	}
}


