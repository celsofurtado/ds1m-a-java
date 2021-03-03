package conversor_temperatura;

public class ConversorCelsiusParaFahrenheit {
	
	public static void main(String[] args) {
		
		double celsius = 35.0;
		double fahrenheint;
		
		fahrenheint = (9 * celsius + 160) / 5;
		
		System.out.println(celsius + " graus celsius equivale a " + fahrenheint + " graus fahrenheit");
		System.out.println(celsius + " " + fahrenheint);
		
	}

}
