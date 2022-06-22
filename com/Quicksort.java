package xr.com;

public class Quicksort {
    static int partition(int A[],int low,int high){
        int i = low+1;
        int j = high;
        int pivot = low;
        int temp;
        do{
          while(A[i] <= A[pivot]){
              i++;
          }
          while(A[j] > A[pivot]){
              j--;
          }
          if(i<j){
              temp =A[i];
              A[i] = A[j];
              A[j] = temp;
          }
        }while(i<j);

        //swaping the A[j] and A[low] because j cross  i and j have smallest element in the array we want the smallest element at 0th index
        temp = A[low];
        A[low] = A[j];
        A[j] = temp;
        return j;
    }

    static void Quick(int A[],int high,int low){
        if(low<high){
            int partitionIndex = partition(A,low,high);
            Quick(A,partitionIndex-1,low);
            Quick(A, high,partitionIndex+1);

        }
    }
    static void print(int A[],int n){
        for(int i=0;i<n;i++){
            System.out.print(A[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int A[]={9,8,1,2,7,16};
        int n=A.length;
        print(A,n);
        Quick(A,n-1,0);
        print(A,n);
    }
}
