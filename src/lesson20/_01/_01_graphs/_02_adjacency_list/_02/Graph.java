package lesson20._01._01_graphs._02_adjacency_list._02;

import java.util.ArrayList;

// Список суміжності (Adjacency List)
class Graph {

    public static void main(String[] args) {
        // Створюємо граф
        int v = 4;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(v);

        for (int i = 0; i < v; i++)
            list.add(new ArrayList<>());

        // Додаємо ребра
        addEdge(list, 0, 1);
        addEdge(list, 0, 2);
        addEdge(list, 0, 3);
        addEdge(list, 1, 2);

        printGraph(list);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> list,
                        int start, int destination) {
        list.get(start).add(destination);
        list.get(destination).add(start);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print("Vertex " + i + ":");
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(" -> " + list.get(i).get(j));
            }
            System.out.println();
        }
    }
}
