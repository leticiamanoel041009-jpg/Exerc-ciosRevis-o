package exerciciosRevisão;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba= new Scanner(System.in);

        System.out.print("Primeiro valor (true/false): ");
        boolean a = receba.nextBoolean();

        System.out.print("Segundo valor (true/false): ");
        boolean b = receba.nextBoolean();

        if (a && b) {
            System.out.println("Ambos são VERDADEIROS.");
        } else {
            System.out.println("Pelo menos um é FALSO.");
        }

        receba.close();

	}

}
