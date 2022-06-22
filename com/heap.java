package xr.com;

public class heap {
    static void insert(int arr[],int n, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        int temp;

        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }

        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest != i){
            temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            insert(arr,n,largest);
        }
    }

    static int deleteRoot(int arr[],int n){
        int lastElement = arr[n-1];
        arr[0] = lastElement;
        n = n-1;
        insert(arr,n,0);
        return n;
    }

//    static void insertNode(int arr[],int n,int key){
//        n = n + 1;
//        arr[n] = key;
//        insert(arr,n,arr[n]);
//    }

    static void printArray(int arr[],int n){
        for(int i =0;i<n;++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= {10,5,3,2,4};
        int n = arr.length;
//          insertNode(arr,n,12);
        n = deleteRoot(arr,n);
        printArray(arr,n);

    }
}
