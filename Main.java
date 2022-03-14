public class Main {
    public static void main(String []args) {
        Network network;
        network = new Network();

        Computer computerA = new Computer("1235", "v1", 30);
        Router routerA = new Router("v2", "1111");
        Switch switchA = new Switch("v3");
        Switch switchB = new Switch("v4");
        Router routerB = new Router("v5", "1222");
        Computer computerB = new Computer("1133", "v6", 22);

        network.setNodes(computerA);
        network.setNodes(computerB);
        network.setNodes(routerA);
        network.setNodes(routerB);
        network.setNodes(switchA);
        network.setNodes(switchB);

        computerA.setCost(routerA, 10);
        computerA.setCost(switchA, 50);
        routerA.setCost(switchB, 20);
        routerA.setCost(routerB, 20);
        routerA.setCost(switchA, 20);
        routerA.setCost(computerA, 10);
        switchA.setCost(computerA, 50);
        switchA.setCost(routerA, 20);
        switchA.setCost(switchB, 10);
        switchB.setCost(routerA, 20);
        switchB.setCost(switchA, 10);
        switchB.setCost(routerB, 50);
        switchB.setCost(computerB, 10);
        routerB.setCost(routerA,20);
        routerB.setCost(switchB,30);
        routerB.setCost(computerB,20);
        computerB.setCost(routerB, 20);
        computerB.setCost(switchB, 10);

        //network.print();
        //network.printIdentifiableNodesInOrder();

        //System.out.println(computerB.getStorageCapacityConvert("megabyte"));

        Algorithm algDijkstra = new Algorithm();
        for(Node node:algDijkstra.Dijkstra(network,computerA).keySet()){
            System.out.println(node.toString() + " -> " + algDijkstra.Dijkstra(network,computerA).get(node));
        }
    }
}
