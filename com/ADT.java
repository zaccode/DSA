package xr.com;

public class ADT {
    static int []insertion(int A[],int n,int ele,int ind){
        int newarr[]=new int[n+1];
        for (int i = 0; i <= n; i++) {
            if(i< ind-1){
                newarr[i] = A[i];
            }else if(i == ind-1){
                newarr[i]=ele;
            }else{
                newarr[i]= A[i-1];
            }
        }
       return newarr;
    }
    static int []deletion(int A[],int n,int pos){
        int newarr[] = new int[n-1];
        for (int i=0,k=0;i<n;i++) {
            if (i == pos) {
                continue;
            }
            newarr[k] = A[i];
            k++;
        }
        return newarr;
    }
    static void display(int A[],int n){
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int A[]={9,8,1,2,7,16};
        int n=A.length;
        int element= 23,index= 3,pos = 2;
        display(A,n);
        A= insertion(A,n,element,index-1);
        n = n+1;
        display(A,n);
        A= deletion(A,n,pos);
        n = n-1;
        display(A,n);
    }
}
