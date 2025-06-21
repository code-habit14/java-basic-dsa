import java.util.Scanner;

public class Learningchapter1 {

    public static void main(String[] args){
        //DAY 1:- ARRAY........
        Scanner sc= new Scanner(System.in);
       /* System.out.println("Enter Array Length: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        fillArray(arr);
        printArray(arr);*/

       /* int arr2[]= new int[n+1]; //insert element at index
        insertAtIndex(arr ,arr2);
        printArray(arr2);*/

       /* int arr3[]= new int[n-1]; //DELETE ELEMENT AT INDEX
        delArray(arr,arr3);
        printArray(arr3);
        */

       /* int arr4[]={2,4,6,8,10,12};     //LINEAR SEARCH
        int index= linierSearch(arr4,6);
        if (index==-1){
            System.out.println("not found");
        }else {
            System.out.println("index is "+index);
        }*/

//        int arr5[]={1,2,3,4,5,6,7,8,9};   //BINARY SERARCHING
//        int index=binarySearch(arr5,2);
//        if (index==-1){
//            System.out.println("not found");
//        }else {
//            System.out.println("index is "+index);
//        }

     /*   int arr[][]= new int[2][2];
        twoDarr(arr);
        printTwoDarr(arr);*/


        //string...........👀👀👀👀
/*        String a1="1";
        int b1=1;
        int c1=1;
        System.out.println(a1+b1+c1);*/
//        String a= "hello Mutkoooooooo";
//        String b = "Please locate where 'locate' occurs!";
//        String c= "nikita";
//        String d= "chaurasia";
//        System.out.println(a.length());
//        System.out.println(a.toUpperCase());
//        System.out.println(a.toLowerCase());
//        System.out.println(b.indexOf("locate"));
//        System.out.println(c +" "+d);
//        System.out.println(c.concat(d));
//        String txt = "We are the so-called \"Vikings\" from the north.";

       /* int fib= fibonacci(5);
        System.out.println(fib);
        System.out.println(factorial(5));*/


        //BUBBLE SHORT ALOGORITHM👀👀👀👀👀👀👀
        int arr[]={23,4,1,3,15,10};
//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
        display(arr);













    }
    public static void insertionSort(int arr[]){
        for (int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while (j >= 0 && arr[j] > temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i=0;i<arr.length-1;i++){
            int smallIndex =i;
            for (int j=i+1; j<arr.length;j++){
                if (arr[j]<arr[smallIndex]){
                    smallIndex=j;
                }
            }
            int temp = arr[smallIndex];
            arr[smallIndex]= arr[i];
            arr[i]=temp;
        }
    }

    public static void bubbleSort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    //SWAP
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void display(int arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int factorial(int n){
        if (n==0) return 1;
        int fnm1=factorial(n-1);
        int fn= n*fnm1;
        return fn;
    }

    public static int fibonacci(int n){
        if (n==0 || n==1) return n;
        int fnm1=fibonacci(n-1);
        int fnm2= fibonacci(n-2);
        int fn= fnm1+fnm2;
        return fn;
    }

    public static void fillArray(int arr[]){
        Scanner sc= new Scanner(System.in);
        for (int i=0; i<arr.length; i++){
            System.out.print("Enter " +i +" element ");
            arr[i]= sc.nextInt();
        }

    }
    public static void printArray(int arr[]){
        System.out.println("Araray Elements are ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" " );
            System.out.println();
        }
    }

    public static void insertAtIndex(int arr[], int arr2[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter index of new value to be inserted: ");
        int index= sc.nextInt();
        System.out.println("Enter new value to be inserted ");
        int nv=sc.nextInt();
        for (int i=0; i<arr.length+1;i++){
            if(i<index){
                arr2[i]=arr[i];
            } else if (i==index) {
                arr2[i] = nv;
            }else {
                arr2[i]=arr[i-1];
            }
        }
    }

    public static void delArray(int arr[],int dArr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index you want to Delete: ");
        int index= sc.nextInt();
        for (int i=0; i<arr.length;i++){
            if (i<index){
                dArr[i]= arr[i];
            } else if (i == index) continue;
            else {
                dArr[i-1]= arr[i];
            }
        }
    }

    public static int linierSearch(int arr[],int key){
        for (int i=0; i< arr.length;i++){
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int arr[], int key){
        int startI=0;
        int endI=arr.length-1;
        while (startI<=endI){
            int mid= (startI + (endI-startI))/2;
            if (arr[mid]==key){
                return mid;
            }
            if (arr[mid]< key) {
                startI=mid+1;
            }else {
                endI=mid-1;
            }

        }
        return -1;

    }

    public static void twoDarr(int arr[][]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two D-Array element");
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length; j++){
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j]=sc.nextInt();
            }

        }
    }

    public static void printTwoDarr(int arr[][]){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }







}


