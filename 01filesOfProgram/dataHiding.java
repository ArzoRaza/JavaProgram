package oops;

public class dataHiding {
    public static void main(String[] args) {
        balance b = new balance();
        int bal=b.getX();
        System.out.println(bal);
    }
}

class balance {
    private int x = 10000;


    public int getX() {
        return x;
    }
}