import java.util.ArrayList;
import java.util.List;

public class VertexCalc {
    VertexesOfPoint calculateAllVertexes(ArrayList<Coordinate> coordinates) {
        int size = coordinates.size();

        List<ArrayList<Float>> points=null;
        ArrayList<Float> pointVertexes = new ArrayList<>();
        VertexesOfPoint vop = null;

        for (int i = 0; i < size; i++) {
            float x = coordinates.get(i).X;
            float y = coordinates.get(i).Y;
            int b = 0;
            for (int a = i + 1; a < size; a++) {

                float temp = vertexLength(x, y, coordinates.get(a).X, coordinates.get(a).Y);
                pointVertexes.add(b,temp);
            }

            points.add(i,pointVertexes);

        }
        vop = new VertexesOfPoint(pointVertexes, points);
        return vop;
    }


    float vertexLength(float x1, float y1, float x2, float y2 ){
        return (float) Math.sqrt(
                Math.abs(x2 - x1) + Math.abs(y2 - y1));
    }
}

