public class SelectionSort {
    public static void main(String[] args){
        int arr[]={12,33,43,2,35,77};

        for(int i=arr.length-1;i>=0;i--){
            int largest=0;
            for(int j=1;j<=i;j++){
                if(arr[largest]<arr[j])
                    largest=j;
            }
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
        }
        
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+ " ");
        }
    }
}
