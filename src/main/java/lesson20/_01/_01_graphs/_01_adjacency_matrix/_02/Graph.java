package lesson20._01._01_graphs._01_adjacency_matrix._02;

// Матриця суміжності (Adjacency Matrix)
public class Graph {

    private final boolean[][] adjMatrix;
    private final int numVertices;

    public static void main(String[] args) {

        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(3, 0);

        System.out.print("Adjacency Matrix\n" + graph);
    }

    // Ініціалізуємо матрицю
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    // Додаємо ребра
    public void addEdge(int i, int j) {
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    // Формуємо рядкове представлення
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            sb.append(i).append("| ");
            for (boolean j : adjMatrix[i]) {
                sb.append(j ? 1 : 0).append(" ");
            }
            sb.append("\n");
        }
        return "   0 1 2 3\n   - - - -\n" + sb;
    }
}
