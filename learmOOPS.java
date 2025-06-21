public class learmOOPS {
    public static void main(String[] args){
      /*  dog d1= new dog(); //dog ka object bn gya h👀👀👀
        d1.name= "tommy";
        d1.bark();
        d1.walk();

        dog d2 = new dog();
        d2.name="puppy";
        d2.walk();*/

   /*     Complex num1=new Complex();
        num1.a=3;
        num1.b=4;
        num1.print();*/

  //METHOD OVERLOADING👍👍👍👍👍👍👍 isne FUNCTON KA NAME DAME HO SAKTA H BUT perameter same nehi hone chahiye
      /*  Greet obj= new Greet();
        obj.greeting();
        Greet obj2=new Greet();
        obj2.greeting("nikita");
        Greet obj3= new Greet();
        obj3.greeting("nikita", 5);*/
  //CONSTRUCTOR 👍👍👍👍👍👍👍👍👍
/*        Add num1= new Add();  //DEFAUULT CONSTRUCTOR👀👀👀👀👀👀👀👀
        num1.print();*/
        /*Add sum= new Add(4,56,6);   //PARAMETRIC CONSTRUCTOR👀👀👀👀👀👀👀👀
        sum.print();
        Add sum2= new Add(3,45,9);
        sum2.print();*/
       /* Add result = new Add(12,3); //CONSTRUCTOR OVERLOADING(same name but different parameters)👀👀👀👀👀👀👀👀
        result.print();
        Add result2= new Add(12,13,14);
        result2.print();*/
  //INHERITENCE (REUSIBILITY)👍👍👍👍👍👍👍👍👍














    }
}
//INHERITENCE OOPS PILLER👍👍👍👍👍👍👍👍👍



//CONSTRUCTOR 👍👍👍👍👍👍👍👍👍
/*class Add{
    int a,b;
    int c;
  *//*  Add(){  //default constrctor
        a=3;
        b=7;
    }*//*
   *//* Add(int value1, int value2,int value3){ //parametric constructor
        a=value1;
        b=value2;
        c=value3;
    }*//*
   *//* Add(int v1,int v3){
        a=v1;
        b=2;
        c=v3;
    }*//*
    Add(int a,int b){ //THIS POINTER
        this.a=a;
        this.b=b;
    }

    void print(){
        System.out.println(a+b+c);
    }
}*/
//METHOD OVERLOADING👍👍👍👍👍👍👍
/*class Greet{
    void greeting(){
        System.out.println("Hello, Good morning");
    }
    void greeting(String name){
        System.out.println("Hello "+ name +" Good morning");
    }
    void greeting(String name,int count){
        for (int i=0;i<count;i++){
            System.out.println(name +" Good Morning");
        }
    }
}

class Complex{
    int a,b;
    void print(){
        System.out.println(a+"+"+b+"i");
    }
}*/

/*
class dog{
    String name;
    int age;
    void walk(){
        System.out.println(name+" is barking");
    }
    void bark(){
        System.out.println(name+" is barking");
    }
}*/
