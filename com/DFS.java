package xr.com;
import java.util.*;
//class dfs{
//    int []visited= {0,0,0,0,0,0,0};
//    int a[][]={
//
//            // 0 1 2 3 4 5 6        j traverse the array rows
//            {0,1,1,1,0,0,0}, //0
//            {1,0,1,0,0,0,0}, //1
//            {1,1,0,1,1,0,0}, //2
//            {1,0,1,0,1,0,0}, //3
//            {0,0,1,1,0,1,1}, //4
//            {0,0,0,0,1,0,0}, //5
//            {0,0,0,0,1,0,0}  //6    i traverse the array coloumn to column
//    };
//
//    void DFS(int i){
//        System.out.println(" "+i);
//        visited[i] = 1;
//        for(int j=0;j<7;j++){
//            if(a[i][j] == 1 && !visited[j]){
//                DFS(j);
//            }
//        }
//    }
//}
//public class DFS {
//
//
//    public static void main(String[] args) {
//       dfs df= new dfs();
//        df.DFS(0);
//    }
//}
