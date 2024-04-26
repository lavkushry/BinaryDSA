package Array;
public class SortedAr {

    static String sortArry(int[] arr)
    {
        boolean asc=true;
        boolean desc=true;
        int n=arr.length;

        for (int i = 0; i < n-1; i++) {
            if(arr[i]<arr[i+1])
            {
                asc=true;
            }else {
                asc=false;
            }
        }
        for (int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1])
            {
                desc=true;

            }else {
                desc=false;
            }
        }

        if(asc)
        {
            return "ascending";
        } else if (desc) {
            return "desending";

        }else{
            return "unsorted";
        }

    }

    public static void main(String[] args) {

            int[] arr={4,3,2,1};

            String ord=sortArry(arr);
            if(ord.equals("ascending"))
            {
                System.out.println("Ascending");
            } else if (ord.equals("descending")) {

                System.out.println("descending");
            }else{
                System.out.println("Unsorted");
            }


    }

}
