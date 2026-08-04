package exerciciosRevisão;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner RECEBA = new Scanner(System.in);

        int a, b, aux;

        System.out.print("Digite o valor de A: ");
        a = RECEBA.nextInt();

        System.out.print("Digite o valor de B: ");
        b = RECEBA.nextInt();

        aux = a;
        a = b;
        b = aux;

        System.out.println("Novo valor de A: " + a);
        System.out.println("Novo valor de B: " + b);

        RECEBA.close();
    }


	}

