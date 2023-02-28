package pl.coderslab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {

        System.out.println(ConsoleColors.BLUE + "Please select an option:");
        String[][] array = {{"add"}, {"remove"}, {"list"}, {"exit"}};
        System.out.println(array[0][0]);
        System.out.println(array[1][0]);
        System.out.println(array[2][0]);
        System.out.println(array[3][0]);

        Scanner skan = new Scanner(System.in);
        String next = skan.next();

    }
}
