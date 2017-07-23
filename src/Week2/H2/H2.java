package Week2.H2;

import java.util.Arrays;

/**
 * Created by nick on 19.07.2017.
 */
public class H2 {
    public static void main(String[] args) {
        int [][] x =  {
            {12,-1},
            {7,0}
        };
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[i].length; j++){
                x[i][j] = x[i][j]*3;
            }
        }

        System.out.println(Arrays.deepToString(x));
    }
}

