import java.util.Scanner;

class PalindromeCheck {
    int number;
    PalindromeCheck(int num) {
        number = num;
    }

    void checkPalindrome() {
        int og = num;
        int rev = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10; 
            rev = rev * 10 + digit;            
            temp /= 10;
        }

        if (og == rev) {
            System.out.println("palindrome number.");
        } else {
            System.out.println("not a palindrome.");
        }
    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        PalindromeCheck checker = new PalindromeCheck(num);
        checker.checkPalindrome(); 
        sc.close();
    }
}
