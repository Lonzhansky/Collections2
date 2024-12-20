package lesson20._01._01_graphs._02_adjacency_list._01;

import java.util.LinkedList;

// Список суміжності (Adjacency List)
public class AdjacencyList {

    int vertex;
    LinkedList<Integer>[] list;

    public static void main(String[] args) {
        AdjacencyList adl = new AdjacencyList(4);
        // В масиві
        // 0=>A, 1=>B, 2=>C, 3=>D
        adl.addEdge(0, 1);
        adl.addEdge(1, 2);
        adl.addEdge(2, 3);
        adl.printGraph();
    }

    public AdjacencyList(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int start, int destination) {
        list[start].addFirst(destination);
        list[destination].addFirst(start);
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            if (!list[i].isEmpty()) {
                System.out.print("Node " + i + " is connected to: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}

