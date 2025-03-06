class Alphabet {
    void print() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Alphabet obj = new Alphabet();
        obj.print();
    }
}
