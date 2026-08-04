package exerciciosRevisão;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);

        int A, B, C;

        System.out.print("Digite A: ");
        A = receba.nextInt();

        System.out.print("Digite B: ");
        B = receba.nextInt();

        if (A == B) {
            C = A + B;
        } else {
            C = A * B;
        }

        System.out.println("C = " + C);

        receba.close();
	}

}
