package DSA.Array;

public class duplicateElements {
    public static void main(String[] args) {
        int arr[]={2,3,3,6,6,8};
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n-1; j++) {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplication element found at "+i+"th Location and element is "+arr[i]);
//                    break;
                }
            }

        }
    }
}
