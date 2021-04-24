package net.chewett.github.gradlepackagedjarexample;

import java.util.Arrays;
import com.google.gson.Gson;

public class GradleImportTest {

    /**
     * Simple main function that loads the google Gson library and converts it to an array of ints.
     * @param args No arguments for this simple program, not used.
     */
    public static void main(String[] args) {
        Gson gson = new Gson();
        int[] ints2 = gson.fromJson("[1,2,3,4,5]", int[].class);
        System.out.println("JSON int array converted from a string by Gson");
        System.out.println(Arrays.toString(ints2));
    }
}
