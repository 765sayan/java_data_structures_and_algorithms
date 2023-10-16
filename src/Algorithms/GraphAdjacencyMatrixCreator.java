package Algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;



public class GraphAdjacencyMatrixCreator {

    GraphAdjacencyMatrix graph;
    public GraphAdjacencyMatrixCreator(GraphAdjacencyMatrix graph) {
        this.graph = graph;
    }

    public void createAdjMatrixBasedGraph(Scanner scannerObj) {

        System.out.println("\nNumber of Vertices: ");
        int vertices = scannerObj.nextInt();

        System.out.println("Number of Edges: ");
        int edges = scannerObj.nextInt();

        graph.setV(vertices);
        graph.setE(edges);

        for (int u = 0; u < graph.V; u++) {
            ArrayList<Integer> tempArrayList = new ArrayList<Integer>();
            for (int v = 0; v < graph.V; v++) {
                tempArrayList.add(v, 0);
            }
            graph.AdjMatrix.add(u, tempArrayList);
        }

        for(int i=0; i<graph.E; i++) {
            System.out.println("Enter the vertex 1 for the edge: ");
            int vertex1 = scannerObj.nextInt();

            System.out.println("Enter the vertex 2 for the edge: ");
            int vertex2 = scannerObj.nextInt();

            ArrayList<Integer> rowArrayList1 = graph.AdjMatrix.get(vertex1);
            rowArrayList1.set(vertex2, 1);
            graph.AdjMatrix.set(vertex1, rowArrayList1);

            ArrayList<Integer> rowArrayList2 = graph.AdjMatrix.get(vertex2);
            rowArrayList2.set(vertex1, 1);
            graph.AdjMatrix.set(vertex2, rowArrayList2);
        }
    }

    public void printMatrix(ArrayList<ArrayList<Integer>> AdjMatrix) {
        System.out.print("\nThe Adjacency Matrix Representation Of The Graph Is: \n");
        for (int u = 0; u < AdjMatrix.size(); u++) {
            for (int v = 0; v < AdjMatrix.get(u).size(); v++) {
                System.out.print(" " + AdjMatrix.get(u).get(v));
            }
            System.out.print("\n");
        }
    }

}

