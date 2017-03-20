import java.util.ArrayList;
import java.util.List;

/**
 * Points and vertexes to all points
 */
public class VertexesOfPoint {

    public ArrayList getVertexList() {
        return VertexList;
    }
    Point Point;
    ArrayList VertexList;

    /**
     *  @param VertexList VertexList of a point
     * @param Point A point which has x and y coordinates.
     */
    VertexesOfPoint(ArrayList VertexList, Point Point){
        this.VertexList = VertexList;
        this.Point = Point;
    }

}
