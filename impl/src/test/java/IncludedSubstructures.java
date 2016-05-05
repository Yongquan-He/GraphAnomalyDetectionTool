import GAD.algorithms.helper.IncludedSubstructuresFinder;
import GAD.graph.StringEdge;
import GAD.graph.StringVertex;
import manual.TestUtils;
import org.jgrapht.DirectedGraph;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by jkordas on 03/05/16.
 */
public class IncludedSubstructures {
    @Test
    public void simpleTest() {
        DirectedGraph<StringVertex, StringEdge> g1 = TestUtils.createCompressSubstructure1();
        DirectedGraph<StringVertex, StringEdge> g2 = TestUtils.createCompressSubstructure2();
        List<DirectedGraph<StringVertex, StringEdge>> substructures1 = IncludedSubstructuresFinder.includedSubstructures(g1);
        List<DirectedGraph<StringVertex, StringEdge>> substructures2 = IncludedSubstructuresFinder.includedSubstructures(g2);

        assertEquals(5, substructures1.size());
        assertEquals(20, substructures2.size());
    }
}