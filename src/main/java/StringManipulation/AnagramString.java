package StringManipulation;


import java.util.Arrays;

import org.testng.Assert;

public class AnagramString {

    //anagram string is a string which can be used to make another word with same length
    //and same characters

    public static void main(String args[]) {
        String a = "listen"; //anagram is "silent"
        String b = "silent";

        //1. Length should be equals
        //2. contains same characters within two string
        Assert.assertEquals(a.length(), b.length());
        Assert.assertTrue(Arrays.equals(a.toCharArray(), b.toCharArray()));
    }
}
