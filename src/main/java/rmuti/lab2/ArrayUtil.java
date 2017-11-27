package rmuti.lab2;

public class ArrayUtil {

	private int arrField[];
	private int sumArray = 0;

	public ArrayUtil(int arr[]) {
		arrField = arr;
	}

	public int sumArray() {
			sumArray=0;
		for (int i = 0; i < arrField.length; i++) {
			sumArray += arrField[i];
		}
		return sumArray;
	}

	public int countOne() {
		int counter = 0;
		for (int i = 0; i < arrField.length; i++) {
			int data = arrField[i];

			if (data == 1) {
				counter++;
			}
		}
		return counter;
	}

	public int[] findOne() {
		int n = countOne();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = 1;
		}
		return arr;
	}

	public int[] doubleArray() {
		int n = countOne();
		int[] arr2 = new int[n * 2];
		for (int i = 0; i < n * 2; i++) {
			arr2[i] = 1;
		}
		return arr2;
	}

}
