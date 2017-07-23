package Week2.H3;

import java.util.Arrays;

/**
 * Created by nick on 19.07.2017.
 */
public class H3 {
    public static void main(String[] args) {
        int [][] x =  {
            {12,-1},
            {7,0}
        };
        int [][] y =  {
                {3,-9},
                {5,4}
        };
        int row = 0;
        int col = 0;
        for(int i=0; i<x.length; i++){
            if (row < x.length){
                row = x.length;
            }
            for(int j=0; j<x[i].length; j++){
                if (col < x[i].length){
                    col = x[i].length;
                }
            }
        }
        for(int i=0; i<y.length; i++){
            if (row < y.length){
                row = y.length;
            }
            for(int j=0; j<y[i].length; j++){
                if (col < y[i].length){
                    col = y[i].length;
                }
            }
        }

        int z [][] = new int [row][col];
        for(int i=0; i<z.length; i++){
            for(int j=0; j<z[i].length; j++){
                z[i][j] = x[i][j] + y[i][j];
            }
        }


        System.out.println(Arrays.deepToString(z));
    }
}

