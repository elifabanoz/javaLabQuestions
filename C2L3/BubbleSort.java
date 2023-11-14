package bubble;

public class BubbleSort {

	public static void main(String[] args) {
		
			int testArray[] = { 4, 12, 3, 26, 18, 1, 55 };
			int testArray2[]= { 1, 0, 4, 6 ,8,9};
			BubbleSort( testArray, false );
			BubbleSort(testArray2, true);
			
			for( int i : testArray ){
			System.out.print( i + " " );
			}
			System.out.println();
			// should print 1 3 4 12 18 26 55
			
			for( int i : testArray2 ){
				System.out.print( i + " " );
				}
				// should print 9 8 6 4 1 0
				
			}
	
			public static void BubbleSort( int[] arr, boolean reverse ){
			int n= arr.length;
			for(int i=0; i<n; i++) {
				for(int k=0; k<n-1; k++) {
					if(!reverse) {
						if(arr[k]>arr[k+1]) {
							int temp= arr[k];
							arr[k]=arr[k+1];
							arr[k+1]=temp;
						}
					}else {
						if(arr[k]<arr[k+1]) {
							int temp= arr[k];
							arr[k]= arr[k+1];
							arr[k+1]= temp;
						}
					}
					
				}
			}
			}

	}


