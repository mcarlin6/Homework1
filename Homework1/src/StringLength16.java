import java.util.Scanner;

public class StringLength16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = new String();
		int stringLength;
        Scanner s = new Scanner(System.in);
        System.out.print("please enter some text : ");
        inputString = s.nextLine();
		
        stringLength = inputString.length();
        
        System.out.println("this string is "+stringLength+" characters long.");
	}

}
