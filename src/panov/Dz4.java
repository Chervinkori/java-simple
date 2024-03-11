public class Dz4 {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        int a = 0, b = 1, n = 7;
        for (int i = 1; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("N = " + b);
    }

    public static void task2() {
        String[] array = {"Lorem ipsum", "Lorem ipsum dolor sit amet", "Lorem ipsum dolor sit amet, consectetur adipiscing elit", "Lorem"
        };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}



