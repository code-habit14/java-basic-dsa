import java.security.PublicKey;
import java.util.Scanner;

public class pattern {

    //INVERSE & ROTATRD HALF PYRAMID👍👍👍👍👍👍👍
    public static void inverted_rotated_half_pyramid(int n){
        for (int i=1;i<=n;i++){ //OUTER LOOP
            for (int j=1;j<=n-i;j++){  //INNER LOOP 1 FOR PRINT SPACES
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //INVERTED HALF PYRAMID WITH NUMBERS👍👍👍👍👍
    public static void inverted_half_pyramid(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //HOLLOW RHOMBUS👍👍👍👍👍👍👍
    public static void hollow_rhombus(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                if (i==1 ||i==n ||j==1||j==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //DIAMOND PATTERN👍👍👍👍👍👍👍👍
    public static void diamond_pattern(int n){
        for (int i=1;i<=n;i++){
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void trappedWater(int height[]){
        int leftMax[]= new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

    }




    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        inverted_rotated_half_pyramid(6);
        inverted_half_pyramid(6);
        hollow_rhombus(10);
        diamond_pattern(4);

        int height[]={4,2,0,6,3,2,5};




    }

}
