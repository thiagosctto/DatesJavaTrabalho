package TesteAula01;
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;

public class Teste01 {
	public static void main(String[] args) {
		Agora();
	}
	
	public static void Agora() {
		Calendar hoje2 = Calendar.getInstance();
		Date hoje = new Date();
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		int horas = hoje2.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje2.get(Calendar.MINUTE);
		
		System.out.println("Hoje é "+df.format(hoje)+" e agora são "+horas+" hora(s) e "+minutos+" minuto(s)");
	}
}       