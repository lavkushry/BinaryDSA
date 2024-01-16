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
    public static void main(String[] args) {
        Operations_on_Array n=new Operations_on_Array();
        int[] arr={20,5,7,25};

        System.out.println(n.search(arr,4,7));
    }
}
