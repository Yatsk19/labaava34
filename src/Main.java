public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        replaceMiddleElements(array);


        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void replaceMiddleElements(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            arr[i] = (arr[i - 1] + arr[i + 1]) / 2;
        }
    }
}
