import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Promblem20 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\Maggie\\Documents\\Data.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		ArrayList<String> stringArray = new ArrayList<String>();
		
		String st;
		while ((st = br.readLine()) != null)
			stringArray.add(st);
		
		//for (int i=0;i<3; i++) {
			//System.out.println(stringArray.get(i));
		//}
		String mickeyString = new String();
		mickeyString = stringArray.get(0);
		String[] items = mickeyString.split(":");
		System.out.println("name: "+items[0]+ " "+items[1]);
		System.out.println("age: "+items[2]);
		System.out.println("state: "+items[3]);
		
	}


}