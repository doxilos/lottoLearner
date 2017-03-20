import java.util.ArrayList;


/**
 * Calculates the vertexes of points to other points
 * @author Nurbaki Vural
 */
public class VertexCalc {


    /** Calculates vertexes of all points and returns points with their vertexes
     *
     * @param points Takes Point object. See coordinate.java
     * @return Returns Vertexes of points Array list. Each points has vertex list.
     */
    VertexesOfAllPoints calculateAllVertexes(ArrayList<Point> points) {

        //Temporary vertexList to create vop
        ArrayList<Double> vertexList = new ArrayList<>();

        //Size of points list
        int size = points.size();

        //Creating VOP
        VertexesOfPoint vop = new VertexesOfPoint(vertexList,points.get(1));

        //Creating VOAP
        VertexesOfAllPoints voap = new VertexesOfAllPoints(vop,points);

        for (int i = 0; i < size; i++) {
            //Getting the nth point
            double x = points.get(i).X;
            double y = points.get(i).Y;
            //Resetting b value
            int b = 0;
            for (int a = i + 1; a < size; a++) {

                //Calculating length to all other points
                double temp = vertexLength(x, y, points.get(a).X, points.get(a).Y);

                //Adds, a point's length to all other points. We will use this in dijkstra algorithm
                vertexList.add(b,temp);
                //Increment on b
                b++;
            }
            //Adding vertex list to related point from main list
            voap.vop.Point = points.get(i);
            voap.vop.VertexList = vertexList;
        }

        return voap;
    }


    /** Returns vertex length
     *
     * @param x1 x start
     * @param y1 y start
     * @param x2 x end
     * @param y2 y end
     * @return Vertex Length
     */
    private double vertexLength(double x1, double y1, double x2, double y2 ){
        return Math.sqrt(
                Math.abs(x2 - x1) + Math.abs(y2 - y1));
    }
}

