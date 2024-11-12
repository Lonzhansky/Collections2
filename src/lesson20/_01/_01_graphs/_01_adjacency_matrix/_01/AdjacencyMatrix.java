package lesson20._01._01_graphs._01_adjacency_matrix._01;

// Матриця суміжності (Adjacency Matrix)
public class AdjacencyMatrix {

    int vertex;
    int[][] matrix;

    public static void main(String[] args) {
        AdjacencyMatrix adj = new AdjacencyMatrix(4);
        // В массиві
        // 0=>A, 1=>B, 2=>C, 3=>D
        adj.addEdge(0, 1);
        adj.addEdge(1, 2);
        adj.addEdge(2, 3);
        adj.printGraph();
    }

    public AdjacencyMatrix(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    public void addEdge(int start, int destination) {
        matrix[start][destination] = 1;
        matrix[destination][start] = 1;
    }

    public void printGraph() {
        System.out.println("Adjacency Matrix");
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
