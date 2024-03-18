package panov.DZ9;

public class Main {
    public static void main(String[] args) {
        Phone Iphone = new Phone();
        Iphone.number = 999;
        Iphone.weight = 250;
        Iphone.model = "3gs";

        Phone Nokia = new Phone();
        Nokia.number = 905;
        Nokia.weight = 100;
        Nokia.model = "N92";

        Phone Samsung = new Phone();
        Samsung.number = 911;
        Samsung.weight = 175;
        Samsung.model = "S24";

        Samsung.receiveCall();
        Nokia.receiveCall();
        Iphone.receiveCall();

        Samsung.getNumber();
        Nokia.getNumber();
        Iphone.getNumber();

        System.out.println(Iphone.number + " " + Iphone.weight + " " + Iphone.model);
        System.out.println(Nokia.number + " " + Nokia.weight + " " + Nokia.model);
        System.out.println("Samsung: number="+ Samsung.number+" model="+Samsung.model+" weight="+Samsung.weight);
    }
}
