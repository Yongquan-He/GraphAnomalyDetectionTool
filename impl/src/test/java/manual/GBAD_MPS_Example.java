package manual;

import GAD.algorithms.Anomaly;
import GAD.algorithms.GBAD_MPS;
import GAD.graph.StringEdge;
import GAD.graph.StringVertex;
import GAD.io.GraphReader;
import org.jgrapht.DirectedGraph;

import java.util.List;

/**
 * Created by jkordas on 12/03/16.
 */
public class GBAD_MPS_Example {
    public static void main(String[] args) {
//        DirectedGraph<StringVertex, StringEdge> g = manual.TestUtils.createCompressGraph();
        DirectedGraph<StringVertex, StringEdge> g = GraphReader.parse("graphModels/MPSGraph.csv");

        List<Anomaly> anomalies = GBAD_MPS.getInstance().findAnomalies(g);

        for (Anomaly anomaly : anomalies) {
            System.out.println("--------");
            System.out.println(anomaly);
        }
    }
}
