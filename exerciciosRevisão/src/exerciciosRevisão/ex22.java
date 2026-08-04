package exerciciosRevisão;

public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner RECEBA = new Scanner(System.in);

        double tempo;
        double velocidade;
        double distancia;
        double litros;

        System.out.print("Digite o tempo da viagem (horas): ");
        tempo = RECEBA.nextDouble();

        System.out.print("Digite a velocidade média (km/h): ");
        velocidade = RECEBA.nextDouble();

        distancia = tempo * velocidade;
        litros = distancia / 12;

        System.out.println("Tempo da viagem: " + tempo + " horas");
        System.out.println("Velocidade média: " + velocidade + " km/h");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Litros gastos: " + litros + " litros");

        RECEBA.close();
    }

	}

