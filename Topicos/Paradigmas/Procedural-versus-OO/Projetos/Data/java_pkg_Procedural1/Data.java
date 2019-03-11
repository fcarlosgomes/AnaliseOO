/*
 * https://www.geeksforgeeks.org/program-check-date-valid-not/
 */
package java_pkg_Procedural1;

public class Data {
	static int MAX_VALID_YR = 9999;
	static int MIN_VALID_YR = 1800;

	static public boolean validarData(int dia, int mes, int ano) {

		// If year, month and day
		// are not in given range
		if (ano > MAX_VALID_YR || ano < MIN_VALID_YR)
			return false;
		if (mes < 1 || mes > 12)
			return false;
		if (dia < 1 || dia > 31)
			return false;

		// Handle February month
		// with leap year
		if (mes == 2) {
			if (anoEhBissexto(ano))
				return (dia <= 29);
			else
				return (dia <= 28);
		}

		// Months of April, June,
		// Sept and Nov must have
		// number of days less than
		// or equal to 30.
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			return (dia <= 30);

		return true;

	}

	static public boolean ehFeriado() {
		return true;
	}

	static public String diaDaSemana() {
		return new String();
	}

	static boolean anoEhBissexto(int year) {
		// Return true if year is
		// a multiple of 4 and not
		// multiple of 100.
		// OR year is multiple of 400.
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
	}
}
