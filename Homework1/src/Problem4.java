
public class Problem4 {
	public static void factorial(int n) {
		if (n<1) {
			System.out.println("your answer must be positive");
		}
		int i, answer=1;
		for(i=1;i<=n;i++) {
			answer=answer*i;
		}
		System.out.println(answer);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial(8);
	}

}
