import java.util.Arrays;
import java.util.HashMap;

public class SortThePeople {
    public static void main(String[] args){

        String[] names={"fff","fgg","fgf"};
        int[] arr={12,23,34};
        String[] arr=sortPeople(names,arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public String[] sortPeople(String[] names, String[] arr2) {
        HashMap<Integer,String> nameHeightMap=new HashMap<Integer,String>();
        String arr[]=new String[names.length];
        for(int i=0;i<names.length;i++){
            nameHeightMap.put(arr2[i],names[i]);
        }
        Arrays.sort(arr2);
        int k=0;
        for(int j=arr2.length-1;j>=0;j--){
            arr[k]=nameHeightMap.get(arr2[j]);
            k++;
        }
        return arr;
    }
}
