package Array;
//Program to search an element from the Array
public class Operations_on_Array {
    int search(int arr[], int n, int x)
    {
        for(int i=0; i<=n; i++){
            if(arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }

    int Insert(int[] arr, int n, int x, int cap, int pos){
        if(n==cap)
        {
            return  n;
        }
        int index=pos-1;
        for(int i=1; i>index; i--){
            arr[i+1]=arr[i];
        }
        arr[index]=x;
        return (n+1);
    }

    int Delete(int[] arr,int n,int x){
        int i;
        for ( i = 0; i <n ; i++) {
            if (arr[i]==x)
            {
                break;
            }
            if(i == n){
                return n;
            }
            for (int j = 1; j <n-1 ; j++) {
                arr[j]=arr[j+1];
            }

        }
        return (n-1);
    }
    public static void main(String[] args) {
        Operations_on_Array obj=new Operations_on_Array();
        int[] arr={20,5,7,25};
        int n=4;
        int x=7;
        int cap=5;
        int pos=2;

        System.out.println(obj.search(arr,n,x));
        System.out.println(obj.Insert(arr,n,x,cap,pos));
        System.out.println(obj.Delete(arr,n,x));

    }
}
