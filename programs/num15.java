import java.util.Random;

class Rand {
    void gen() {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(r.nextInt(100) + 1);
        }
    }
}

public class RandomNumber {
    public static void main(String[] args) {
        Rand obj = new Rand();
        obj.gen();
    }
}
