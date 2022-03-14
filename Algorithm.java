import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.*;

public class Algorithm {
    public HashMap<Node, Integer> Dijkstra(Network network, Node source){
        HashMap<Node, Integer> distance = new HashMap<Node, Integer>();
        HashMap<Node, Node> previous = new HashMap<Node, Node>();
        ArrayList<Node> unvisitedNodes = new ArrayList<Node>();
        Queue<Node> nodesToVisit = new LinkedList<Node>();

        for (Node node:network.getNodes()){
            //distance.put(node, Integer.MAX_VALUE);
            distance.put(node, 1000);
            previous.put(node, null);
            unvisitedNodes.add(node);
            //System.out.println(node.toString());
        }
        distance.put(source, 0);
        Node evaluatedNode;
        nodesToVisit.add(source);
        while(!unvisitedNodes.isEmpty()){
            evaluatedNode = nodesToVisit.poll();
            unvisitedNodes.remove(evaluatedNode);
                //System.out.println(evaluatedNode.toString());
            for(Node neighbour:evaluatedNode.getCost().keySet()){
                if(unvisitedNodes.contains(neighbour)){
                    //System.out.println(neighbour.toString());
                    nodesToVisit.add(neighbour);
                    Integer auxDistance = distance.get(evaluatedNode) + evaluatedNode.getCost().get(neighbour);
                    //System.out.println(auxDistance);
                    if(auxDistance < distance.get(neighbour)){
                        distance.put(neighbour, auxDistance);
                        previous.put(neighbour, evaluatedNode);
                    }
                }
            }
        }
        return distance;
    }
}
