package exerciciosRevisão;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner RECEBA = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = RECEBA.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(numero + " x " + i + " = " + (numero * i));

        }

        RECEBA.close();
    }

	}

