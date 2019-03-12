/*
 * https://www.geeksforgeeks.org/program-check-date-valid-not/
 */
package java_pkg_OrientObj1;

public class Data {
	static final int MAX_VALID_YR = 9999;
	static final int MIN_VALID_YR = 1800;

	// campos do objeto, da instancia que vai ser criada
	// campos do objeto sao tb chamados de variaveis de instancia
	int dia;
	int mes;
	int ano;
	
	// inicializar na construtora
	public Data(int dia, int mes, int ano) {
		
		if (! dataValida(dia, mes, ano)) {
			System.out.println(dia + "/" + mes + "/" + ano + ": " +"Não é data! Abortar construção do Objeto");
			System.out.println("");
		}     
					// implemente "IllegalArgumentException"

		// inicializacao soh acontece se a data for valida
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	public boolean validarData() {
		return dataValida(dia, mes, ano);
	}
	
	private boolean dataValida(int dia, int mes, int ano) {
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

	public boolean ehFeriado() {
		return true;            // implemente
	}

	public String diaDaSemana() {
		return new String();
	}

	public boolean anoEhBissexto(int year) {
		// Return true if year is
		// a multiple of 4 and not
		// multiple of 100.
		// OR year is multiple of 400.
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
	}
}
