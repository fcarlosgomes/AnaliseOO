/*
 * https://www.geeksforgeeks.org/program-check-date-valid-not/
 * https://www.javatpoint.com/string-concatenation-in-java
 */
package java_pkg_OrientObj1;

public class Teste {
	public static void main(String args[]) {
		Data data1 = new Data(10, 12, 2000);
		Data data2 = new Data(31, 11, 2000);
		testar(data1);
		testar(data2);
	}
	
	public static void testar(Data data) {
		if (data.validarData())
			System.out.println(new StringBuilder().append(data.dia).append("/").append(data.mes).append("/").append(data.ano).append(": data válida"));
		else
			System.out.println(new StringBuilder().append(data.dia).append("/").append(data.mes).append("/").append(data.ano).append(": data errada"));
	}
}
