package com.example.anastasia.nodes;

import java.util.List;

public class Node {
    long id;
    int value;
    List<Node> children;

    public Node(long id, int value, List<Node> children) {
        this.id = id;
        this.value = value;
        this.children = children;
    }

    public Node() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public long getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public List<Node> getChildren() {
        return children;
    }
}
