package net.chewett.github.gradlepackagedjarexample;

import java.util.Arrays;
import com.google.gson.Gson;

public class GradleImportTest {

    public static void main(String[] args) {
        Gson gson = new Gson();
        int[] ints2 = gson.fromJson("[1,2,3,4,5]", int[].class);
        System.out.println("JSON int array converted from a string by Gson");
        System.out.println(Arrays.toString(ints2));
    }
}
