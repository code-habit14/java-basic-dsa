public class sorting {

    public static void bubblesort(int arr[]){
        for(int turn=0; turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            int smallIndex = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[smallIndex]){
                    smallIndex = j;
                }
            }
            //swap
            int temp= arr[smallIndex];
            arr[smallIndex]= arr[i];
            arr[i]=temp;
        }
    }

    public static void insertionSort(int arr[]){
        for (int i=1;i<arr.length;i++){
            int curr = arr[i];
            int pre= i-1;
            while (pre>=0 && arr[pre]>curr){
                arr[pre+1]=arr[pre];
                pre--;
            }
            arr[pre+1]=curr;
        }
    }

    public static void merge(int arr[],int si, int mid, int ei){
        int tempArr[]=new int[ei-si+1];
        int k=0;
        int leftArr=si;
        int rightArr=mid+1;
        while (leftArr<=mid && rightArr <=ei){
            if (arr[leftArr]<=arr[rightArr]){
                tempArr[k++]=arr[leftArr++];
            }else {
                tempArr[k++]= arr[rightArr++];
            }
        }
        while (leftArr<=mid){
            tempArr[k++]=arr[leftArr++];
        }
        while (rightArr <=ei){
            tempArr[k++]= arr[rightArr++];
        }
        for (int i=0, j=si;i<tempArr.length;i++,j++){
            arr[j]=tempArr[i];
        }
    }

    public static void mergeSort(int arr[],int si,int ei){
        if (si<ei) {
            int mid = si + (ei - si) / 2;
            mergeSort(arr, si, mid);
            mergeSort(arr, mid + 1, ei);
            merge(arr, si, mid, ei);
        }
    }

    public static int partition(int arr[], int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for (int j=low;j<high;j++){
            if (arr[j] < pivot){
                i++;
                //SWAP
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        //SWAP PIVOT ELEMENT
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int arr[],int low,int high){
        if (low<high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }





    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i] );
        }
        System.out.println( );
    }


    public static void main(String[] args){
        int arr[]= {3,45,67,2,6};
//        bubblesort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
//        mergeSort(arr,0,arr.length-1);
        quickSort(arr,0,arr.length-1);

        print(arr);

    }
}
