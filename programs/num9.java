import java.util.Scanner;

class Series {
    int n;

    Series(int x) {
        n = x;
    }

    void calc() {
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            double f = 1;
            for (int j = 1; j <= i; j++) {
                f *= j;
            }
            sum += 1 / f;
        }

        System.out.println("Sum: " + sum);
    }
}

public class SeriesofSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        Series obj = new Series(sc.nextInt());
        obj.calc();
        sc.close();
    }
}
