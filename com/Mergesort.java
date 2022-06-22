package xr.com;

public class Mergesort {
    static void mergesort(int A[],int low,int high){
        if(low < high){
           int mid = (low+high)/2;
            mergesort(A,low,mid);
            mergesort(A,mid+1,high);
           merge(A,low,mid,high);
        }
    }
    static void merge(int A[],int low,int mid,int high){
        int i,j,k;
        int B[]= new int[50];
        i =low;
        j = mid+1;
        k = low;

        while(i <= mid && j<= high){
            if(A[i] < A[j]){
                B[k]= A[i];
                k++;
                i++;
            }else{
                B[k] = A[j];
                j++;
                k++;
            }
        }

        while(i <= mid){
            B[k] = A[i];
            k++;
            i++;
        }
        while(j <= high){
            B[k] = A[j];
            k++;
            j++;
        }

        for(int s=low;s<=high;s++){
            A[s] = B[s];
        }
    }

    static void print(int A[],int n){
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int A[]={9,8,1,2,7,16};
        int n=A.length;

        print(A,n);
        mergesort(A,0,n-1);
        print(A,n);
    }
}
