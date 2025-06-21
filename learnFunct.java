import java.util.Scanner;




public class learnFunct {
    //FUNCTIONS KO HAMESHA ISS BLOCK K ANDR HI LIKHNA HOGA VRNA ACCESS NEHI HOGA❌❌👍👍👍

    public static int factorial(int n){ //FACTORIAL FUNCTION👍👍👍👍
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int bincoeff(int n,int r){ //FUNCTION FOR BINARY COEFFICIENT👍👍👍
        int fn= factorial(n);
        int fr= factorial(r);
        int fact_nr=factorial(n-r);
        int bincoeff=fn/(fr*fact_nr);
        return bincoeff;
    }
    public static boolean isPrime(int n){
        boolean isprime=true;
        for(int i=2;i<=n-1;i++){
            if(n%2==0){
                isprime=false;
            }
        }
        return isprime;
    }
    public static void primeInRange(int n){
        for (int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i +" ");
            }
        }
        System.out.println();
    }

    public static int binarsearch(int num[], int key){
        int start=0;
        int end=num.length-1;
        while (start<=end){
            int mid= (start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }

    public static void pair(int num[]){
        for (int i=0; i<num.length;i++){
            int count=num[i];
            for (int j=i+1;j<num.length;j++){
                System.out.println("(" +count +"," +num[j] +")");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int a= factorial(5);
//        System.out.println(a);
      /*  System.out.println( bincoeff(4,2));
        System.out.println(isPrime(3));
        primeInRange(16);*/
      /*  int num[]= {1,2,3,4,5,6,7,8,9,10};
        int print= binarsearch(num,1);
        System.out.println(print);*/
        int num[]={2,34,5,6,7,};
        pair(num);




    }
}

