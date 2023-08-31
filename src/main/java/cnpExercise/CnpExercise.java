package cnpExercise;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CnpExercise {

    public static int cnpEx(int[] cnp){
        int[] arrCNP = {2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9};
        int[] cnpResult = new int[12];
        int cifraControl;
        //inmultirea elementelor din ambele array
        for (int i = 0; i < arrCNP.length; i++) {
            cnpResult[i] = arrCNP[i] * cnp[i];
        }
        //adunarea indecsilor
        int sumArray = 0;
        for (int i = 0; i < cnpResult.length; i++) {
            sumArray += cnpResult[i];
        }
        if (sumArray % 11 == 10) {
            cifraControl = 1;
        } else {
            cifraControl = 0;
        }
        return cifraControl;
    }
}