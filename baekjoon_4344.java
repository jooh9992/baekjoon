import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		int[] arr;
		double sum=0;
		
		for(int i=0; i<testcase; i++) {
			int N = sc.nextInt();
			
			arr = new int[N];
			
			for(int j=0; j<N; j++) {
				int val = sc.nextInt();	// 성적 입력 
				arr[j] = val;
				sum += val;	// 성적 누적 합 
			}
			double mean = (sum/N);
			double count = 0;
			
			for(int j=0; j<N; j++) {
				if(arr[j]> mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count/N)*100);
			
		}
		
		
	}

}
