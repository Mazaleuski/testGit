package by.teachmeskills.homeworks.hw_17022023;

public class JaggedArray {
    public static void main(String[] args) {

        int[][] array = new int[(int) (Math.random() * 8 + 7)][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[(int) (Math.random() * 10 + 1)];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
