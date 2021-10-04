package net.htlgkr.mittermayrm180114.beispiel3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester implements NumberTest
{
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    public NumberTester(String fileName)
    {

    }

    public void setOddEvenTester(NumberTest oddTester)
    {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester)
    {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester)
    {
        this.palindromeTester = palindromeTester;
    }

    public void testFile()
    {

    }

    public void readFile(String fileName)
    {
        try(BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            int testCases = Integer.parseInt(br.readLine());

            String line;

            while((line = br.readLine()) != null)
            {
                String[] parts = line.split(" ");

                int testCase = Integer.parseInt(parts[0]);
                int number = Integer.parseInt(parts[1]);
            }

        }
        catch(IOException e)
        {
            System.out.println("Ein unerwarteter Fehler ist aufgetreten!");
        }
    }

    @Override
    public boolean testNumber(int number)
    {
        return false;
    }
}