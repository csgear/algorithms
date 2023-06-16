
## Dynamic Programming
- 

## Graph
- detect a cycle, 3-color (label 1, 0, -1 or using visited array or Set) + dfs or Union-Find
- find # of connected components, dfs or Union-Find 
- Minimum Spanning Tree (MST)
  - Kruskal Algorithm (Edge Priority Queue + Union-Find (to detect cycle)
    - add an edge to the result (which doesn't create a cycle)
    - add all adjacent edges of the new added node to the queue
  - Prim Algorithm (Edge Priority Queue + a Visited Set)
    - add a vertex to the result
    - choose the next vertex (with minimum cost)
- Single source Shortest Path
  - Bellman-Ford, DP with state compression (previous / current state)
  - Dijkstra, (previous + current_cost, priority queue to add next edge)
- Topology sort
  - Kahn, (add in degree node -> queue and pop up (visited, visiting, not-visited))
- UnionFind 
  - Path compression
  - Union by rank