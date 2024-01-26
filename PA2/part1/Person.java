package pa2;
import java.util.Comparator;

public class Person implements Comparable <Person> {
	private String name;
	private String surname;
	private long id;
	
	public Person(String name, String surname, long id) {
		this.name=name;
		this.surname=surname;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	
	public long getId() {
		return id;
	}

	@Override
	public int compareTo(Person o) {
		return Long.compare(o.id, this.id);
	}
	 @Override
	    public String toString() {
	        return "Person{" +
	                "name='" + name + '\'' +
	                ", surname='" + surname + '\'' +
	                ", id=" + id +
	                '}';
	    }
	
	public static void mergeSortDes(Person[] arr) {
		Comparable[] temp = new Comparable[arr.length];
		mergeSortDes(arr,temp,0,arr.length-1);
	}
	private static void mergeSortDes(Person[] arr, Comparable[] temp, int left, int right) {
		if(left<right) {
			int mid= left + (right-left)/2;
			
			mergeSortDes(arr,temp,left,mid);
			mergeSortDes(arr,temp,mid+1,right);
			
			mergeDes(arr,temp,left,mid,right);
		}
	}
	
	private static void mergeDes(Person[]arr, Comparable[] temp, int left, int mid, int right) {
		for(int i=left; i<=right; i++) {
			temp[i]=arr[i];
		}
		int i=left;
		int j= mid +1;
		int k= left;
		
		while(i<=mid && j<=right) {
			if(((Person) temp[i]).compareTo((Person) temp[j]) >= 0){
				arr[k++]= (Person) temp[i++];
			}else {
				arr[k++]= (Person) temp[j++];
			}
		}
		
		while(i<=mid) {
			arr[k++]= (Person) temp[i++];
		}
	}
	 public static void mergeSort(Person[] arr, Comparator<Person> comparator) {
	        Comparable[] temp = new Comparable[arr.length];
	        mergeSort(arr, temp, 0, arr.length - 1, comparator);
	    }

	    private static void mergeSort(Person[] arr, Comparable[] temp, int left, int right, Comparator<Person> comparator) {
	        if (left < right) {
	            int mid = left + (right - left) / 2;

	            mergeSort(arr, temp, left, mid, comparator);
	            mergeSort(arr, temp, mid + 1, right, comparator);

	            merge(arr, temp, left, mid, right, comparator);
	        }
	    }

	    private static void merge(Person[] arr, Comparable[] temp, int left, int mid, int right, Comparator<Person> comparator) {
	        for (int i = left; i <= right; i++) {
	            temp[i] = arr[i];
	        }

	        int i = left;
	        int j = mid + 1;
	        int k = left;

	        while (i <= mid && j <= right) {
	            if (comparator.compare((Person) temp[i], (Person) temp[j]) >= 0) {
	                arr[k++] = (Person) temp[i++];
	            } else {
	                arr[k++] = (Person) temp[j++];
	            }
	        }

	        while (i <= mid) {
	            arr[k++] = (Person) temp[i++];
	        }
	    }
	    
	    public static void quickSortDes(Person[]arr) {
	    	quickSortDes(arr,0,arr.length-1);
	    }
	    
	    private static void quickSortDes(Person []arr, int low, int high) {
	    	if(low<high) {
	    		int piv= partitionDes(arr,low,high);
	    		
	    		quickSortDes(arr,low,piv-1);
	    		quickSortDes(arr,piv+1,high);
	    	}
	    }
	    
	    private static int partitionDes(Person[] arr,int low, int high) {
	    	Person pivot=arr[high];
	    	int i=low-1;
	    	
	    	for(int j=low; j<high; j++) {
	    		if(arr[j].compareTo(pivot)>=0) {
	    			i++;
	    			
	    			Person temp=arr[i];
	    			arr[i]=arr[j];
	    			arr[j]=temp;
	    		}
	    	}
	    	Person temp= arr[i+1];
	    	arr[i+1]= arr[high];
	    	arr[high]= temp;
	    	
	    	return i+1;
	    	
	    	
	    }
	    
	    public static void quickSort(Person[]arr, Comparator<Person> comparator) {
	    	quickSort(arr,0,arr.length-1,comparator);
	    }
	    private static void quickSort(Person[] arr, int low, int high, Comparator<Person> comparator) {
	        if (low < high) {
	            int piv = partition(arr, low, high, comparator);

	            quickSort(arr, low, piv - 1, comparator);
	            quickSort(arr, piv + 1, high, comparator);
	        }
	    }

	    private static int partition(Person[] arr, int low, int high, Comparator<Person> comparator) {
	        Person pivot = arr[high];
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (comparator.compare(arr[j], pivot) >= 0) {
	                i++;

	                Person temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        Person temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
	    }
	
	
	
	
	
	
	

}
