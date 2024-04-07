package TesteAula01;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Trab {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o dia: ");
		int dia = input.nextInt();
		System.out.println("Digite o mes: ");
		int mes = input.nextInt();
		System.out.println("Digite o ano: ");
		int ano = input.nextInt();
		input.close();
		contaTempo(dia, mes, ano);
	}
	
	public static void contaTempo(int dia, int mes, int ano){
		LocalDate primeiraData = LocalDate.of(ano, mes, dia);
		LocalDate agora = LocalDate.now();		
		
		Period periodo = Period.between(agora, primeiraData);
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anos = periodo.getYears();
		
		System.out.println("Faltam "+anos+" ano(s), "+meses+" mes(es) e "+dias+" dia(s) para esta data em "+ano);
	}
}       