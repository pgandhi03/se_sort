
public class Sort_not_recursive {
	
	static void sort(int[] ab) {
		int n = ab.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (ab[j] > ab[j+1])
                {
                	
                    int temp = ab[j];
                    ab[j] = ab[j+1];
                    ab[j+1] = temp;
                }
		for(int i=0;i<n;i++) {
			System.out.println(ab[i] + "  ");
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,8,3,2,21,67,9};
		sort(arr);
		

	}

}
