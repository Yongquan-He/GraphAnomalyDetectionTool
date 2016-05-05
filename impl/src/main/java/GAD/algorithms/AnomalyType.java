package GAD.algorithms;

import GAD.graph.StringEdge;
import GAD.graph.StringVertex;
import org.jgrapht.DirectedGraph;

import java.util.List;

/**
 * Created by jkordas on 05/05/16.
 */
public enum AnomalyType {
    MODIFICATION {
        @Override
        public List<Anomaly> findAnomalies(DirectedGraph<StringVertex, StringEdge> graph) {
            return GBAD_MDL.findAnomalies(graph);
        }
    },
    ADDITION {
        @Override
        public List<Anomaly> findAnomalies(DirectedGraph<StringVertex, StringEdge> graph) {
            return GBAD_P.findAnomalies(graph);
        }
    },
    DELETION {
        @Override
        public List<Anomaly> findAnomalies(DirectedGraph<StringVertex, StringEdge> graph) {
            return GBAD_MPS.findAnomalies(graph);
        }
    };

    public abstract List<Anomaly> findAnomalies(DirectedGraph<StringVertex, StringEdge> graph);
}
