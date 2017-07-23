package Week2.H1;

import java.util.Arrays;

/**
 * Created by nick on 19.07.2017.
 */
public class H1 {
    public static void main(String[] args) {
        double x[][] = new double [3][3];
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[i].length; j++){
                x[i][j] = Math.random()*10;
            }
        }

        System.out.println(Arrays.deepToString(x));
    }
}

