package tarefas;

//Algoritimo de ordenação Bubble sort
public class Tarefa002 {
	static void ordenacaoBubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 3, 2, 4, 7, 1, 0, 6 };
		ordenacaoBubbleSort(arr);
		System.out.println("Array após a ordenação");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
