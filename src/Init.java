
import com.opencsv.CSVReader;
import javax.swing.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Init extends JFrame {

    /** MAIN CLASS **
     */
    public static void main (String Args[]){

        double[] lottoN = new double[491];
        double[] lottoS = new double[491*6];

        try {
            CSVReader reader = new CSVReader(new FileReader("lotodb.csv"),'\t');
            String[] nextLine;
            int redun = 0;
            int n = 0;
            while ((nextLine = reader.readNext()) != null) {
                // nextLine[] is an array of values from the line
                lottoN[redun] = new Double(nextLine[0]);
                int i = 0;

                for(;i<6;i++){
                    lottoS[n]=Double.parseDouble(nextLine[i+1]);
                    n++;
                }

                redun++;
            }
            System.out.println(Arrays.toString(lottoS));
            System.out.println(Arrays.toString(lottoN));

        } catch (IOException e) {
            e.printStackTrace();
        }


        double[] X= new double[491*6];
        for (int n=0;n<X.length;n++) {
            X[n]=lottoN[n/6];
        }
        System.out.println(Arrays.toString(X));

        double[] Y = lottoS;
        System.out.println(X.length+" "+Y.length);


        //Parsing

        LinearRegression LR= new LinearRegression(X,Y);
        System.out.println(LR.toString()+" /prediction> "+LR.predict(493));

        //Reversing

        LinearRegression LR2 = new LinearRegression(Y,X);
        System.out.println(LR2.toString()+" /prediction> "+LR2.predict(493));



    }


}
