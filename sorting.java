import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int i, sum = 0;
        int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = a.nextInt();
        }
        Arrays.sort(arr);
        for (i = 0; i < n; i++) {
            System.out.printf("%d", arr[i]);
        }
    }
}
