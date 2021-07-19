package tarefas;

import java.util.ArrayList;
import java.util.List;

//Soma dos Multiplos de 3 ou 5
public class Tarefa004 {

	public static void main(String[] args) {
		List<Double> numeros = new ArrayList<Double>();
		numeros.add(1d);
		numeros.add(2d);
		numeros.add(3d);
		numeros.add(4d);
		numeros.add(5d);
		numeros.add(6d);
		numeros.add(7d);
		numeros.add(8d);
		numeros.add(9d);

		Double totalSoma = 0d;

		for (Double numero : numeros) {
			if (ehMultiplo(numero, 3d)) {
				totalSoma += numero;
			}
			if (ehMultiplo(numero, 5d)) {
				totalSoma += numero;
			}
		}
		System.out.println("Total da Soma eh:" + totalSoma);
	}

	private static boolean ehMultiplo(Double valor, Double muliplo) {
		return valor.equals((Math.ceil(valor / muliplo) * muliplo));
	}

}
