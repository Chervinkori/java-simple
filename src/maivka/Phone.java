package maivka;

public class Phone {

    public int numbers;
    public String model;
    public double weight;

    public Phone(int numbers, String model, double weight) {
        this.numbers = numbers;
        this.model = model;
        this.weight = weight;
    }

    public void info() {
        System.out.println("Номер: " + numbers);
        System.out.println("Модель: " + model);
        System.out.println("Вес: " + weight);
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит: " + callerName);
    }

    public int getNumber() {
        return numbers;
    }

    public void receiveCall(String callerName, int callerNumber) {
        System.out.println("Звонит: " + callerName + ", с номера: " + callerNumber);
    }

    public void sendMessage(int... phoneNumbers){
        System.out.println("Отправляю сообщения на номера: ");
        for (int num : phoneNumbers){
            System.out.println(num);
        }
    }


}
