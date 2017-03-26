
import java.util.Arrays;
import java.util.List;
import flanagan.analysis.Regression;
public class Init {

    /**
     * Generates a number array between given numbers
     * @param num1
     * @param num2
     * @return
     */
    public static double[] generateNumbers(int num1,int num2){
        double[] nums=new double[num2];
        for(int i=num1; i<=num2;i++){
            nums[i-1]=i;
        }
        return nums;
    }

    /** MAIN CLASS **
     */
    public static void main (String Args[]){
        //final double[] X54 = generateNumbers(1,54);

        //Generate lotto test
        int[] i = GenerateLotto.generateLotto(54,6);
        //System.out.println(Arrays.toString(i));
        //TotalRegression Test
        double[] x = new double[]{1,1,1,2,2,2};
        double[] y = new double[]{5,4,6,3,7,8};
        double[][] xy = new double[][]{x,y};
        LinearRegression linr = new LinearRegression(x,y);
        System.out.println(linr.toString());
        System.out.println(linr.predict(3));
        Regression r = new Regression();
        r.enterData(x,y);
        r.linearPlot();
    }


}
