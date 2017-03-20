import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;


/**
 * Calculates the vertexes of points to other points
 */
public class VertexCalc {


    /** Calculates vertexes of all points and returns points with their vertexes
     *
     * @param coordinates Takes Coordinate object. See coordinate.java
     * @return Returns Vertexes of point Array list. Each point has vertex list.
     */
    VertexesOfPoint calculateAllVertexes(ArrayList<Coordinate> coordinates) {
        //Size of coordinates
        int size = coordinates.size();
        //Wrapped points values in Atomic Reference because points.add method may produce Null Pointer Exc
        AtomicReference<List<ArrayList<Float>>> points= new AtomicReference<>(null);
        ArrayList<Float> pointVertexes = new ArrayList<>();
        VertexesOfPoint vop;

        for (int i = 0; i < size; i++) {
            float x = coordinates.get(i).X;
            float y = coordinates.get(i).Y;
            int b = 0;
            for (int a = i + 1; a < size; a++) {
                float temp = vertexLength(x, y, coordinates.get(a).X, coordinates.get(a).Y);
                pointVertexes.add(b,temp);
            }

            points.get().add(i,pointVertexes);
        }
        vop = new VertexesOfPoint(pointVertexes, points.get());
        return vop;
    }


    /** Returns vertex length
     *
     * @param x1 x start
     * @param y1 y start
     * @param x2 x end
     * @param y2 y end
     * @return Vertex Length
     */
    private float vertexLength(float x1, float y1, float x2, float y2 ){
        return (float) Math.sqrt(
                Math.abs(x2 - x1) + Math.abs(y2 - y1));
    }
}

