package pl.coderslab;

import java.util.Scanner;

public class TaskManager {
    static final String FILE_NAME = "tasks.csv";
    static final String[] OPTIONS = { "ADD", "REMOVE", "LIST", "EXIT" };
    static String[][] tasks;

    public static void main(String[] args) {

        printOptions(OPTIONS);

        Scanner skan = new Scanner(System.in);
        String next = skan.next();

    }

    public static void printOptions(String[] tab) {
        System.out.println(ConsoleColors.BLUE);
        System.out.println("Please select an option: " + ConsoleColors.RESET);

        for (String option : tab) {
            System.out.println(option);
        }

    }
}
