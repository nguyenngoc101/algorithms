package hackerrank.algorithms.GraphTheory;

import java.util.*;

public class BreadthFirstSearch {

        static int[] bfs(int n, int m, int[][] edges, int s) {
            int[][] graph = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    graph[i][j] = -1;
                }
            }
            for (int i = 0; i < edges.length; i++) {
                graph[edges[i][0]-1][edges[i][1]-1] = 6;
                graph[edges[i][1]-1][edges[i][0]-1] = 6;
            }

            // Complete this function
            int[] distances = new int[n];
            boolean[] calculated = new boolean[n];

            for (int i = 0; i < n; i++) {
                distances[i] = 0;
            }

            LinkedList<Integer> queue = new LinkedList<Integer>();
            queue.add(s-1);
            calculated[s-1] = true;
            Set<Integer> traversaled = new HashSet<>();
            for (int i = 0; i < n; i++) {
                traversaled.add(i);
            }
            while (!queue.isEmpty()) {
                int currentEdge = queue.remove(0);
                for (int i = 0; i < n; i++) {
                    if (traversaled.contains(i) && (graph[currentEdge][i] != -1)) {
                        if (!calculated[i]) {
                            distances[i] = distances[currentEdge] + graph[currentEdge][i];
                            calculated[i] = true;
                        }
                        queue.add(i);
                    }
                }
                traversaled.remove(currentEdge);
            }

            return Arrays.stream(distances).map(e -> e == 0 ? -1 : e).toArray();
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int q = in.nextInt();
            for(int a0 = 0; a0 < q; a0++){
                int n = in.nextInt();
                int m = in.nextInt();
                int[][] edges = new int[m][2];
                for(int edges_i = 0; edges_i < m; edges_i++){
                    for(int edges_j = 0; edges_j < 2; edges_j++){
                        edges[edges_i][edges_j] = in.nextInt();
                    }
                }
                int s = in.nextInt();
                int[] result = bfs(n, m, edges, s);
                for (int i = 0; i < result.length; i++) {
                    if (i != s-1)
                    System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
                }
                System.out.println("");
            }
            in.close();
        }
}
