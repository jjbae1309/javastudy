package dad01.sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = new int[5];
		array[0] = 15;
		array[1] = 11;
		array[2] = 10;
		array[3] = 9;
		array[4] = 8;
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j-1] > array[j]) {
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]:" + array[i]);
		}
	}
}
