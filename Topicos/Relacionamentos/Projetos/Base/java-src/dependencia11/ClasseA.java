package dependencia11;


public class ClasseA {
	public void metodo1(ClasseB b_param) {
		System.out.println(b_param.toString());
	}

	public void metodo2() {
		ClasseB b_local = new ClasseB();
		
		System.out.println(b_local.toString());
	}
}

