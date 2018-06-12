
public class SuperClass18 {
	
	public static void findCaps(String str){
		int capCount = 0;
		for(int i=str.length()-1; i>=0; i--) {
			if(Character.isUpperCase(str.charAt(i))) {
				//System.out.println("capital letter present");
				//i=i-str.length();
				capCount = capCount+1;
	        } 
	    }
		if (capCount>0) {
			System.out.println("capital letter present");
		} else System.out.println("no capital letters");
	    
	}
	
	public static void replaceCaps(String str){
		System.out.println(str.toUpperCase());
	}
	
	public static void add10(String str){
		int result = Integer.parseInt(str);	
		result=result+10;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Matthew is cool!");

	}

}
