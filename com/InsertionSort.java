package xr.com;

public class InsertionSort {
    static  void print(int A[],int n){
        for(int i=0;i<n;i++){
            System.out.print(" "+A[i]);
        }
        System.out.println("===============");
    }

    static void insertion(int A[],int n){
        for(int i=1;i<=n-1;i++){
            int temp = A[i];
           int j=i-1;
           while(j >=0 && temp < A[j]){
              A[j+1] = A[j];
              j--;
           }
           A[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int A[]={9,8,1,2,7,16};
        int n=A.length;

        print(A,n);
        insertion(A,n);
        print(A,n);
    }
}
