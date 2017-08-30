public class TwelveInts {

    public static void main(String[] args) {
        int[] list = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        for (int j = (list.length - 1); j >= 0; j-- ) {
            System.out.print(list[j] + " ");
        }
    }
}
