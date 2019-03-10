package generalizacao_Abstrata;

public abstract class ClasseA {
	
	public abstract void metodo1DeA();
	public abstract void metodo2DeA();
	
	public void metodoConcretoDeA() {
		System.out.println(this.toString());
	}
}

