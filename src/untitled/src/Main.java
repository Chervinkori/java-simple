//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        method1();
        method2();
        method3();
        //method4();
        //method5();
    };
    public static void method1() {


        int[] arr = {1, 2, 3, 0, 5, 1, 2, 0, 2, 0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
    }

    public static void method2() {
        int[] arr = new int[];
        int firstZeroIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (firstZeroIndex == -1) {
                    firstZeroIndex = i;
                } else {
                    int sum = 0;
                    for (int j = firstZeroIndex + 1; j < i; j++) {
                        sum += arr[j];
                    }
                    return sum;
                }
            }
        }
        return 0;
    }

    public static void method3(){
        int [] arr = new int[];
        int index = 0;
        for (int num : arr) {
            if (num == 0) {
                arr[index++] = 0;
            }
        }
        while (index < arr.length) {
            arr[index++] = 1;
        }
    }
}