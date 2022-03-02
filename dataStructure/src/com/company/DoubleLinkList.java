package com.company;

public class DoubleLinkList implements LinkList {

    DoubleNode startNode, currentNode;

    @Override
    public void createLinkList(int data) {
        DoubleNode node = new DoubleNode(data, null, null);

        if (startNode == null) {
            startNode = node;
        } else {
            node.setPreviousPointer(currentNode);
            currentNode.setPointer(node);

            currentNode = node;
        }

        currentNode = node;
    }

    @Override
    public void showLinkList() {
        Node root = startNode;

        while (root != null) {
            System.out.print(root.getData() + "-->");
            root = root.getPointer();
        }
        System.out.println();
    }

    public void insertInStart(
            int data
    ) {
        DoubleNode node = new DoubleNode(data, null, null);
        if (startNode != null) {
            startNode.setPreviousPointer(node);
            node.setPointer(startNode);
        }
        startNode = node;
    }

    public void insertInPosition(
            int position,
            int data
    ) {
        DoubleNode root = startNode;

        if (position == 0) {
            insertInStart(data);
        } else {
            DoubleNode node = new DoubleNode(data, null, null);
            while (position-- != 0) {
                if (root == null) {
                    createLinkList(data);
                    return;
                }
                root = (DoubleNode) root.getPointer();
            }

            root.getPreviousPointer().setPointer(node);
            node.setPreviousPointer(root.getPreviousPointer());
            root.setPreviousPointer(node);
            node.setPointer(root);
        }
    }

    public void deleteNode(
            int position
    ) {
        DoubleNode root = startNode;
        if (position == 0) {
            root = (DoubleNode) root.getPointer();
            root.getPreviousPointer().setPointer(null);
            root.setPreviousPointer(null);
            startNode = root;
        } else {
            while (--position != 0) {
                if (root == null) return;
                root = (DoubleNode) root.getPointer();
            }
            root = (DoubleNode) root.getPointer();
            root.getPreviousPointer().setPointer(
                    root.getPointer()
            );
            ((DoubleNode) root.getPointer()).setPreviousPointer(root.getPreviousPointer());
            root.setPointer(null);
            root.setPreviousPointer(null);
        }
    }
}

class DoubleNode extends Node {

    private DoubleNode previousPointer = null;

    DoubleNode(int data, Node nextPointer, DoubleNode previousPointer) {
        super(data, nextPointer);
        this.previousPointer = previousPointer;
    }

    public DoubleNode getPreviousPointer() {
        return previousPointer;
    }

    public void setPreviousPointer(DoubleNode previousPointer) {
        this.previousPointer = previousPointer;
    }
}
