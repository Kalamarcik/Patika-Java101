public class HelperArray {



    void toString(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print(",");
        }
        System.out.println("]");
    }


    static int[] fill(int[] arr, int value){
        for (int i=0;i<arr.length;i++){
            arr[i]= value;
        }
        return arr;
    }

    static int[] fill(int[] arr,int fromIndex,int toIndex,int value){
        for(int i=fromIndex;i<toIndex;i++){
            arr[i]=value;
        }
        return arr;
    }

    static void sort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int min = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    
}
