package oop_encapsulation;

class polydemo {

    public void print (int a){
        System.out.println("hello a " + a);
    }
    public void print (int a, int b){
        System.out.println("hello a " + a+ "," + b);
    }

}


public class overLodingTest {
    public static void main(String[] args) {
        polydemo nPolyDemo = new polydemo();
        nPolyDemo.print(20);
        nPolyDemo.print(13,  4);

    }
}
