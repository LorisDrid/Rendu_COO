public class Node<T extends Comparable<T>> {
    private T value;
    private Node<T> parent;
    private Node<T> left;
    private Node<T> right;
    private Color color;

    public Node(T value) {
        this.value = value;
        this.parent = null;
        this.left = null;
        this.right = null;
        this.color = Color.RED;
    }

    // Getters and setters

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public enum Color {
        RED,
        BLACK
    }

}

