import java.lang.*;
import java.util.*;
import java.util.Date;
public class Problem14 {
	
	public static void switchCase(int x){
        switch (x) 
        {
            case 1:  
                    double y = 100;
                    y = Math.sqrt(y);
                    System.out.println(y);
                     break;
            case 2:  
                    Date date = new Date();
                    System.out.println(date.toString());
                    break;
            default: 
                    String str = new String("I am learning Core Java");
                    String arr[]= str.split(" ", 5);
                    System.out.println(Arrays.toString(arr));
                    break;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switchCase(1);
        switchCase(2);
        switchCase(0);
	}

}
