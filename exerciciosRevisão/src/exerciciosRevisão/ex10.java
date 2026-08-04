package exerciciosRevisão;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner RECEBA = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = RECEBA.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = RECEBA.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = RECEBA.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média: " + media);

        RECEBA.close();
    }		

	}

