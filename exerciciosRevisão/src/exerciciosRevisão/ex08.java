package exerciciosRevisão;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner receba = new Scanner(System.in);

	        int[] numeros = new int[3];

	        for (int i = 0; i < 3; i++) {
	            System.out.print("Digite um número: ");
	            numeros[i] = receba.nextInt();
	        }

	        Arrays.sort(numeros);

	        System.out.println("Ordem decrescente:");
	        for (int i = 2; i >= 0; i--) {
	            System.out.println(numeros[i]);
	        }

	        receba.close();
	    }

	}


