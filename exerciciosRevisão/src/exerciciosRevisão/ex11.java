package exerciciosRevisão;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner RECEBA = new Scanner(System.in);

        String nome;
        double nota1, nota2, nota3, nota4, media;

        System.out.print("Digite o nome do aluno: ");
        nome = RECEBA.nextLine();

        System.out.print("Digite a primeira nota: ");
        nota1 = RECEBA.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = RECEBA.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = RECEBA.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nota4 = RECEBA.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        RECEBA.close();
    }

	}


