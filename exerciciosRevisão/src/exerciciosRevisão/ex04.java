package exerciciosRevisão;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner receba = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = receba.nextInt();

	        System.out.println("Antecessor: " + (numero - 1));
	        System.out.println("Sucessor: " + (numero + 1));

	        receba.close();
		

	}

}
