package generalizacao_Abstrata;

public class ClasseB extends ClasseA {
	public void metodoDeB() {
		
		super.metodoConcretoDeA();
		
		System.out.println();
		System.out.println(this.toString());
	}

	@Override
	public void metodo1DeA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodo2DeA() {
		// TODO Auto-generated method stub
		
	}
}



