package by.teachmeskills.homeworks.hw_10022023;

/*
        Write a function to convert a name into initials.
        This kata strictly takes two words with one space in between them.
        The output should be two capital letters with a dot separating them.
*/

public class AbbreviateTwoWords {
    public static void main(String[] args) {
        System.out.println(abbrevName("Donald duck"));
    }

    public static String abbrevName(String name) {
        String[] array = name.split(" ");
        return (array[0].charAt(0) + "." + array[1].charAt(0)).toUpperCase();
    }
}
