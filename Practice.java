
import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
//       // system.out.println("ha"); //capital S hoga..Error
//        System.out.printf("Hello and welcome!");
     /*   System.out.print("Enter your age: ");
        int age= input.nextInt();
        System.out.println("Your age is "+age);
        if(age>=18){
            System.out.println("You are eligible for vote");
        } else if (age<=0) {
            System.out.println("Please enter a valid age");
        }else {
            System.out.println("You are not eligible for vote");
        }*/

    /*    //add 2 number 👍👍👍👍👍👍
       System.out.print("Enter your first number: ");
       float num1 = input.nextFloat();
       System.out.print("Enter your second number: ");
       float num2= input.nextFloat();
       float sum= (num1 + num2);
       System.out.println(sum);
*/
      /*  //find largest number 👍👍👍👍👍👍
        int a= 15;
        int b = 24;
        int c = 76;
        if(a>b) {
            System.out.println("a is greater then b");
            if (a>c) {
                System.out.println("a is greater c");
                System.out.println("a is largest "+a);
            } else {
                System.out.println("c is greater a");
                System.out.println("c is largest "+c);
            }
        }else{
            System.out.println("b is greater then a");
            if(b>c){
                System.out.println("b is greater then c");
                System.out.println("b is greater "+b);
            }else {
                System.out.println("c is greter then b");
                System.out.println("c is greatest "+c);
            }
        }*/

    //TERMARY OPERATOR👍👍👍👍👍👍
  /*      int a=3;
        int b=4;
        int max= 0;
//        if(a>b){
//            max=a;
//        }else{
//            max=b;
//        }
        max=a>b?a:b;
        System.out.println(max);
*/

    //CALCULATER👍👍👍👍👍👍
     /*   System.out.print("Enter first number: ");
        float a= input.nextFloat();
        System.out.print("Enter second number: ");
        float b =input.nextFloat();
        while (true){
            System.out.println("\nSelect any one choice: \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Modulus \n6.Exit");
            System.out.print("Your choice is: ");
            int choice = input.nextInt();

        switch (choice) {
            case 1:
                float sum = a + b;
                System.out.println("Sum of two number is " + sum);
                break;
            case 2:
                float sub = a - b;
                System.out.println("Subtraction of two number is " + sub);
                break;
            case 3:
                float mult = a * b;
                System.out.println("Multiplication of two number is " + mult);
                break;
            case 4:
                float div = a / b;
                System.out.println("Division of two number is " + div);
                break;
            case 5:
                float mod = a % b;
                System.out.println("Modulus of two number is " + mod);
                break;
            case 6:
                System.out.println("Exit...");
                return;
          }
        }*/

    // FIND THE LARGEST NUMBER 👍👍👍👍👍👍
          /*  System.out.print("Enter first number: ");
            int a = input.nextInt();
            System.out.print("Enter second number: ");
            int b= input.nextInt();
            System.out.print("Enter third number: ");
            int c = input.nextInt();
            if(a>b && a>c){
                System.out.println("The largest number is: "+a);
            } else if (b>a && b>c) {
                System.out.println("The largest number is: "+b);
            }else {
                System.out.println("The largest number is: "+c);
            }*/


    // SWAP 2 NUMBER WITHOUT USING THIRD VARIABLE👍👍👍👍👍👍
/*
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
//        a= a+b;
//        b=a-b;
//        a=a-b;
        a= a*b;
        b=a/b;
        a=a/b;
        System.out.print("First number: "+a);
        System.out.println("\nSecond number: "+b);
*/

    //ODD EVEN NUMBER PRINT 👍👍👍👍👍👍
      /*  System.out.print("Enter your number: ");
        int num = input.nextInt();
//        if(num%2==0){
//            System.out.println("Even number ");
//        }else {
//            System.out.println("Odd number");
//        }
        int evenCount=0;
        int oddCount=0;
        for (int i=1; i<=num; i++){
            if(i%2==0){
                evenCount++;
        }else{
                oddCount++;
            }
        }
        System.out.println("Even number "+evenCount);
        System.out.println("Odd number"+oddCount);*/


    //PRINT TABLE 👍👍👍👍👍👍
      /*  System.out.print("Enter your number: ");
        int num = input.nextInt();
        for (int i=1; i<=10; i++){
            int sum= num*i;
            System.out.println(num+" * "+i +" = "+sum);
        }
*/
    //n natural number ka sum  👍👍👍👍👍👍
    /*    System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++){
            sum = sum+2*i;
            System.out.print(" "+i );
        }
        System.out.println("\nsum of natural number is "+sum);
*/
    //WHILE LOOP     👍👍👍👍👍👍
       /* boolean learn= false;
        while (!learn){
            System.out.println("Went to school, Try to learn");
            System.out.println("Have you understood? ");
            learn= input.nextBoolean();
        }*/

        // do WHILE LOOP     👍👍👍👍👍👍
/*        int i=8;
        do{
            System.out.println(i);
            i++;
        }while (i<5);
        System.out.println("Out of loop");*/

    //BREAK 👍👍👍👍👍👍
       /* for (int i=0; i<=35;i++){
            System.out.println(i);
            if (i>=10)break;
        }*/

    //CONTINUE 👍👍👍👍👍👍
      /*  for (int i=0; i<=35;i++) {
            if (i <= 9 || i==15) continue;
            if(i>=20)break;
            System.out.println("GIVE TOFFEE "+i);
        }*/

    //👍👍👍👍👍👍👍

       /* for(int count=0; count<5;count++){
            for (int i=1; i<5;i++){
                System.out.print(i+" ");
            }
            System.out.println("printed "+count);
        }*/
       /* for (int i=0; i<10;i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }*/
        /*for (int i=0; i<=10;i++){
            int j=0;
            while (j<=i){
                System.out.print(" * ");
                j++;
            }
            System.out.println();
        }*/

        //ARRAY👍👍👌
//        int a[];//declaration
//        a=new int[20];//memory allocation
//            int a[]=new int[20];
//           a[1]=5;
//           a[2]=10;
//           a[5]=30;
//           System.out.println(a[1]+" "+a[2]+" "+a[3]+" "+a[1]+" ");
//           System.out.println(a.length);
       /* int marks[]={98,65,88,97,54,34,20};
        System.out.println(marks.length);
        System.out.println(marks[5]);
//        for (int i=0; i<marks.length; i++){
//            System.out.println(marks[i]);
//        }
        //FOR EACH LOOP👍👍👍👍👍👍👍
        for (int mark:marks){  //for each merk in merks
            System.out.println(mark);  //do this
        }*/

    //PRINT SUM OF ARRAY👍👍👍👍👍👍👍
    /*int arr[]={2,2,3,4,0};
    int sum=0;
    for (int array:arr){
        sum +=array;
    }
    System.out.println(sum);*/

        //PRINT MINIMUM NUMBER IN ARRRAY👍👍👍👍👍👍👍

//        int numbers[]={23,45,67,8,23,1,40};
//      int min= Integer.MAX_VALUE;
//      for (int number:numbers){
//          if (number<min){
//              min=number;
//          }
//      }
//      System.out.println("minimum is "+min);
        /*int max =Integer.MIN_VALUE;
        for (int number:numbers){
            if (number>max){
                max=number;
            }
        }
        System.out.println("maximum number is "+max);*/

      /*  int max= Integer.MIN_VALUE;
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("Maximim number is "+max);*/

        //😘👀✌✌👀👀👀👀👀👀👀
      /* int arr[] = {23,45,6,45,1,50};
       int min=arr[0];
       for (int i=0; i<arr.length;i++){
           if (arr[i]<min){
               min=arr[i];
           }
       }
       System.out.println(min);*/
/*
       System.out.println("Enter size os array: ");
       int n= input.nextInt();
       int arr[]= new int[n];
       System.out.println("Enter array element ");
       for (int i=0; i<n;i++){
           arr[i]=input.nextInt();
       }
//       System.out.println("you entered: ");
//       for (int i=0;i<n;i++){
//           System.out.println(arr[i]);
//       }
       int max=arr[0];
       for (int i=0;i<n;i++){
           if (arr[i]>max){
               max=arr[i];
           }
       }
       System.out.println(max);*/


    //2D ARRAY👍👍👍👍👍👍👍
//        int marks[][]= new int[4][3];//4rows,3colloum
//        marks[0][0]=12;
//        marks[0][1]=78;
//        marks[0][2]=97;
//        marks[1][0]=12;
//        marks[1][1]=78;
//        marks[1][2]=97;
    /*    int marks[][]={
                {34,45,67},
                {34,56,78},
                {98,56,57},
                {34,67,80}
        };

        System.out.println(marks[2][1]);
        System.out.println(marks.length);*/

    //FUNCTION  👍👍👍👍👍
        /*System.out.println(minimum(7,8));*/
//        int value= minimum(4,6);
//        System.out.println(value);
//        int a=46;
//        int b=8; int c=34; int d=0;
//        System.out.println(Math.min(a,b));
//        System.out.println(Math.max(c,d));
//        System.out.println(Math.sqrt(34));
//        System.out.println(Math.pow(3,4));
//        System.out.println(Math.abs(3));
//        System.out.println(Math.abs(-a));
//        System.out.println(Math.random());
//        System.out.println(getRandom());   //getRendom function call
//        System.out.println(getRandom(10,20));   //getRendom function call
//        System.out.println(Math.floor(5.6));
//        System.out.println(Math.ceil(5.6));
//        System.out.println(Math.round(5.6));

    //STRING  👍👍👍👍👍
        /*String newName= new String("vishal");
        String name = "vishal";
        String sameName = "vishal";
        System.out.println(newName);
        System.out.println(name);
        System.out.println(sameName);
        System.out.println("Nvisha");
        if(name==sameName){
            System.out.println("Bpth are pointing Same name");
        }else {
            System.out.println("Both are storing in same string memory pool but pointing different name ");
        }

        if(name==newName){
            System.out.println("both are pointing same name");
        }else {
            System.out.println("Both are not pointin same name");   //(==) ye refrences ko check krta h...
        }
      //JB HAME 2 STRINGS KI VALUE KO COMPAIR KRNA HOTA H TO HM equals() KA USE KRTE H. 👍👍👍👍👍
        if (name.equals(newName)){
            System.out.println("name and same name have same value.");
        }else {
            System.out.println("not have same value");
        }
        System.out.println("Enter your first name: ");
        String firstName= input.nextLine();
        System.out.println("Enter your second name: ");
        String secondName= input.nextLine(); //next() ISKA USE KRNE SE ONLY FIRST WORD PRINT HOGA SPACE K BAAD K WORD CLIP HO JAYEGA..
        System.out.println("your name is "+firstName+" "+secondName);
        System.out.println(firstName+secondName); //OPERATOR OVERLOADEING

        //  JAVA STRING METHOD*/
        /*String name= "NikiTachauraSIA";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String a = "   NIkita    ch   ";
        System.out.println(a.trim());
        System.out.println("carpat".startsWith("cars"));
        System.out.println("nikku".endsWith("ta"));
        System.out.println("carpet".equals("pet"));
        System.out.println("CArpet".equalsIgnoreCase("carpet"));
        System.out.println("carpet".charAt(3));//p
        char temp = "charpet".charAt(3);
        System.out.println(temp);

        int age=24;
        String stringAge= String.valueOf(age);
        System.out.println(age+2);//24+2=26 integer
        System.out.println(stringAge+2);//242 this is string

        String sentense= "i love java and java is a good language";
        String newSentense= sentense.replace("java","cpp");
        System.out.println(newSentense);
        System.out.println(sentense.contains("good"));*/

        //LINEAR SEARCH CODE👍👍👍👍👍👍
       /* int arr[]= {12,34,545,6,6,54};
        System.out.println("Enter element you want to search: ");
        int search=input.nextInt();
        int position= linearSearch(arr, search);
        if (position != -1){
            System.out.println("Element "+search+" found at index "+position);
        }else {
            System.out.println("Element "+search+" not found in the array");
        }*/

        //BINARY SEARCH CODE👍👍👍👍👍👍👍👍👍👍👍
        int arr[] ={12,13,14,15,16,17,18,19};
        System.out.println("Enter number you want to search ");
        int search= input.nextInt();
        int n= arr.length - 1;
        int position = binarySearch(arr,0,n,search);
        if (position != -1){
            System.out.println("Element "+search+" found dt index "+position);
        }else {
            System.out.println("Element "+search+" not found in array");
        }










    }


    static int minimum(int a , int b){
        return a<b?a:b;
    }

    static int getRandom( int a, int b){
//        return (int) (Math.random()*6);
        return (int) (Math.random()*(b-a+1)+a);
    }

    public static int linearSearch(int arr[],int search){
        for (int i=0; i<arr.length;i++){
            if (arr[i]== search){
                return i;
            }
        }
        return -1; //return if no element found
    }
    public static int binarySearch(int a[],int beg, int end,int searchElement){
        while (beg<=end){
            int mid = beg+ (end -beg)/2;
            if (a[mid]==searchElement){
                return mid;
            } else if (a[mid]<searchElement) {
                beg=mid+1;
            } else{
                end = mid-1;
            }
        }
        return -1;
    }



}
