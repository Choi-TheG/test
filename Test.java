package practice1;

public class Test {
	public static void main(String[] args) {
		int[] scores = { 82, 90, 77 };
		
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
		}
		System.out.println("sum: "+sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("avg: "+avg);
	}
}
