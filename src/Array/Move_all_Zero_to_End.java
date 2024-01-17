package Array;
//Program of Array to move all Zero to End in Both ways(Efficient and Bruteforce)
public class Move_all_Zero_to_End {
    static void Move_to_End(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0){
                for (int j = i+1; j < n; j++) {
                    if(arr[j]!=0)

                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }

                }
            }
        }
    }
    static void Move_to_End_efficient(int[] arr, int n)
    {
        int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0)
            {
                arr[count++]=arr[i];
            }
        while (count<n)
        {
            arr[count++]=0;
        }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
//        Move_to_End(arr, n);
        Move_to_End_efficient(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
