package xr.com;

import java.util.*;
 class gra{
    private LinkedList<Integer>adj[]; //create a linked list type array to store the temporary data

    public gra(int v){
        adj = new LinkedList[v];  //set the size
        for(int i=0;i<v;i++){
            adj[i]= new LinkedList<Integer>();  //initialize a arrays type Linked list
        }
    }

    public void addEdge(int source,int destination){
        adj[source].add(destination);       //to create a link
        adj[destination].add(source);
    }
        //Implementaion of the Breadth First Search
    public int bfs(int source ,int destination){
        boolean vis[] = new boolean[adj.length]; //create the visited array type of linkedlist
        int parent[] = new int[adj.length];       //to create a parent array to show the distance and the data
        Queue<Integer>q = new LinkedList<>();       //Implement the queue to stores the fetched data

        q.add(source);   //add the starting source in queue
        parent[source] = -1;
        vis[source]= true;  //tik the source is visited

        while(!q.isEmpty()){
            int cur = q.poll();     //means dequeue is perform
            if(cur == destination)break;

            for (int neighbor:adj[cur]){  //use for each loop to address the linked list visited data
                if(!vis[neighbor]){
                    System.out.print(neighbor);
                    vis[neighbor]= true;
                    q.add(neighbor);
                    parent[neighbor]=cur;
                }
            }
        }

        int cur = destination; //Overright the current is equal to destination
        int distance=0;
        while(parent[cur] != -1){
            System.out.print(cur+"->");
            cur =parent[cur];  //it passes the current data to the next to addresssed  data
            distance++;
        }
        return distance;
    }

     //Implementaion of the Deapth First Search in Recursive format
     private boolean dfsUtil(int source, int destination,boolean vis[]){
         if(source == destination) return true;
         for(int neighbor:adj[source]){
             if(!vis[neighbor]){
//                System.out.print(" "+ neighbor);
                 vis[neighbor]= true;
                 boolean isconnected = dfsUtil(neighbor,destination,vis);
                 if(isconnected){
                     return true;
                 }
             }
         }
         return false;
     }


        public boolean dfs(int source,int destination){
        boolean vis[]= new boolean[adj.length];
        vis[source]=true;
        return  dfsUtil(source, destination,vis);
        }

        // Iterative Method of DFS
     public boolean DFS(int source,int destination){
        boolean vis[] = new boolean[adj.length]; // create a boolean type visited array
        vis[source] = true;   // to take a 1st element as a source in visited array
        Stack<Integer>stack = new Stack<>(); // to create a stack to use push and pop operation
        stack.push(source);

        while(!stack.isEmpty()){
            int cur = stack.pop();
            if(cur== destination) return true;
            for(int neighbor : adj[cur]){
                if(!vis[neighbor]){     // if your neighbor is not visited do the neighbor is visited
                    vis[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
        return false;
     }
 }
public class graph {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Vertices and Edges");
        int v = sc.nextInt();
        int e = sc.nextInt();

        gra graph = new gra(v);
        System.out.println("Enter "+e+ " edges");
        for(int i=0;i<e;i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
        }
        System.out.println("Enter the source and Destination");

        int source = sc.nextInt();
        int destination = sc.nextInt();

//        int distance = graph.bfs(source,destination);
//        System.out.println("min Distance "+ distance);

//        System.out.println("possible "+ graph.dfs(source,destination));
        System.out.println("possible "+ graph.DFS(source,destination));

    }
}
