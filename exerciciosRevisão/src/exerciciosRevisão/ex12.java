package exerciciosRevisão;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner RECEBA = new Scanner(System.in);

	        double valor, total;
	        int opcao;

	        System.out.print("Digite o valor do produto: ");
	        valor = RECEBA.nextDouble();

	        System.out.println("\nEscolha a forma de pagamento:");
	        System.out.println("1 - À vista em dinheiro ou Pix");
	        System.out.println("2 - À vista no cartão");
	        System.out.println("3 - Cartão em 2x");
	        System.out.println("4 - Cartão em 3x ou mais");

	        opcao = RECEBA.nextInt();

	        switch (opcao) {

	            case 1:
	                total = valor - (valor * 0.15);
	                break;

	            case 2:
	                total = valor - (valor * 0.10);
	                break;

	            case 3:
	                total = valor;
	                break;

	            case 4:
	                total = valor + (valor * 0.10);
	                break;

	            default:
	                System.out.println("Opção inválida.");
	                RECEBA.close();
	                return;
	        }

	        System.out.println("Valor final: R$ " + total);

	        RECEBA.close();
	    }

	}

