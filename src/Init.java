import java.util.Arrays;

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

    public static void main (String Args[]){
        final double[] XES = generateNumbers(1,54);
        System.out.println(Arrays.toString(XES));
    }


}
