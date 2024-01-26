import java.util.HashMap;
public class HashMapOp {
    public static boolean checkAnagrams(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        HashMap<Character,Integer> map= new HashMap<Character,Integer>();
        for(char ch: str1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch: str2.toCharArray()){
            if(!map.containsKey(ch)|| map.get(ch)<=0){
                return false;
            }
            map.put(ch,map.get(ch)-1);
        }
        return true;
    }
    public static void findSum(int [] arr, int x){
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int num:arr){
            int complement = x-num;
            if(map.containsKey(complement)){
                System.out.println(num + " and " +complement);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
    }
    public static boolean isSubsetOf(int[] arr1, int[] arr2){
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int num:arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:arr2){
            if(!map.containsKey(num)|| map.get(num)<=0){
                return false;
            }
            map.put(num,map.get(num)-1);
        }
        return true;
    }
    public static void main(String[] args){
        String str1="CAT";
        String str2= "ACT";
        System.out.println("Are  " + str1 + " and " + str2 + " anagrams?\n"
        + checkAnagrams(str1,str2));

        int arr[]={6,3,7,9,8,1,2,4};
        int x=6;
        System.out.println("Element that gives the sum:" +x+ " :");
        findSum(arr,x );

        int A[]={1,2,3,4,5};
        int B1[]={4,1,2};
        int B2[]={2,2};
        System.out.println("Is B1 a subset of A?\n" + isSubsetOf(A,B1));
        System.out.println("Is B2 a subset of A?\n" +isSubsetOf(A,B2));

    }
}
