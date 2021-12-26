package net.htlgkr.mittermayrm180114.beispiel3;

public class Main {
    public static void main(String[] args) {
        NumberTest isEven = (n) -> (n % 2) == 0;
        NumberTest isPrime = (n) -> {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        NumberTest isPalindrome = (n) -> {
            String nString = String.valueOf(n);
            char[] nCharArray = nString.toCharArray();
            for (int i = 0; i < nCharArray.length; i++) {
                for (int j = nCharArray.length - 1; j > 0; j--) {
                    if (i != j) {
                        return false;
                    }
                }
            }
            return true;
        };

        NumberTester nt = new NumberTester("Number Tests.csv");
        nt.setOddEvenTester(isEven);
        nt.setPrimeTester(isPrime);
        nt.setPalindromeTester(isPalindrome);
        nt.testFile();
    }
}