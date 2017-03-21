import java.util.Arrays;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;


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
        final double[] X54 = generateNumbers(1,54);


        Graph graph = new SingleGraph("I can see dead pixels");
        Viewer viewer = graph.display();
        graph.addNode("A");
        graph.addNode("B");
        Node n = graph.getNode("A");
        n.setAttribute("x","0");

    }


}
