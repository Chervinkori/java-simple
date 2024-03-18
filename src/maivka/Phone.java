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
        System.out.println("Numbers: " + numbers);
        System.out.println("Model: " + model);
        System.out.println("Weight: " + weight);
    }

}
