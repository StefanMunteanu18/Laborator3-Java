import java.util.HashMap;

public abstract class Node implements Comparable<Node>{
    private String name;
    private HashMap<Node, Integer> cost;

    public Node(String name) {
        this.name = name;
        this.cost = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Node, Integer> getCost() {
        return cost;
    }

    public Integer getCost(Node node){
        return this.cost.get(node);
    }

    /**
     * metoda seteaza costul tuturor venicilor
     * @param cost este un HashMap cu costurile tuturor vecinilor
     */
    public void setCost(HashMap<Node, Integer> cost) {
        this.cost = cost;
    }

    /**
     * metoda seteaza costul unui vecin dat ca parametru
     * @param node nodul vecin pentru care se seteaza costul
     * @param value costul pe care il setam
     */
    public void setCost(Node node, int value) {
        cost.put(node, value);
    }

    @Override
    public int compareTo(Node other) {
        return this.name.compareTo(other.name);
        //not safe, check if name is null before
    }


    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
