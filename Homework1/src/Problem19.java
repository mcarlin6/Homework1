import java.util.*;
public class Problem19 {
	
	public static void numList(){
        List<Integer> numbers = new ArrayList<Integer>();
        int x=1;
        while(x<=10){
            numbers.add(x);
            x++;
        }
        System.out.println("here is the full list of numbers");
        System.out.println(numbers);
        
        int evenResult = 0, oddResult = 0;
        int start = 0;
        
        while (start<10){
            if (numbers.get(start)%2==0){
                evenResult = evenResult + numbers.get(start);
            } else{
                oddResult = oddResult + numbers.get(start);
            } 
            start++;
        }
        System.out.println("the odds add up to: "+oddResult);
        System.out.println("the evens add up to: "+evenResult);
        
        int start2 = 0;
        int end2 = 10;
        while (start2<end2){
            if (numbers.get(start2) == 1){
                numbers.remove(start2);
                end2--;
            } 
            if (numbers.get(start2) == 2){
                numbers.remove(start2);
                end2--;
            } 
            if (numbers.get(start2) == 3){
                numbers.remove(start2);
                end2--;
            } 
            if (numbers.get(start2) == 5){
                numbers.remove(start2);
                end2--;
            } if (numbers.get(start2) == 7){
                numbers.remove(start2);
                end2--;
            } 
            start2++;
        }
        System.out.println("here is the array list now: "+numbers);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numList();
	}

}
