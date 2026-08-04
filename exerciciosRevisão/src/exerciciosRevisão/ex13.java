package exerciciosRevisão;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner RECEBA = new Scanner(System.in);

	        String nome;
	        int idade;

	        System.out.print("Digite o nome: ");
	        nome = RECEBA.nextLine();

	        System.out.print("Digite a idade: ");
	        idade = RECEBA.nextInt();

	        System.out.println("Nome: " + nome);

	        if (idade >= 18) {
	            System.out.println("Maior de idade.");
	        } else {
	            System.out.println("Menor de idade.");
	        }

	        RECEBA.close();
	    }

	}

