/*
 * https://www.geeksforgeeks.org/program-check-date-valid-not/
 * https://www.javatpoint.com/string-concatenation-in-java
 */
package java_pkg_Procedural1;

public class Teste {
	public static void main(String args[]) {
		testar(10, 12, 2000);
		testar(31, 11, 2000);
	}
	
	public static void testar(int dia, int mes, int ano) {
		if (Data.validarData(dia, mes, ano))
			System.out.println(new StringBuilder().append(dia).append("/").append(mes).append("/").append(ano).append(": data válida"));
		else
			System.out.println(new StringBuilder().append(dia).append("/").append(mes).append("/").append(ano).append(": data errada"));
	}
}
