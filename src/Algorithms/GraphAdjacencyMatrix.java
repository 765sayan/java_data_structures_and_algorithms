package Algorithms;

import java.util.ArrayList;

public class GraphAdjacencyMatrix {

    public int V;
    public int E;

    public ArrayList<ArrayList<Integer>> AdjMatrix = new ArrayList<>();

    public int getV() {
        return V;
    }

    public void setV(int v) {
        V = v;
    }

    public int getE() {
        return E;
    }

    public void setE(int e) {
        E = e;
    }


}
