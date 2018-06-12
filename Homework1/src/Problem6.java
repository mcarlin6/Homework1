
public class Problem6 {
	public static void isEven(int n) {
		int tempValue = n;
		tempValue = tempValue/2;
		tempValue = tempValue*2;
		if (tempValue == n) {
			System.out.println(n+" is an even number");
		} else System.out.println(n+" is an odd number");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isEven(6);
	}

}
