package net.htlgkr.mittermayrm180114.beispiel3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester implements NumberTest {
    private final String FILENAME;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    public NumberTester(String fileName) {
        this.FILENAME = fileName;
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            int testCases = Integer.parseInt(br.readLine());

            for (int i = 0; i < testCases; i++) {
                String line = br.readLine();
                String[] parts = line.split(" ");

                int testCase = Integer.parseInt(parts[0]);
                int testNumber = Integer.parseInt(parts[1]);

                switch (testCase) {
                    case 1:
                        System.out.println((oddTester.testNumber(testNumber)) ? "EVEN" : "ODD");
                        break;
                    case 2:
                        System.out.println((primeTester.testNumber(testNumber)) ? "PRIME" : "NO PRIME");
                        break;
                    case 3:
                        System.out.println((palindromeTester.testNumber(testNumber)) ? "PALINDROME" : "NO PALINDROME");
                }
            }

        } catch (IOException e) {
            System.out.println("Ein unerwarteter Fehler ist aufgetreten!");
        }
    }

    @Override
    public boolean testNumber(int number) {
        return false;
    }
}