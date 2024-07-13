package oop_encapsulation;

class dhani{
//    parent class
    /*final*/ int money = 1130;
    public void house(){
        System.out.println("normal house");

    }
}


//Chil class
class dhani_beta extends dhani
{
// demand of beta
}

public class inheritance {

    public static void main(String[] args) {
        dhani d = new dhani();
        d.house();

        dhani_beta db = new dhani_beta();
        db.house();
        System.out.println(db.money);
        db.money = 1500;
        System.out.println(db.money);





    }
}