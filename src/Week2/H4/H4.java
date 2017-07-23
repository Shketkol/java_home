package Week2.H4;

import java.util.Arrays;

/**
 * Created by nick on 19.07.2017.
 */
public class H4 {
    public static void main(String[] args) {
        int [][] x =  {
            {12,-1,7},
            {7,0,3},
            {5,9,6}
        };
        int [][] y =  new int [3][3];
        for(int i=0; i<y.length; i++){
            for(int j=0; j<y.length; j++){
                y[i][j] = x[j][i];
            }
        }

        System.out.println(Arrays.deepToString(y));
    }
}

