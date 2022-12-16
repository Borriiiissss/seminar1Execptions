// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя. 
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {5,6,8,4,98,74};
        int[] arr2 = {4,5,0,9,4}; 
        substractArr(arr1, arr2);
    }
    public static int[] substractArr(int [] arr1, int [] arr2) {
        if (arr1.length != arr2.length){
            try {
                throw new RuntimeException(" длины массивов не равны ");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int maxIndex = (arr1.length <= arr2.length ? arr1.length : arr2.length) - 1;
        int[] arrResult = new int [maxIndex];
        for (int i = 0; i < maxIndex; i++) {
            if (arr1[i] != 0 && arr2[i] != 0){ 
            arrResult [i] = arr1[i] / arr2[i];
            } else {
                throw new RuntimeException(" деление на ноль невозможно ");
            } 
        }
        return arrResult;
    }
}
