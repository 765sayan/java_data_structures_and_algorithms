import java.io.BufferedInputStream;
import java.util.Scanner;

import Algorithms.CircularLinkedList;
import Algorithms.GraphAdjacencyMatrix;
import Algorithms.GraphAdjacencyMatrixCreator;
import Algorithms.LinkedList;
import Algorithms.RecursiveAlgorithm;

import javax.lang.model.type.NullType;

public class Main {

    public static int takeInput(Scanner scannerObj) {
        System.out.println("\n0: Stop, 1: Recursive Algorithm, 2: LinkedList Implementation, 3: Graph Using Adjacency Matrix");

        System.out.println("\nEnter what to do: ");
        int inputSignal = scannerObj.nextInt();
        switch (inputSignal) {
            case 0:
                return 0;
            case 1:
                recursiveAlgorithm(scannerObj);
                break;
            case 2:
                linkedListMethod(scannerObj);
                break;
            case 3:
                graphMethod(scannerObj);
                break;
        }
        takeInput(scannerObj);
        return 0;
    }

    public static int recursiveAlgorithm(Scanner scannerObj) {
        System.out.println("\n\nAn Example Recursive Program");
        System.out.println("-----------------------------");

        System.out.println("\n1: Find out Factorial: ");
        System.out.println("0: Stop");

        int inputSignal = scannerObj.nextInt();
        switch (inputSignal) {
            case 1:
                System.out.print("\n\nFactorial of :");
                int inputValue = scannerObj.nextInt();
                int factorial = RecursiveAlgorithm.recursiveFactorial((inputValue));
                System.out.print(" is : ");
                System.out.print(factorial);
                break;
            case 0:
                return 0;
        }
        recursiveAlgorithm(scannerObj);
        return 0;
    }


    public static int linkedListMethod(Scanner scannerObj) {
        System.out.println("\n\nAn Example LinkedList");
        System.out.println("-----------------------------");

        System.out.println("\n\n1: Single LinkedList, 2: Circular LinkedList");
        System.out.println("\n0: Stop");
        System.out.println("\nEnter what to do: ");
        int inputSignal = scannerObj.nextInt();

        switch (inputSignal) {
            case 0:
                return 0;
            case 1:
                LinkedList linkedList = new LinkedList();
                singlelinkedListMethod(scannerObj, linkedList);
                break;
            case 2:
                CircularLinkedList circularLinkedList = new CircularLinkedList();
                circularlinkedListMethod(scannerObj, circularLinkedList);
                break;
        }
        linkedListMethod(scannerObj);
        return 0;
    }

    public static int graphMethod(Scanner scannerObj) {
        System.out.println("\n\nAn Example Graph");
        System.out.println("-----------------------------");

        System.out.println("\n\n1: Graph Using Adjacency Matrix");
        System.out.println("\n0: Stop");
        System.out.println("\nEnter what to do: ");
        int inputSignal = scannerObj.nextInt();

        switch (inputSignal) {
            case 0:
                return 0;
            case 1:
                GraphAdjacencyMatrix graph = new GraphAdjacencyMatrix();
                GraphAdjacencyMatrixCreator graphAdjacencyMatrixCreator = new GraphAdjacencyMatrixCreator(graph);
                graphAdjacencyMatrixMethod(scannerObj, graph, graphAdjacencyMatrixCreator);
                break;
        }
        graphMethod(scannerObj);
        return 0;
    }

    public static int singlelinkedListMethod(Scanner scannerObj, LinkedList linkedList) {
        System.out.println("\n\nAn Example Single LinkedList");
        System.out.println("-----------------------------");

        System.out.println("\n1: Insert Values, 2: Show Values, 3: Insert Values At Start");
        System.out.println("4: Insert Value At Index, 5: Delete Value At Index, 6: Delete All");
        System.out.println("7: Edit Value At Index, 0: Stop");

        System.out.println("\nEnter what to do: ");
        int inputSignal = scannerObj.nextInt();

        switch (inputSignal) {
            case 0:
                return 0;
            case 1:
                System.out.println("\n\nInsert Values in LinkedList: ");
                System.out.println("\n\nValue (Enter 0 to stop): ");
                while (scannerObj.hasNext()) {
                    System.out.println("Value (Enter 0 to stop): ");
                    int linkedListValueNode = scannerObj.nextInt();
                    if (linkedListValueNode != 0) {
                        linkedList.insertValues(linkedListValueNode);
                    } else {
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("\n\nThe linkedlist elements are: ");
                linkedList.show();

                break;
            case 3:
                System.out.println("\n\nTo enter elements at the start: ");
                System.out.println("\nvalue (Enter 0 to stop): ");
                while (scannerObj.hasNext()) {
                    System.out.println("value (Enter 0 to stop): ");
                    int linkedListInputNode = scannerObj.nextInt();
                    if (linkedListInputNode != 0) {
                        linkedList.insertValueAtStart(linkedListInputNode);
                    } else {
                        break;
                    }
                }
                break;
            case 4:
                System.out.println("\n\nTo insert value at particular index: ");
                System.out.println("\nInsert index: ");
                int index = scannerObj.nextInt();

                System.out.println("\nInsert value: ");
                int value = scannerObj.nextInt();
                linkedList.insertAt(index, value);
                break;
            case 5:
                System.out.println("\n\nTo Delete value at particular index: ");
                System.out.println("\nInsert index: ");
                int deleteIndex = scannerObj.nextInt();

                linkedList.deleteAt(deleteIndex);
                break;
            case 6:
                System.out.println("\n\nTo Delete the linked list: ");
                System.out.println("\nEnter 1: ");
                int deleteSignal = scannerObj.nextInt();
                if (deleteSignal == 1) {
                    linkedList.deleteAll();
                }
                break;
            case 7:
                System.out.println("\n\nTo Edit value at index: ");
                System.out.println("\nEnter index: ");
                int editIndex = scannerObj.nextInt();
                System.out.println("\nEnter value: ");
                int editValue = scannerObj.nextInt();
                linkedList.editAt(editIndex, editValue);
                break;
        }

        singlelinkedListMethod(scannerObj, linkedList);
        return 0;
    }

    public static int circularlinkedListMethod(Scanner scannerObj, CircularLinkedList linkedList) {
        System.out.println("\n\nAn Example Circular LinkedList");
        System.out.println("-----------------------------");

        System.out.println("\n1: Insert Values, 2: Show Values, 3: Insert Values At Start");
        System.out.println("4: Insert Value At Index, 5: Delete Value At Index, 6: Delete All");
        System.out.println("7: Edit Value At Index, 0: Stop");

        System.out.println("\nEnter what to do: ");
        int inputSignal = scannerObj.nextInt();

        switch (inputSignal) {
            case 0:
                return 0;
            case 1:
                System.out.println("\n\nInsert Values in LinkedList: ");
                System.out.println("\n\nValue (Enter 0 to stop): ");
                while (scannerObj.hasNext()) {
                    System.out.println("Value (Enter 0 to stop): ");
                    int linkedListValueNode = scannerObj.nextInt();
                    if (linkedListValueNode != 0) {
                        linkedList.insertValues(linkedListValueNode);
                    } else {
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("\n\nThe linkedlist elements are: ");
                linkedList.show();

                break;
            case 3:
                System.out.println("\n\nTo enter elements at the start: ");
                System.out.println("\nvalue (Enter 0 to stop): ");
                while (scannerObj.hasNext()) {
                    System.out.println("value (Enter 0 to stop): ");
                    int linkedListInputNode = scannerObj.nextInt();
                    if (linkedListInputNode != 0) {
                        linkedList.insertValueAtStart(linkedListInputNode);
                    } else {
                        break;
                    }
                }
                break;
            case 4:
                System.out.println("\n\nTo insert value at particular index: ");
                System.out.println("\nInsert index: ");
                int index = scannerObj.nextInt();

                System.out.println("\nInsert value: ");
                int value = scannerObj.nextInt();
                linkedList.insertAt(index, value);
                break;
            case 5:
                System.out.println("\n\nTo Delete value at particular index: ");
                System.out.println("\nInsert index: ");
                int deleteIndex = scannerObj.nextInt();

                linkedList.deleteAt(deleteIndex);
                break;
            case 6:
                System.out.println("\n\nTo Delete the linked list: ");
                System.out.println("\nEnter 1: ");
                int deleteSignal = scannerObj.nextInt();
                if (deleteSignal == 1) {
                    linkedList.deleteAll();
                }
                break;
            case 7:
                System.out.println("\n\nTo Edit value at index: ");
                System.out.println("\nEnter index: ");
                int editIndex = scannerObj.nextInt();
                System.out.println("\nEnter value: ");
                int editValue = scannerObj.nextInt();
                linkedList.editAt(editIndex, editValue);
                break;
        }

        circularlinkedListMethod(scannerObj, linkedList);
        return 0;
    }

    public static int graphAdjacencyMatrixMethod(Scanner scannerObj, GraphAdjacencyMatrix graph, GraphAdjacencyMatrixCreator graphAdjacencyMatrixCreator) {
        System.out.println("\n\nAn Example Graph Using Adjacency Matrix");
        System.out.println("-----------------------------");

        System.out.println("\n1: Create Graph Using Adjacency Matrix, 2: Print Graph Adjacency Matrix");
        System.out.println("0: Stop");

        System.out.println("\nEnter what to do: ");
        int inputSignal = scannerObj.nextInt();

        switch (inputSignal) {
            case 0:
                return 0;
            case 1:
                graphAdjacencyMatrixCreator.createAdjMatrixBasedGraph(scannerObj);
                break;
            case 2:
                graphAdjacencyMatrixCreator.printMatrix(graph.AdjMatrix);
                break;
        }
        graphAdjacencyMatrixMethod(scannerObj, graph, graphAdjacencyMatrixCreator);
        return 0;
    }

    public static void main(String[] args) {

        // The Scanner Object For Taking Input

        Scanner scannerObj = new Scanner(System.in);

        System.out.println("\n\nThis is a DSA Application: ");
        takeInput(scannerObj);
    }
}