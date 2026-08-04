package exerciciosRevisão;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner RECEBA = new Scanner(System.in);

	        double fahrenheit, celsius;

	        System.out.print("Digite a temperatura em Fahrenheit: ");
	        fahrenheit = RECEBA.nextDouble();

	        celsius = (5 * (fahrenheit - 32)) / 9;

	        System.out.println("Fahrenheit: " + fahrenheit);
	        System.out.println("Celsius: " + celsius);

	        RECEBA.close();
	    }


	}

