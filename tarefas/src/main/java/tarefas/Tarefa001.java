package tarefas;

import java.math.BigDecimal;

//Votos em relação ao total de eleitores
public class Tarefa001 {

	public static void main(String[] args) {
		Tarefa001 tarefa = new Tarefa001();
		BigDecimal totalEleitores = new BigDecimal(1000);
		BigDecimal totalVotosValidos = new BigDecimal(800);
		BigDecimal totalVotosBrancos = new BigDecimal(150);
		BigDecimal totalVotosNulos = new BigDecimal(50);
		System.out.println("Resultado");
		System.out.println(
				"Total de votos validos: " + tarefa.totalVotosValidos(totalEleitores, totalVotosValidos) + "%");
		System.out.println("Total de votos nulos: " + tarefa.totalVotosValidos(totalEleitores, totalVotosNulos) + "%");
		System.out.println(
				"Total de votos brancos: " + tarefa.totalVotosValidos(totalEleitores, totalVotosBrancos) + "%");
	}

	public BigDecimal totalVotosValidos(BigDecimal totalDeVotos, BigDecimal totalVotosValidos) {
		return porcentagem(totalDeVotos, totalVotosValidos);
	}

	private static BigDecimal porcentagem(BigDecimal total, BigDecimal totalEncontrado) {
		return totalEncontrado.divide(total).multiply(new BigDecimal(100));
	}

}
