package xr.com;


//      (0)----(1)
//       |  \   |
//       |   \  |
//      (3)----(2)
//       \      /
//        \    /
//         ( 4 )
//          /  \
//         /    \
//        (5)   (6)

                                                  // 0 1 2 3 4 5 6
       //                                           {0,1,1,1,0,0,0}, //0
       //                                           {1,0,1,0,0,0,0}, //1
       //                                           {1,1,0,1,1,0,0}, //2
       //                                           {1,0,1,0,1,0,0}, //3
       //                                           {0,0,1,1,0,1,1}, //4
       //                                           {0,0,0,0,1,0,0}, //5
        //                                          {0,0,0,0,1,0,0}  //6


import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        //BFS(Breadth First Search)
        Queue<Integer>queue = new LinkedList<>();
      int i=0;
      int node;

      int []visited= {0,0,0,0,0,0,0};
      int a[][]={

            // 0 1 2 3 4 5 6
              {0,1,1,1,0,0,0}, //0
              {1,0,1,0,0,0,0}, //1
              {1,1,0,1,1,0,0}, //2
              {1,0,1,0,1,0,0}, //3
              {0,0,1,1,0,1,1}, //4
              {0,0,0,0,1,0,0}, //5
              {0,0,0,0,1,0,0}  //6
        };

        System.out.print(" "+i);
        visited[i]=1;
        queue.add(i);
        while(!queue.isEmpty()){
            node = queue.poll();
            for(int j=0;j<7;j++){
                if(a[node][j] ==1 && visited[j]==0){
                    System.out.print(" "+j);
                    visited[j] = 1;
                    queue.add(j);
                }
            }
        }
    }
}
