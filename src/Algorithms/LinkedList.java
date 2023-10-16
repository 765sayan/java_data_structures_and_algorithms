package Algorithms;

public class LinkedList {
    Node firstNode;

    public void insertValues(int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;
        if (firstNode == null) {
            firstNode = node;
        } else {
            Node traverseNode = firstNode;
            while (traverseNode.next != null) {
                traverseNode = traverseNode.next;
            }
            traverseNode.next = node;
        }
    }

    public void insertAt(int index, int value) {
        Node node = new Node();
        node.value = value;
        int i = 0;
        if (firstNode != null) {
            Node traverseNode;
            Node previousNextNode = new Node();
            traverseNode = firstNode;
            if(index != 0) {
                while (i <= index) {
                    if (i == index) {
                        traverseNode.next = previousNextNode;
                    } else if (i == index - 1) {
                        previousNextNode = traverseNode.next;
                        traverseNode.next = node;
                    }
                    traverseNode = traverseNode.next;
                    i = i + 1;
                }
            }
            else {
                node.next = firstNode;
                firstNode = node;
            }
        }
    }

    public void insertValueAtStart(int value) {
        Node node = new Node();
        node.value = value;
        node.next = firstNode;
        firstNode = node;
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
            while (traverseNode.next != null) {
                System.out.print(" " + traverseNode.value);
                traverseNode = traverseNode.next;
            }

            System.out.print(" " + traverseNode.value);
        }
        else {
            System.out.println("");
        }
    }

//    public void reverse() {
//        if (firstNode != null) {
//            Node traverseNode = firstNode;
//            int i=0;
//
//            while(traverseNode != null) {
//                array[i] = traverseNode;
//                if (traverseNode.next == null) {
//                    while(i>=0) {
//
//                    }
//                }
//                i=i+1;
//                traverseNode = traverseNode.next;
//            }
//        }
//    }
}

