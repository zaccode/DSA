package xr.com;

public class SelectionSort {
    static  void print(int A[],int n){
        for(int i=0;i<n;i++){
            System.out.print(" "+A[i]);
        }
        System.out.println("===============");
    }
    static void selection(int A[],int n){
        int min ,temp;
        for(int i=0;i<n;i++){
            min = i;
            for(int j=i+1;j<n;j++){     //these loop check the min value in the array and once the min value we grab then swaping min value and A[j+1]
                if(A[min] > A[j]){
                    min = j;
                }
            }

            //Swaping of min value and A[i]
            temp = A[min];
            A[min] = A[i];
            A[i]=temp;
        }
    }
    public static void main(String[] args) {
        int A[]={9,8,1,2,7,16};
        int n=A.length;
        print(A,n);
        selection(A,n);
        print(A,n);

    }
}
