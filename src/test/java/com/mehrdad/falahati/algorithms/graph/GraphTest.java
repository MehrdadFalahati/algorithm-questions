package com.mehrdad.falahati.algorithms.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void test_find_element_from_node_by_BFS() {
        var graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "E");
        assertTrue(graph.findElementFormNodesByBFS("A", "D"));
        assertFalse(graph.findElementFormNodesByBFS("B", "E"));
    }

}