// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class Task1 {

    public static void main(String[] args) {
        method1();
        method2();
        method3();

    }

    public static void method1() {
        int x = 10;
        int y = 0;
        int result = 0;
        try {
            result = x / y;
        } catch (ArithmeticException e) {
            System.out.println(e.toString() + "  деление на ноль ");
        }

    }

    public static void method2() {
        int[] arr = { 1, 6, 9, 10 };
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i + 4]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString() + "  выход за пределы массива");
        }
    }

    public static void method3() {
        int m = 0;
        String str = "a";
        try {
            m += Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(e.toString() + " ошибка перевода символа в цифру ");
        }
    }
}
