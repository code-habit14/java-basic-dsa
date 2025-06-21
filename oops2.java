//INHERITENCE IN JAVA👍👍👍👍👍👍👍👍👍👍
/*class doctor{
    float salary=500000;
}
class surgen extends doctor{
    float bonous= 20000;
}*//*
class vehical{
    int wheelscount;
    final int gears=5; // [final variable]=gears ki value ab change nehi ho sakti👀👀👀

    vehical(){ //constructor 1😉😉
        System.out.println("Creating a constructor in vehical class");
    }
    vehical(int wheelscount){ //constructor2😉😉
        this.wheelscount=wheelscount;
        System.out.println("Creating wheecal with wheels");
    }
    void start(){
        System.out.println("This is vehical ");
    }
    final void acceleration(){   //[final method]which cant't change in any other child class👀👀👀
        System.out.println("Vehical is accelerating");
    }

}
class car extends vehical{
    String color;
//    void acceleration(){} //it give error bcz final method can't be overwrite👀😉😉

    car(){
//        super();//this is callconstructor 1default constructor👀👀👀👀
        super(4); //this super call imidiate parent constructor(parametric)👀👀👀👀
        System.out.println("Car is being created");
    }
    void start(){ //THIS IS METHOD OVERRIDING👀👀👀👀👀MEANS PARENT CLASS K METHOD KO OVERRIDE KIYA GYA H💖💖💖
        super.start();//(super.start) se hm only imidiate parent ko assess kr pate h
        System.out.println("start from a car");
    }
}*/
//DATA HIDDING :- SETER AND GETTER FUNCTION👍👍👍👍👍👍👍👍👍
/*class Teacher{
    private int salery;
    public
    void setSalery(int salery){
        this.salery=salery;
    }
    public int getSalery(){
        return salery;
    }*/
//STATIC KEYWORD👍👍👍👍👍👍👍👍
/*class Person{
    public static int count=0;//STATIC VARIABLE
    public static final String scientificName = "Homosapiens";//no one can change this name💖💖💖💖
    public Person(){ //it count how many object created...
        count++;
    }
    public static void printHello(){ //STATIC METHOD👀👀👀👀
        System.out.println("hello");
    }
    public void printHi(){
        System.out.println("h1");
        printHello();
    }
}*/
//ABSTARACT CLASS👍👍👍👍👍👍👍👍👍👍
/*abstract class vehical{ //ABSTRAC CLASS KA OBJECT NEHI BNTA H.IF YOU WANT TO ACCESS ABSTRACT CLASS SOISE CHILD CLASS SE ACCESS KE SAKTE H👀👀
   abstract void accelerate();//ye abstract method h isliye isliki implimentation chil class me krna mendatory h👀👀
   abstract int breaks(int wheels);
   void honk(){//💖abstract class me ye ak nornal method h iskite iski implementation define krna jaruri h, ye normal method hisliye ise child clss me overite krna mendatory nehi h👀👀
       System.out.println("vehical is honk");//is implementation ko child class k obj se access ke sakte h....
   }
}
class car extends vehical{

    @Override //this is used to chek word parent classes se override h ki nehi......
    void accelerate() {
        System.out.println("Car is accelerating ");
    }

    @Override
    int breaks(int wheels) {
        System.out.println("Car breaks and pushed");
        return wheels;
    }

}
class scooter extends vehical{
    void accelerate() {
        System.out.println("scooter is accelerating");
    }
    int breaks(int wheels) {
        return 0;
    }
}*/

//INTERFACE 👍👍👍👍👍👍//ye abstract class ki trh hi hota h
/*interface Animal{ //iseke bhi object nehi bn sakta so hm child class me implements keke obj bnake call krte h👀👀
    int leegs=4;//  BY DEFAULT IT IS public static final int leegs which is 4. this 4 is fixed......
    void eats();
    void drink();
    default void talk(){ //DEFAULT METHOD ABSTRACTION KI TRH HME AB ISE BHI KISI OR CLASS ME OVERWEITE KRNE KI JARURAT NEHI H,DIRECT CAAL KRSAKTE H👀💖💖💖
        System.out.println("Animal is talking");
    }
}
interface Human{ //hm multiple interface bna sakte h and use single chil class se access kr sakte h👀👀
    void walk();
}
interface pet{
    void sing();
    void drink();
}
class Monkey implements Animal{
    public void eats(){
        System.out.println("Monkey is eating");
    }

    @Override
    public void drink() {
        System.out.println("Monkey is drinking");
    }
}
class Lion implements Animal,Human,pet{  //
    @Override
    public void eats() {
        System.out.println("Lion in eating");
    }
    @Override
    public void walk() {
        System.out.println("Lion is walking");
    }
    public void sing(){
        System.out.println("Lion is singing");
    }

    @Override
    public void drink() {
        System.out.println("Lion is drinking");
    }
}*/
//INNER CLASS OR NESTED CLASS and static class👍👍👍👍👍👍👍
/*class world{ //CLASS1
    class india{ //CLASS2
        int river;
    }
    static class Thiland{ //static class👀👀👀
        void dance(){
            System.out.println("they are dansing");
        }
    }
}*/
//ANONYMOUS CLASS: ISME HM NESTED CLASS BNA SAKTE H BIN NAAM DIYE👍👍👍👍👍👍👍👍 ONLY ONE TIME USE h❌❌❌❌
/*class Outer{
   public void  outerMethod(){
        System.out.println("outer method");
    }
}
class a{
    *//*class InnerClass extends Outer(){
//you can also declare with class name but it is not mendatry...
    }*//*
    Outer obj = new Outer(){
        void sing(){
            System.out.println("Anonymous class");
        }

    }
}*/
//FUNCTION ONTERFACE👍👍👍👍👍 isme oly one abstract method hota h
/*@FunctionalInterface  //it allow only one method
interface sample{
    void interfaceMethod();
//    void a();//error
}*/







public class oops2 {

    public static void main(String[] args) {



//     surgen s= new surgen();
//     System.out.println(s.salary);
//     System.out.println(s.bonous);
       /* car obj1= new car();
        System.out.println(obj1.wheelscount);
      obj1.wheelscount=11;
        obj1.color= "Red";
        obj1.start();
        System.out.println(obj1.wheelscount);
        System.out.println("gears ki value "+obj1.gears);
        obj1.acceleration(); //final method call from vehical class
    */
        //DATA HIDDING :- SETER AND GETTER FUNCTION👍👍👍👍👍👍👍👍👍
/*        Teacher t1 = new Teacher();
        t1.setSalery(50000);
        System.out.println(t1.getSalery()); */

       /* System.out.println(Person.count); //STATIC KEYWORD👍👍👍👍👍👍👍👍👍
//        Person.count=15;
        System.out.println(Person.count);//only one copy bnta h. and no need to make objest of static keyword👀👀👀
        Person.printHello();
        Person p1=new Person();
        p1.printHi(); //unstatic method can call static method but reverse not posible👀👀👀👀
        Person p2= new Person();
        System.out.println(Person.count); //it count how many object created;
        System.out.println(Person.scientificName);//you can print it but cant change it....
*/
        //ABSTRACT CLASS👍👍👍👍👍👍👍👍👍
      /*  car c1=new car();
        c1.accelerate();
        c1.breaks(3);
        System.out.println(c1.breaks(6));
        c1.honk();
        scooter s1= new scooter();
        s1.accelerate();
        s1.breaks(4);
        s1.honk();*/
        //INTERFACE 👍👍👍👍👍👍
    /*    Monkey m1 = new Monkey();
        m1.eats();
        m1.drink();
        Lion l1 = new Lion();
        l1.eats();
        l1.sing();
        l1.walk();
        l1.drink();
        System.out.println(Animal.leegs);//final which does not change...
        l1.talk();*/

        //INNER CLASS OR NESTED CLASS and static class👍👍👍👍👍👍👍
     /*  // world.india i1 = new world().new india();
        world obj = new world();
        world.india i1 =obj.new india();
        i1.river=12;
        System.out.println(i1.river);
        world.Thiland t1 = new world.Thiland(); //static class
        t1.dance();*/
        //Anonymous classes in java👍👍👍👍







    }
}
