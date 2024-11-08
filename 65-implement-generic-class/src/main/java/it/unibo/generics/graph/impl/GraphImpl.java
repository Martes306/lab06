package it.unibo.generics.graph.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import it.unibo.generics.graph.api.Graph;

public class GraphImpl<N> implements Graph<N>{ 

    private final Map<N, Set<N>> graph = new HashMap<>();

    @Override
    public void addNode(N node) {
        this.graph.put(node, null);
    }

    @Override
    public void addEdge(N source, N target) {
        Set<N> grapEdges = this.graph.get(source);
        if (grapEdges == null){
            grapEdges = new HashSet<>();
            grapEdges.add(target);
            this.graph.put(source, grapEdges);
        }
    }

    @Override
    public Set<N> nodeSet() {
        return null;
    }

    @Override
    public Set<N> linkedNodes(N node) {
        return null;   
    }

    @Override
    public List<N> getPath(N source, N target) {
        return null;
    }

    
    
}
