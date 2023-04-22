package order.Do;

public class Node {

    //前一个站点
    private Node prve;

    private Node next;

    private String name;

    public Node(String name) {
        this.name = name;
    }

    public Node getPrve() {
        return prve;
    }

    public void setPrve(Node prve) {
        this.prve = prve;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "prve=" + prve +
                ", next=" + next +
                ", name='" + name + '\'' +
                '}';
    }
}
