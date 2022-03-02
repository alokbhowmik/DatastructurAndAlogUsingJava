package com.company;

/**
 * NOTE:
 * PROBLEMS OF ARRAY:
 * 1. We can't Insert more element more than array size
 * 2. if Array size is more and no of items is very less them memory size is increase
 * <p>
 * * LINK LIST   solve those problem
 */
class SinglyLinkList {

    private Node startNode;
    private Node currentNode;

    public void createLinkList(
            int data
    ) {
        Node node = new Node(data, null);
        if (startNode == null) {
            startNode = node;
            currentNode = startNode;
        } else {
            currentNode.setPointer(node);
            currentNode = node;
        }
    }

    void showLinkList() {
        currentNode = startNode;
        System.out.println("START-->");
        while (currentNode != null) {
            System.out.print(currentNode.getData() + "-->");
            currentNode = currentNode.getPointer();
        }
        System.out.println("End");
    }

    public Node reverseLinkList() {
      Node currentNode = startNode;
      Node prevNode = null, temp;

      while(currentNode != null){
        temp = currentNode.getPointer();
        currentNode.setPointer(prevNode);
        prevNode = currentNode;
        currentNode = temp;
      }
      return currentNode;
    }

    public void deleteNode(int n, int k) {
        Node firstNode, secondNode, root, previousNode = null;
        int noOfDeletedElement = 0;

        firstNode = startNode;
        secondNode = startNode.getPointer();
        root = firstNode;


        if (secondNode == null && firstNode != null) {
            root = firstNode;
        } else {
            while (secondNode != null) {
                if (k > noOfDeletedElement) {
                    if (firstNode.getData() < secondNode.getData()) {
                        if (previousNode != null)
                            previousNode.setPointer(firstNode.getPointer());
                        firstNode.setPointer(null);
                        if (firstNode == root) {
                            root = secondNode;
                        }
                        noOfDeletedElement += 1;
                    }

                    if (firstNode.getPointer() != null)
                        previousNode = firstNode;
                    firstNode = secondNode;
                    secondNode = secondNode.getPointer();
                }else {
                    break;
                }
            }
        }

        if (noOfDeletedElement < k){
            int count = n - k -1;
            Node presentNode = root;
            while (count != 0){
                if (currentNode != null){
                    count --;
                    currentNode = currentNode.getPointer();
                }
            }
        }
        showList(root);
    }

     void showList(Node node) {
        while (node != null) {
            System.out.print("-->" + node.getData());
            node = node.getPointer();
        }
    }

    public void findMiddle(){
        Node first = startNode;
        Node slow = startNode;


        while(first != null && first.getPointer() != null){
            first = first.getPointer().getPointer();
            slow = slow.getPointer();
        }

        System.out.println("Middle" + slow.getData());
    }
}

class Node {
    private int data;
    private Node pointer;

    Node(int data, Node pointer) {
        this.data = data;
    }

    public Node getPointer() {
        return pointer;
    }

    public void setPointer(Node pointer) {
        this.pointer = pointer;
    }

    public int getData() {
        return data;
    }
}
