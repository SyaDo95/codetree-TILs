import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int sum = a + b + c;
        int avg = sum/3;
        int result = sum - avg;

        System.out.println(sum);
        System.out.println(avg);
        System.out.println(result);


    }
}