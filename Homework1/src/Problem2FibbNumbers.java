
public class Problem2FibbNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fibbArray;
		fibbArray = new int[25];
		fibbArray[0] = 0;
		fibbArray[1] = 1;
		int x = 2;
		System.out.println(fibbArray[0]);
		System.out.println(fibbArray[1]);
		while(x<25) {
			fibbArray[x] = fibbArray[x-2]+fibbArray[x-1];
			System.out.println(fibbArray[x]);
			x++;
		}
	}

}
