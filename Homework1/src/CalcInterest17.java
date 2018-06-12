import java.util.Scanner;
public class CalcInterest17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p, r, t;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = s.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = s.nextFloat();
        System.out.print("Enter the Time period : ");
        t = s.nextFloat();
        float interest;
        //gets each variable through the scanner class and then calculates it
        interest = (r * t * p);
        System.out.print("Interest = " + interest);
	}

}
