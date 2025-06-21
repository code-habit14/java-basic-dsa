public class PracticeQuestion {

    public static int printNumbers(int arr[][], int key ){
        int count=0;
        int rows= arr.length;
        int cols= arr[0].length;
        for(int i=0; i<rows;i++){
            for(int j=0; j<cols;j++){
                if(arr[i][j]==key){
                    count++;
                }
            }

        }
        return count;
    }

    public static int[][] transposeMatrix(int A[][]){  //TRANSPOSE MATRIX👀👀👀👀👀👀👀
        int rows= A.length;
        int cols= A[0].length;
        int B[][]=new int[cols][rows];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                B[j][i]=A[i][j];
            }
        }
        return B;
    }

    public static void printMatrix(int matrix[][]){
        for (int[] row: matrix){
            for (int value: row){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }

    public static void transposeMat(int[][]A){
        for (int i=0; i<3;i++){
            for (int j=i+1; j<3;j++){
                int temp= A[i][j];
                A[i][j]= A[j][i];
                A[j][i]=temp;
            }
        }
    }

    public static float shortPath(String path){
        int x=0,y=0;
        for (int i=0; i< path.length(); i++){
            char dir= path.charAt(i);
            if (dir=='S'){
                y--;
            } else if (dir=='N') {
                y++;
            } else if (dir=='E') {
                x++;
            }else {
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float) Math.sqrt(x2+y2);

    }

    public static void printDec(int n){
        if(n==1){
            System.out.print(n +" ");
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        int fnm1= factorial(n-1);
        int fn=n*fnm1;
        return fn;
    }



    public static void main(String[] args){
        int arr[][]= { {4,7,8},{8,8,7} };
        int key=7;
        int result=printNumbers(arr, key);
        System.out.println("Count of key " + key + " is: " + result);

        System.out.println("----------------------------");
        //TRANSPOSE MATRIX👍👍👍👍👍👍👍
        int A[][]={ {1, 2, 3}, {4, 5, 6} };
        System.out.println("orignal matrix");
        printMatrix(A);

        int[][] transposed= transposeMatrix(A);
        System.out.println("Transposed Matrix");
        printMatrix(transposed);
        System.out.println("----------------------------");
        //TRANSPOSE 3*3 MATRIX👍👍👍👍👍👍👍
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("orignal matrix");
        printMatrix(matrix1);

       transposeMat(matrix1);
        System.out.println("Transposed Matrix");
        printMatrix(matrix1);
System.out.println("----------------------------");
        String path="NSE";
       System.out.print("Shortest path is: "+ shortPath(path));

        System.out.println("----------------------------");
        System.out.print("nikita".equals("nikku"));

        System.out.println("----------------------------");
        printDec(10);//recursion👀👀👀👀👀👀
        System.out.println("----------------------------");
       System.out.println("factorial "+ factorial(5));// factorial



    }
}
