package exerciciosRevisão;

public class ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner RECEBA = new Scanner(System.in);

	        int a, b;
	        int quociente, resto;

	        System.out.print("Digite o valor de A: ");
	        a = RECEBA.nextInt();

	        System.out.print("Digite o valor de B: ");
	        b = RECEBA.nextInt();

	        quociente = a / b;
	        resto = a % b;

	        System.out.println("Quociente: " + quociente);
	        System.out.println("Resto: " + resto);

	        RECEBA.close();
	    }

	}


