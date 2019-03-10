package generalizacao_Concreta;

public class ClasseB extends ClasseA {
	public void metodoDeB() {
		
		super.metodoDeA();
		
		System.out.println();
		System.out.println(this.toString());
	}
}


