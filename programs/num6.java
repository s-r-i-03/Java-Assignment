import java.util.Scanner;

class Fact {
    int n;

    Fact(int x) {
        n = x;
    }

    void calc() {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println(f);
    }
}

class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Fact obj = new Fact(sc.nextInt());
        obj.calc();
        sc.close();
    }
}
