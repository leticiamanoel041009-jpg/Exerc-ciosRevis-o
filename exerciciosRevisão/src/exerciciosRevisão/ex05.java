package exerciciosRevisão;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);

        final double SALARIO_MINIMO = 1621.00;

        System.out.print("Digite o salário: ");
        double salario = receba.nextDouble();

        double quantidade = salario / SALARIO_MINIMO;

        System.out.printf("O usuário recebe %.2f salários mínimos.%n", quantidade);

        receba.close();
    }
		

	}

}
