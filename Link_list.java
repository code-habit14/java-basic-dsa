import java.util.Scanner;

public class Link_list {

    static class SinglyLinkedList {

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head = null;

        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            Node temp = head;
            if (head == null) {
                head = newNode;
            } else {
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }

        }

        public void insertAtIndex(int data, int index) {
            Node newNode = new Node(data);
            Node temp = head;
            int currentent = 0;
            while (temp != null && currentent < index - 1) {
                temp = temp.next;
                currentent++;
            }

            if (index < 0) {
                System.out.print("Invalid index. Must be >= 0.");
            } else if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else if (temp == null) {
                System.out.println("Index out of bounds.");
            } else {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }

        public void delStartingLL() {
            if (head == null) {
                System.out.println("List is empty — nothing to delete");
            }
            head = head.next;
        }

        public void delAtEnt() {
            Node temp = head;
            if (head == null) {
                System.out.println("List is empty — nothing to delete");
            } else if (head.next == null) {
                head = null;
            } else {
                while (temp.next.next == null) {
                    temp = temp.next;
                    temp.next = null;
                }
            }
        }

        public void delAtIndex(int index) {
            Node temp = head;
            int curentIndex = 0;
            while (temp != null && curentIndex < index - 1) {
                temp = temp.next;
                curentIndex++;
            }
            if (index < 0) {
                System.out.println("Invalid index (must be ≥0)");
            } else if (head == null) {
                System.out.println("List is empty — nothing to delete");
            } else if (index == 0) {
                head = head.next;
            } else if (temp == null || temp.next == null) {
                System.out.println("Index out of bounds");
            } else {
                temp.next = temp.next.next;
            }
        }

        public void print() {
            Node temp = head;
            if (head == null) {
                System.out.print("Link List does not exist");
            } else {
                while (temp != null) {
                    System.out.print(temp.data + "->");
                    temp = temp.next;
                }
                System.out.println("Null");

            }
        }
    }

    static class CircularLinkedList {

        static class cNode{
            int data;
            cNode next =null;
            cNode(int data){
                this.data=data;
                this.next=null;
            }
        }
        cNode tail =null;

        public void insertAtBeg(int data){
            cNode newNode = new cNode(data);
            if (tail==null){
                tail=newNode;
                newNode.next=newNode;
            }else {
                newNode.next=tail.next;
                tail.next=newNode;
            }
        }

        public void insertAtEnd(int data){

            insertAtBeg(data);
            tail=tail.next;
        }
        public void insertAtIndex(int data , int index){
            cNode newNode = new cNode(data) ;
            cNode temp = tail;
            int currentIndex=0;
            while (temp!=null && currentIndex < index-1){
                temp=temp.next;
                currentIndex++;
            }

            if (index < 0) {
                System.out.print("Invalid index. Must be >= 0.");
            } else if (index == 0) {
                newNode.next = tail;
                tail = newNode;
            } else if (temp == null) {
                System.out.println("Index out of bounds.");
            } else {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }

        public void delcAtBeging(){
            if (tail == null) {
                System.out.println("List is empty — nothing to delete");
            }
            if (tail.next==tail){
                tail=null;
            }
            tail.next=tail.next.next;
        }

        public void delAtEnd(){
            cNode temp=tail.next;
            if (tail==null){
                System.out.println("Empty list");
            }
            if (tail.next==tail){
                tail=null;
            }
            while (temp.next!=tail){
                temp=temp.next;

            }
            temp.next=tail.next;
            tail=temp;
        }

        public void delAtIndex(int index){
            cNode temp =tail.next;
            int currentIndex=0;
            while (temp!=tail || currentIndex< index-1){
                temp=temp.next;
                currentIndex++;
            }
            if (index<0){
                System.out.print("Invalid index");
            } else if (tail==null) {
                System.out.print("Empty Index");
            } else if (tail.next==tail) {
                delAtEnd();
            } else if (index==0) {
                delcAtBeging();
            } else if (temp==tail || temp.next==tail.next) {
                System.out.println("Index out of bounds");
            }else {
                temp.next=temp.next.next;
            }
        }
        public void printNode(){
            cNode temp = tail;
            do {
                System.out.print(temp.data +" ");
                temp=temp.next;
            }while (temp!=tail);
        }
    }


    static class DoublyLinkedList{
        static class dNode{
            int data;
            dNode next;
            dNode pre;
            dNode(int data){
                this.data=data;
                this.next=null;
                this.pre=null;
            }
        }
        dNode head =null;
        dNode tail =null;
        private int size=0;

        public void insertAtBeg(int data){
            dNode newNode = new dNode(data);
            if (head==null){
                head=tail=newNode;
            }else {
                newNode.next=head;
                head.pre=newNode;
                head=newNode;
                size++;
            }
        }

        public void insertAtEnd(int data){
            dNode newNode = new dNode(data);
            if (tail==null){
                head=tail=newNode;
            }else {
                tail.next=newNode;
                newNode.pre=tail;
                tail=newNode;
                size++;
            }
        }

        public void insertAtIndex(int data ,int index){
            dNode newNode = new dNode(data);
            if (index<0 || index>size){
                System.out.println("Index out of bounds");
            } else if (index==0) {
                insertAtBeg(data);
            } else if (index==size) {
                insertAtEnd(data);
            }else {
                dNode temp;
                if (index<=size/2){
                    temp=head;
                    for (int i=0;i<index;i++){
                        temp=temp.next;
                    }
                }else {
                    temp=tail;
                    for (int i=size;i>index;i--){
                        temp=temp.pre;
                    }
                }
                newNode.pre = temp.pre;
                newNode.next = temp;
                temp.pre.next = newNode;
                temp.pre = newNode;
                size++;
            }
        }

        public void delAtBeg(){
            if (head==null){
                System.out.println("List is empty — nothing to delete");
            }
            head=head.next;
            if (head!=null) {
                head.pre=null;
            }else {
                tail=null;
            }
            size--;
        }

        public void delAtEnd(){
            if (tail==null){
                System.out.println("List is empty — nothing to delete");
            }
            tail=tail.pre;
            if (tail!=null){
                tail.next=null;
            }else head =null;
            size--;
        }

        public void delAtIndex(int index){
            if (index<0 || index>size){
                System.out.println("Index out of bounds");
            } else if (index==0) {
//                insertAtBeg(data);
            } else if (index==size) {
//                insertAtEnd(data);
            }else {
                dNode temp;
                if (index<=size/2){
                    temp=head;
                    for (int i=0;i<index;i++){
                        temp=temp.next;
                    }
                }else {
                    temp=tail;
                    for (int i=size-1;i>index;i++){
                        temp=temp.pre;
                    }
                }
                temp.pre.next = temp.next;
                temp.next.pre = temp.pre;
                size--;

            }
        }

        public void forwoedprint() {
            dNode temp = head;
            if (head == null) {
                System.out.print("Link List does not exist");
            } else {
                while (temp != null) {
                    System.out.print(temp.data + "->");
                    temp = temp.next;
                }
                System.out.println("Null");

            }
        }

        public void backprint() {
            dNode temp = tail;
            if (tail == null) {
                System.out.print("Link List does not exist");
            } else {
                while (temp != null) {
                    System.out.print(temp.data + "<-");
                    temp = temp.pre;
                }
                System.out.println("Null");

            }
        }
    }

    static class DoublyCircularLinkList{
        static class dcNode {
            int data;
            dcNode next;
            dcNode pre;

            dcNode(int data) {
                this.data = data;
                this.next = null;
                this.pre = null;
            }
        }
        dcNode tail=null;
        dcNode head=null;
        int size=0;


        public void insertAtBeg(int data){
            dcNode newNode= new dcNode(data);
            if (head ==null){
                head=tail=newNode;
                newNode.pre=newNode.next=newNode;
            } else {
                newNode.next=head;
                newNode.pre=tail;
                head.pre=newNode;
                tail.next=newNode;
                head=newNode;
            }
            size++;
        }

        public void insertAtEnd(int data){
            dcNode newNode = new dcNode(data);
            if (tail==null){
                head=tail=newNode;
                newNode.pre=newNode.next=newNode;
            }else {
                newNode.pre=tail;
                newNode.next=head;
                head.pre=newNode;
                tail.next=newNode;
                tail=newNode;
            }
            size++;
        }

        public void insertAtIndex(int data ,int index){
            dcNode newNode = new dcNode(data);
            if (index<0 || index>size){
                System.out.println("Index out of bounds");
            } else if (index==0) {
                insertAtBeg(data);
            } else if (index==size) {
                insertAtEnd(data);
            }else {
                dcNode temp;
                if (index<=size/2){
                    temp=head;
                    for (int i=0;i<index;i++){
                        temp=temp.next;
                    }
                }else {
                    temp=tail;
                    for (int i=size;i>index;i--){
                        temp=temp.pre;
                    }
                }
                newNode.pre = temp.pre;
                newNode.next = temp;
                temp.pre.next = newNode;
                temp.pre = newNode;
                size++;
            }
        }

        public void delAtBeg(){
            if (head == null) {
                System.out.println("List is empty");
            }
            if (size == 1) { head = tail = null; }
            else {
                head=head.next;
                head.pre=tail;
                tail.next=head;
            }
            size--;
        }

        public void delAtEnd(){
            if (tail == null) { System.out.println("List is empty"); return; }
            if (size == 1) { head = tail = null; }
            else {
                tail= tail.pre;
                tail.next=head;
                head.pre=tail;
            }
            size--;
        }

        public void delAtIndex(int index){
            if (index<0 || index>size){
                System.out.println("Index out of bounds");
            } else if (index==0) {
//                insertAtBeg(data);
            } else if (index==size) {
//                insertAtEnd(data);
            }else {
                dcNode temp;
                if (index<=size/2){
                    temp=head;
                    for (int i=0;i<index;i++){
                        temp=temp.next;
                    }
                }else {
                    temp=tail;
                    for (int i=size-1;i>index;i++){
                        temp=temp.pre;
                    }
                }
                temp.pre.next = temp.next;
                temp.next.pre = temp.pre;
                size--;

            }

        }

        public void forwardPrint(){
            dcNode temp = head;
            if (head == null) {
                System.out.print("Link List does not exist");
            }
            do {
                System.out.print(temp.data+ " ");
                temp=temp.next;
            }while (temp!=head);
            System.out.println();
        }
        public void backwardPrint(){
            dcNode temp=tail;
            if (head == null) {
                System.out.print("Link List does not exist");
            }
            do {
                System.out.print(temp.data+ " ");
                temp=temp.next;
            }while (temp!=tail);
        }

    }













    public static void main(String args[]){
  /*      SinglyLinkedList li =new SinglyLinkedList();
        li.insertAtBeginning(10);
        li.insertAtBeginning(20);
        li.insertAtBeginning(30);
        li.insertAtEnd(50);
        li.insertAtEnd(60);
        li.insertAtIndex(23,2);
        li.insertAtIndex(24,0);
//        li.insertAtIndex(26,9); //index out of bound
//        li.insertAtIndex(27,-2);  //invalid index
        li.print();
        li.delStartingLL();
        li.delAtEnt();
        li.print();
        li.delAtIndex(3);

        li.print();*/

     /*   CircularLinkedList cl = new CircularLinkedList();
        cl.insertAtBeg(1);
        cl.insertAtBeg(2);
        cl.insertAtEnd(3);
        cl.insertAtIndex(4,1);
        cl.insertAtEnd(5);
        cl.printNode();

//        cl.delcAtBeging();
//        cl.delAtEnd();
        cl.delAtIndex(1);
        System.out.println();
        cl.printNode();
*/


        /*DoublyLinkedList dl =new  DoublyLinkedList();
        dl.insertAtBeg(1);
        dl.insertAtBeg(2);
        dl.insertAtEnd(3);
        dl.insertAtIndex(5,2);
        dl.insertAtBeg(6);
        dl.forwoedprint();
        dl.backprint();

//        dl.delAtBeg();
//        dl.delAtEnd();
        dl.delAtIndex(2);
        dl.forwoedprint();
        dl.backprint();*/

/*        DoublyCircularLinkList dc=new DoublyCircularLinkList();
        dc.insertAtBeg(1);
        dc.insertAtBeg(2);
        dc.insertAtBeg(3);
        dc.insertAtEnd(4);
        dc.insertAtIndex(5,2);
        dc.forwardPrint();
        System.out.println();
//        dc.backwardPrint();
        System.out.println();
        dc.delAtBeg();
        dc.delAtEnd();
        dc.delAtIndex(3);
        dc.forwardPrint();*/

          /*  CircularQueue cq= new CircularQueue();
        cq.enQueue(23);
        cq.enQueue(34);
        cq.enQueue(56);
        cq.enQueue(67);
        cq.print();
        cq.deQueue();
        cq.deQueue();
        cq.enQueue(4);
        cq.print();*/








        /*stack s=new stack();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.print();
        s.pop();
        s.print();*/

      /*  Queue q=new Queue();
        q.enQueue(12);
        q.enQueue(13);
        q.enQueue(4);
        q.enQueue(16);
        q.print();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.print();*/


        /*StackUsingLinklist sl=new StackUsingLinklist();
        sl.push(1);
        sl.push(2);
        sl.push(3);
        sl.print();
        sl.pop();
        sl.print();*/

     /*   QueueUsingLinklist ql=new QueueUsingLinklist();
        ql.enQueue(1);
        ql.enQueue(2);
        ql.enQueue(3);
        ql.print();
        ql.deQueue();
        ql.print();*/









    }

    static class StackUsingLinklist{
        static class sNode{
            int data;
            sNode next;
            sNode(int data){
                this.data=data;
                this.next=null;
            }
        }
        sNode top=null;
        public void push(int data){
            sNode newNode = new sNode(data);
            newNode.next=top;
            top=newNode;
        }
        public void pop(){
            if (top==null){
                System.out.println("Underflow");
            }else {
                int del=top.data;
                top=top.next;
                System.out.println("Deleted data "+del);
            }
        }
        public void print(){
            sNode temp =top;
            System.out.println("Stack elements ");
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }


    static class stack{
        int top= -1;
        int n=5;
        int arr[]= new int[n];


        public void push(int value){
            if (top==n-1){
                System.out.println("overflow");
            }else {
                top++;
                arr[top]=value;
            }
        }
        public void pop(){
            if (top== -1){
                System.out.println("underflow");
            }else {
                top--;
            }
        }
        public void print(){
            System.out.println("items are ");
            for (int i=top; i>=0;i--){
                System.out.println(arr[i]);

            }
        }
    }
    static class Queue{
        int f=-1;
        int r=-1;
        int n=5;
        int arr[]= new int[n];
        public void enQueue(int data){
            if (r==n-1){
                System.out.println("overflow");
            } else if (f==-1 && r==-1) {
                f = r =0;
                arr[r]=data;
            }else {
                r++;
                arr[r]=data;
            }
        }
        public void deQueue(){
            if (f==-1 && r==-1){
                System.out.println("underflow");
            }else if (f==r){
                f = r = -1;
                System.out.println("data enpty");
            }else {
                f++;
            }

        }
        public void print(){
            System.out.println("items are ");
            for (int i=f; i<=r;i++){
                System.out.println(arr[i]);
            }
        }

    }

    static class CircularQueue{
        int f=-1;
        int r=-1;
        int maxSize=5;
        int arr[]= new int[maxSize];
        public void enQueue(int data){
            if (f==(r+1)%maxSize){
                System.out.println("overflow");
            } else if (f==-1 && r== -1) {
                f=r=0;
                arr[r]=data;
            }else {
                r=(r+1)%maxSize;
                arr[r]= data;
            }
        }
        public void deQueue(){
            if (f== -1 && r==-1||f==r){
                System.out.println("underflow");
            }
            f=(f+1)%maxSize;

        }
        public void print(){
            System.out.println("intems are ");
            for (int i=f;i<=r;i++){
                System.out.println(arr[i]);
            }
        }
    }

    static class QueueUsingLinklist{
        static class qNode{
            int data;
            qNode next;
            qNode(int data){
                this.data=data;
                this.next=null;
            }
        }
        qNode f =null;
        qNode r= null;

        public void enQueue(int data){
            qNode newNode= new qNode(data);
            if (r==null){
                f =r= newNode;
            }
            r.next=newNode;
            r=newNode;
        }
        public void deQueue(){
            if (f==null){
                r=null;
                System.out.println("underflow");
            }

            int del=f.data;
            f=f.next;
            System.out.println("deleted element "+del);
        }
        public void print(){
            qNode temp = f;
            System.out.print("Queue element ");
            while (temp != null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }









}
