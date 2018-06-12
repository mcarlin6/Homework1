
public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenArray[];
		evenArray = new int[100];
		int x = 1;
		int y = 0;
		while(x<=100) {
			evenArray[y] = x;
			x++;
			y++;
		}
		for(int even:evenArray) {
			if (even % 2 == 0) {
				System.out.println(even);
			}
		}
	}

}
