import java.util.Scanner;

/**
 * Author: tyza66
 * CreateTime: 2023-03-31 15:04
 * Github: https://github.com/tyza66
 */
public class Bubbo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("请输入5个数字并且用空格分开：");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int oen : arr) {
            System.out.print(oen + " ");
        }
    }
}
