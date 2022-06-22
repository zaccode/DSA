package xr.com;

public class BubbleSort {
    static void print(int A[],int n){
      for(int i=0;i<n;i++){
          System.out.print(A[i]+" ");
      }
        System.out.println("+++++++++++++++++++");
    }
    static void bubble(int A[],int n){
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){  // n-1-i because the last element is set on their position
                if(A[j]>A[j+1]){
                    temp = A[j];
                    A[j]= A[j+1];
                    A[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
      int A[]={9,8,1,2,7,16};
      int n=A.length;
        print(A,n);
        bubble(A,n);
        print(A,n);
    }
}
