package com.mehrdad.falahati.algorithms.graph;

import java.util.*;

public class Graph {
    private record Node(String label) {
        @Override
        public String toString() {
            return label;
        }
    }

    private final Map<String, Node> nodes = new HashMap<>();
    private final Map<Node, List<Node>> adjacencyList = new HashMap<>();

    public void addNode(String label) {
        var node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to) {
        var fromNode = nodes.get(from);
        if (fromNode == null)
            throw new IllegalArgumentException();
        var toNode = nodes.get(to);
        if (toNode == null)
            throw new IllegalArgumentException();

        adjacencyList.get(fromNode).add(toNode);
    }

    public void removeNode(String label) {
        var node = nodes.get(label);
        if (node == null)
            return;

        for (var n: adjacencyList.keySet())
            adjacencyList.get(n).remove(node);

        adjacencyList.remove(node);
        nodes.remove(label);
    }

    public void removeEdge(String from, String to) {
        var fromNode = nodes.get(from);
        var toNode = nodes.get(to);

        if (fromNode == null || toNode == null)
            return;

        adjacencyList.get(fromNode).remove(toNode);
    }

    public void print() {
        for (var source : adjacencyList.keySet()) {
            var target = adjacencyList.get(source);
            if (!target.isEmpty())
                System.out.println(source + " is connected with " + target);
        }
    }

    public boolean findElementFormNodesByBFS(String from, String searchLabel) {
        var node = nodes.get(from);
        if (node == null)
            return false;

        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            var currentNode = queue.remove();

            if (visited.contains(currentNode))
                continue;
            visited.add(currentNode);

            if (currentNode.label.equals(searchLabel))
                return true;

            for (var neighbour : adjacencyList.get(currentNode))
                if (!visited.contains(neighbour))
                    queue.add(neighbour);
        }
        return false;
    }
}
