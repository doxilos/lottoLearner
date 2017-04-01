import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Nurbaki on 30.3.2017.
 */

public class TotalPrediction {

    int MAX = Init.MAX;

    public double[] totalPrediction() {
        double[] lottoNo = new double[MAX];
        double[] lottoResults = new double[MAX * 6];
        double[] result = new double[6];

        try {
            CSVReader reader = new CSVReader(new FileReader("lotodb.csv"), '\t');
            String[] nextLine;
            int redun = 0;
            int n = 0;
            while ((nextLine = reader.readNext()) != null) {
                // nextLine[] is an array of values from the line
                lottoNo[redun] = new Double(nextLine[0]);
                int i = 0;

                for (; i < 6; i++) {
                    lottoResults[n] = Double.parseDouble(nextLine[i + 1]);
                    n++;
                }

                redun++;
            }
            System.out.println(Arrays.toString(lottoResults));
            System.out.println(Arrays.toString(lottoNo));

        } catch (IOException e) {
            e.printStackTrace();
        }

        Arrays.sort(lottoResults);
        int i =0;
        double[] temp= new double[MAX];
        for(;i<MAX;i+=6){
            temp[i] = lottoResults[i/6];
            LinearRegression lr = new LinearRegression(temp,lottoNo);
            System.out.println(lr.predict(494));
        }




        return result;
    }
}
