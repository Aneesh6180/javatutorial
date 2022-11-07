package Array;

public class CountPair {
    public static void main(String[] args){
        int arr[] = {1, 5, 7, 1};
        int sum=6;
        getPairsCount(arr,sum);
    }
        public static void getPairsCount(int[] arr,int sum){
        int count=0;
//        initialize result
            for(int i=0;i<arr.length;i++)
               for(int j=0;j< arr.length;j++)
                   if ((arr[i] + arr[j]) == sum)
                       count++;
            System.out.printf("Count of pair is %d",count);
        }
    }
