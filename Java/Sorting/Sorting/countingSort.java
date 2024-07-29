public class countingSort {
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        //update count
        int countArr[]=new int[largest + 1];
        for (int i = 0; i <arr.length; i++) {
            countArr[arr[i]]++;
        }
        //sorting
        int j=0;
        for (int i = 0; i <countArr.length; i++) {
            while (countArr[i]>0){
                arr[j]=i;
                j++;
                countArr[i]--;
            }
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,4,3,7};
        countingSort(arr);
    }
}
