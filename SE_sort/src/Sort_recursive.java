
public class Sort_recursive {

	static void recur(int[] ab, int n) {
		if(n==1) {
			return;  
		}
		
		for(int i=0;i<n-1;i++) {
			if (ab[i] > ab[i+1]) 
            { 
                int temp = ab[i]; 
                ab[i] = ab[i+1]; 
                ab[i+1] = temp; 
            } 			
		}
		
		recur(ab,n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,8,3,2,21,67,9};
		recur(arr,arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + "  ");
		}
		

	}

}
