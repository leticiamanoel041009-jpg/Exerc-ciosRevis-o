package exerciciosRevisão;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);

        System.out.print("Peso: ");
        double peso = receba.nextDouble();

        System.out.print("Altura: ");
        double altura = receba.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("IMC: %.2f%n", imc);

        if (imc < 18.5)
            System.out.println("Abaixo do peso");
        else if (imc < 25)
            System.out.println("Peso ideal");
        else if (imc < 30)
            System.out.println("Levemente acima do peso");
        else if (imc < 35)
            System.out.println("Obesidade grau I");
        else if (imc < 40)
            System.out.println("Obesidade grau II");
        else
            System.out.println("Obesidade grau III");

        receba.close();
    }

	}

