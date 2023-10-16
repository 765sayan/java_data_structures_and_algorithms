package Algorithms;

public class CircularLinkedList {
    Node firstNode;

    public static int recursiveLoop(Node traverseNode, int index, int i, Node previousNextNode, Node node) {
        if (i == index) {
            traverseNode.next = previousNextNode;
            return 0;
        } else if(i == index - 1) {
            previousNextNode = traverseNode.next;
            traverseNode.next = node;
        }
        traverseNode = traverseNode.next;
        i=i+1;
        return recursiveLoop(traverseNode, index, i, previousNextNode, node);
    }

    public void insertValues(int value) {
        Node node = new Node();
        node.value = value;
        if (firstNode == null) {
            firstNode = node;
            firstNode.next = firstNode;
        } else {
            node.next = firstNode;
            Node traverseNode = firstNode;
            while (traverseNode.next != firstNode) {
                traverseNode = traverseNode.next;
            }
            traverseNode.next = node;
        }
    }

    // Recursive implementation
    public void insertAt(int index, int value) {
        int i = 0;
        if (firstNode != null) {
            Node traverseNode;
            Node previousNextNode = new Node();
            traverseNode = firstNode;
            if(index != 0) {
                Node node = new Node();
                node.value = value;
                recursiveLoop(traverseNode, index, i, previousNextNode, node);
            }
            else {
                Node newFirstNode = new Node();
                newFirstNode.value = firstNode.value;
                newFirstNode.next = firstNode.next;
                firstNode.value = value;
                firstNode.next = newFirstNode;
            }
        }
    }

    // Iterative implementation
//    public void insertAt(int index, int value) {
//        int i = 0;
//        if (firstNode != null) {
//            Node traverseNode;
//            Node previousNextNode = new Node();
//            traverseNode = firstNode;
//            if(index != 0) {
//                Node node = new Node();
//                node.value = value;
//                while (i <= index) {
//                    if (i == index) {
//                        traverseNode.next = previousNextNode;
//                    } else if (i == index - 1) {
//                        previousNextNode = traverseNode.next;
//                        traverseNode.next = node;
//                    }
//                    traverseNode = traverseNode.next;
//                    i = i + 1;
//                }
//
//            }
//            else {
//                Node newFirstNode = new Node();
//                newFirstNode.value = firstNode.value;
//                newFirstNode.next = firstNode.next;
//                firstNode.value = value;
//                firstNode.next = newFirstNode;
//            }
//        }
//    }

    public void insertValueAtStart(int value) {
        Node newFirstNode = new Node();
        newFirstNode.value = firstNode.value;
        newFirstNode.next = firstNode.next;

        firstNode.value = value;
        firstNode.next = newFirstNode;
    }

    public void deleteAt(int index) {
        if (firstNode != null) {
            int i = 0;
            Node traverseNode;
            traverseNode = firstNode;
            Node nodeBeforeDeletedOne = new Node();
            if (index != 0) {
                while (i <= index) {
                    if (i == index) {
                        nodeBeforeDeletedOne.next = traverseNode;
                    } else if (i == index - 1) {
                        nodeBeforeDeletedOne = traverseNode;
                        traverseNode = traverseNode.next;
                    }
                    traverseNode = traverseNode.next;
                    i = i + 1;
                }
            }
            else {
                firstNode = traverseNode.next;
            }
        }else {
            firstNode = null;
        }
    }

    public void deleteAll() {
        if (firstNode != null) {
            firstNode.next = null;
            firstNode = null;
        } else {
            firstNode = null;
        }
    }

    public void editAt(int index, int value) {
        Node traverseNode = firstNode;
        int i=0;
        while(i<=index) {
            if(i == index) {
                traverseNode.value = value;
            }
            traverseNode = traverseNode.next;
            i=i+1;
        }
    }

    public void show() {
        if (firstNode != null) {
            Node traverseNode = firstNode;
            while (traverseNode.next != firstNode) {
                System.out.print(" " + traverseNode.value);
                traverseNode = traverseNode.next;
            }

            System.out.print(" " + traverseNode.value);
        }
        else {
            System.out.println("");
        }
    }
}
