
public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] items;
		items = new String[4];
		items[0] = "0";
		items[1] = "10";
		items[2] = "101";
		items[3] = "0101";
		
		int x = 0;
		int y = 4;
		while(x<y) {
			System.out.println(items[x]);
			x++;
		}
	}

}
