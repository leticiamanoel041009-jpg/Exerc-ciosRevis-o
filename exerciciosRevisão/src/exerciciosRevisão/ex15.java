package exerciciosRevisão;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner RECEBA = new Scanner(System.in);

        double a, b, c;

        System.out.print("Digite o primeiro lado: ");
        a = RECEBA.nextDouble();

        System.out.print("Digite o segundo lado: ");
        b = RECEBA.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        c = RECEBA.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {

            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }

        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        RECEBA.close();
    }
}
