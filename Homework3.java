import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int n = sc.nextInt();

        System.out.print("수를 입력하세요: ");
        int[] Num = new int[n];
        for(int i = 0; i < n; i++) {
           Num[i] = sc.nextInt();
        }

        int max = Num[0];
        int min = Num[0];

        for(int num : Num) {
            if(num > max)
                max = num;

            if(num < min)
                min = num;
        }


        System.out.printf("최댓값: %d\n", max);
        System.out.printf("최솟값: %d\n", min);
    }
}
