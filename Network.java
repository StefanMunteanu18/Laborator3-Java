import java.util.ArrayList;

public class Network {
    private ArrayList<Node> nodes;

    public Network(){
        nodes = new ArrayList<Node>();
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public void setNodes(Node node) {
        nodes.add(node);
    }

    @Override
    public String toString() {
        return "Network{" +
                "nodes=" + nodes +
                "\n" +
                '}';
    }

    public void print(){
        for(Node node : nodes){
            System.out.println(node);
        }
    }

    public void printIdentifiableNodesInOrder(){
        CompareIdentifiable compare = new CompareIdentifiable();
        ArrayList<Identifiable> identifiableNodes = new ArrayList<Identifiable>();
        for(Node node:nodes){
            if(node instanceof Identifiable){
                identifiableNodes.add((Identifiable) node);
            }
        }
        identifiableNodes.sort(compare);
        for(Identifiable node:identifiableNodes){
            System.out.println(node);
        }
    }
}
