package Lesson7;

public class TestMyGraph {
    public static void main(String[] args) {
        MyGraph graph = new MyGraph(10);

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.addEdge(5,6);
        graph.addEdge(6,7);
        graph.addEdge(7,8);
        graph.addEdge(8,9);
        graph.addEdge(9,0);
        //graph.print();
        //System.out.println();

        Bfs bfs = new Bfs(graph, 0);
        System.out.println("Найдем кратчайший путь к вершине 5");
        bfs.printResultPathTo(5);
        System.out.println("Найдем кратчайший путь к вершине 6");
        bfs.printResultPathTo(6);

    }
}
