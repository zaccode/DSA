package xr.com;

public class countsort {
    static int maximum(int A[],int n){
        int max =0;
        for(int i=0;i<n;i++){
            if(A[i] > max ){
                max = A[i];
            }
        }
        return max;
    }

    static void countsort(int A[],int n){
        int i,j;
        int max = maximum(A,n);
        int count[]= new int[max+1];

        for(i=0;i<max+1;i++){   // intialize the count array by 0
           count[i] =0;
        }
        for(i=0;i<n;i++){       //intialize count array in A array
            count[A[i]]= count[A[i]] + 1;
        }
        j=0;  //traverse for count array
        i=0;    //traverse for given array

        while (i<=max){
            if(count[i] > 0){
                A[j]=i;
                count[i]= count[i]-1;
                j++;
            }else{
                i++;
            }
        }
    }
    static void print(int A[],int n){
        for(int i=0;i<n;i++){
            System.out.print(A[i] +" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int A[]={9,8,1,2,7,16};
        int n=A.length;
        print(A,n);
        countsort(A,n-1);
        print(A,n);
    }
}
