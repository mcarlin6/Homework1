import java.lang.*;
public class Question15 implements Question15Interface {
	
	public void addition(int x, int y) {
		int answer = x+y;
		System.out.println(answer);
	}
	public void subtraction(int x, int y) {
		int answer = x-y;
		System.out.println(answer);
	}
	public void multiplication(int x, int y) {
		int answer = x*y;
		System.out.println(answer);
	}
	public void division(float x, float y) {
		float answer = x/y;
		System.out.println(answer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question15 answers = new Question15();
		answers.addition(1,9);
		answers.subtraction(9,1);
		answers.multiplication(3,7);
		answers.division(100, 10);
		
	}

}
