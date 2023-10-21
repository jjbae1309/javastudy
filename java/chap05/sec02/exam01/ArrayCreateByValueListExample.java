package chap05.sec02.exam01;

public class ArrayCreateByValueListExample {
	public static void main(String[] args) {
		int[] scores = new int[100];
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = (int)(Math.random() * 100) + 1;
			System.out.println("scores[" + i + "] : " + scores[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("ÃÑÇÕ : " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("Æò±Õ : " + avg);
	}
}
