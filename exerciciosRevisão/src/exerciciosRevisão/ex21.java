package exerciciosRevisão;

public class ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner RECEBA = new Scanner(System.in);

		        double valorHora;
		        int aulas;
		        double salarioBruto;
		        double salarioLiquido;
		        double desconto;

		        System.out.print("Digite o valor da hora/aula: ");
		        valorHora = RECEBA.nextDouble();

		        System.out.print("Digite o número de aulas: ");
		        aulas = RECEBA.nextInt();

		        salarioBruto = valorHora * aulas;

		        if (salarioBruto <= 1621.00) {
		            desconto = (salarioBruto * 7.5) / 100;
		        } else if (salarioBruto <= 2902.84) {
		            desconto = (salarioBruto * 9) / 100 - 24.32;
		        } else if (salarioBruto <= 4354.27) {
		            desconto = (salarioBruto * 12) / 100 - 111.40;
		        } else {
		            desconto = (salarioBruto * 14) / 100 - 198.49;
		        }

		        salarioLiquido = salarioBruto - desconto;

		        System.out.println("Salário Bruto: R$ " + salarioBruto);
		        System.out.println("Desconto INSS: R$ " + desconto);
		        System.out.println("Salário Líquido: R$ " + salarioLiquido);

		        RECEBA.close();
		    }


	}


