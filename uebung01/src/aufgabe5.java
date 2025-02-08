import java.util.Arrays;
import java.util.Random;


public class aufgabe5 {
    public static void main(String[] args) {
        Random rand = new Random();

        final int COL = 3;
        final int ROW = 3;

        int[][] a = new int [ROW][COL];
        int[][] b = new int [ROW][COL];

        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COL; j++){
                a[i][j] = rand.nextInt(30) * i + j;
                b[i][j] = rand.nextInt(30) * j + i;
            }
        }

        //checking matrix condition
        if(a[0].length != b.length){
            System.out.println("Condition for multiplying matrices are not met");
            return;
        }

        //printing out A:
        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COL; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        //printing out B:
        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COL; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        int[][] result = new int[ROW][COL];

        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COL; j++){
                result[i][j] = 0;

                for(int k = 0; k < COL; k++){
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(result));
    }
}