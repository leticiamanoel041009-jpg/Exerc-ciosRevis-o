package exerciciosRevisão;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner receba = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = receba.nextInt();

	        if (numero % 2 == 0) {
	            System.out.println("Par");
	        } else {
	            System.out.println("Ímpar");
	        }

	        if (numero >= 0) {
	            System.out.println("Positivo");
	        } else {
	            System.out.println("Negativo");
	        }

	        receba.close();
	    }


	}

