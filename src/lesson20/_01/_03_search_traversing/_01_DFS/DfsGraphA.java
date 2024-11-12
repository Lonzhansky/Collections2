package lesson20._01._03_search_traversing._01_DFS;

import java.util.LinkedList;

// Depth First Search (Обхід углиб).
// Неорієнтований граф.
public class DfsGraphA {

    // Число вершин
    private final int numVerts;
    // Масив списків для представлення
    // списку суміжності
    private final LinkedList<Integer>[] adjs;

    public static void main(String[] args) {
        // Стартова вершина
        int startVert = 0;
        // Число вершин.
        // Має бути не менше числа елементів у списку.
        // Наприклад, елементи: 0 1 2 3 4.
        // То число вершин – 5.
        // Інакше, помилка ArrayIndexOutOfBoundsException.
        int numItems = 5;

        DfsGraphA graph = new DfsGraphA(numItems);
        // Неорієнтований граф (визначення ребер)
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 3);
        graph.addEdge(1, 3);
        graph.addEdge(2, 0);

        System.out.println("DFS traversing from vertex " +
                startVert + " :");

        graph.doDfs(startVert);
    }

    DfsGraphA(int v) {
        numVerts = v;
        adjs = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adjs[i] = new LinkedList<>();
    }

    // Додавання ребра в граф (w до списка v)
    void addEdge(int v, int w) {
        adjs[v].add(w);
    }

    // Утилітний метод, що використовується
    // для функції виконання DFS обходу
    void dfsUtil(int v, boolean[] visited) {
        // Відзначається поточний вузол
        // як відвіданий та виводиться
        visited[v] = true;
        System.out.print(v + " ");
        // Повторюється для всіх вершин,
        // суміжних із цією вершиною
        for (int n : adjs[v]) {
            if (!visited[n])
                dfsUtil(n, visited);
        }
    }

    // Функція виконання DFS обходу
    void doDfs(int v) {
        boolean[] visited = new boolean[numVerts];
        dfsUtil(v, visited);
    }
}
