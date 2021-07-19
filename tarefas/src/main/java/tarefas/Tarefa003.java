package tarefas;

//Fatorial
public class Tarefa003 {

	public static void main(String[] args) {
		int numero = 6;
		System.out.println("O fatorial de " + numero + " eh: " + fatorial(numero));
	}

	public static int fatorial(int numero) {
		int fact = 1;
		for (int i = 1; i <= numero; i++) {
			fact *= i;
		}
		return fact;

	}

}
