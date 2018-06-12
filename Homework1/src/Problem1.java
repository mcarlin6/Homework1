
public class Problem1 {
	
	void bubbleSort(int unsortedArray[]) {
		int n =unsortedArray.length;
		for (int i = 0;i<n-1;i++)
			for (int j = 0;j<n-1-1;j++)
				if (unsortedArray[j]>unsortedArray[j+1]) {
					int k = unsortedArray[j];
					unsortedArray[j] = unsortedArray[j+1];
					unsortedArray[j+1] = k;
				}
	}
	
	void printArray(int unsortedArray[]) {
		int n = unsortedArray.length;
		for (int i=0;i<n;++i) {
			System.out.print(unsortedArray[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem1 ob = new Problem1();
		int unsortedArray[] = {1,0,5,6,3,2,3,7,9,8,4};
		ob.bubbleSort(unsortedArray);
		ob.printArray(unsortedArray);

	}

}
