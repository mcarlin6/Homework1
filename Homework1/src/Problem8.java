import java.lang.*;
import java.io.*;
import java.util.*;
public class Problem8 {

    public static void isPalindrome(){
        ArrayList<String> words = new ArrayList<String>(){{
		    add("karan");
		    add("madam");
		    add("tom");
		    add("civic");
		    add("radar");
		    add("sexes");
		    add("jimmy");
		    add("kayak");
		    add("john");
		    add("refer");
		    add("billy");
		    add("did");
		    }};
	    System.out.println("full array: "+words);
        ArrayList<String> palindromes = new ArrayList<String>();
        
        String word1 = new String();
        String word2 = new String();
        
        
        int x = 0;
        while(x<words.size()){
            word1 = words.get(x);
            word2 = words.get(x);
            
            byte [] strAsByteArray = word1.getBytes();
 
            byte [] result = new byte [strAsByteArray.length];
 
            // Store result in reverse order into the
            // result byte[]
            for (int i = 0; i<strAsByteArray.length; i++)
                result[i] = strAsByteArray[strAsByteArray.length-i-1];
 
            String reverseWord = new String(result);
            if (Objects.equals(word1, reverseWord)){
                //System.out.println(new String(result));
                palindromes.add(reverseWord);
            }
            
            //System.out.println(new String(result));
            
            x++;
        }
        System.out.println("only the palindromes: "+palindromes);
        
   }	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome();
	}

}
