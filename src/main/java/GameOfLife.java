import java.util.Arrays;
import java.util.Scanner;

public class GameOfLife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the length ");
        int length = sc.nextInt();
        System.out.println("Give the width ");
        int width = sc.nextInt();
        int[][] randomState = randomState(length, width);
//        int[][] nextState = nextState(randomState);
//        System.out.println(Arrays.deepToString(randomState));
        printRandomState(randomState);


    }

//    private static int[][] nextState(int[][] randomState) {
//
//    }

    private static void printRandomState(int[][] randomState) {
        for (int[] arrs: randomState){
            System.out.print("|");
            for(int j : arrs) {
                if (j == 1) {
                    System.out.print("⚰\uFE0F⚰\uFE0F");
                } else {
                    System.out.print("\uD83D\uDD7A\uD83D\uDD7A");
                }
            }
            System.out.println("|");
        }
    }

    private static int[][] randomState(int length, int width) {
        int[][] randomState = new int[length][width];
        for (int i = 0; i < randomState.length; i++) {
            for (int j = 0; j < randomState[i].length; j++) {
                double number = Math.random();
                if (number >= 0.8) {
                    randomState[i][j] = 0;
                }else {
                    randomState[i][j] = 1;
                }
            }
        }
        return randomState;
    }





}
