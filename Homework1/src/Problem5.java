
public class Problem5 {
	public static void substring(String str, int idx){
        String tempString = "";
        int x = 0;
        while(x<idx){
            char aChar = str.charAt(x);
            tempString = tempString + aChar;
            x++;
        }
        System.out.println(tempString);
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		substring("Matthew Carlin",7);
	}

}
