package exerciciosRevisão;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = receba.nextDouble();

        double reajuste = valor * 1.05;

        System.out.printf("Valor com reajuste: R$ %.2f%n", reajuste);

        receba.close();
		
	}

}
