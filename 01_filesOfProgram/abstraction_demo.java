package oop_encapsulation;

abstract class abstraction_test{
    abstract int sum();

    public void print()
    {
        System.out.println("Hello world  ");
    }

}
class test extends abstraction_test{
    @Override
    int sum() {
        System.out.println("Hello Arzo");
        return 100;
    }

}


public class abstraction_demo {
    public static void main(String[] args) {
        test one = new test();
        int none = one.sum();
        System.out.println(none);

    }
}
