public class SearchRotatedArr {
    
    public static int SearchInRotatedArray(int arr[], int target, int si, int ei){
        if(si > ei){
            return -1;
        }
        int mid = (si+ei)/2;
        if(arr[mid] == target){
            return mid;
        }

        if(arr[si] <= arr[mid]){
            if(arr[si] <= target && arr[mid] >= target){
               return SearchInRotatedArray(arr, target, si, mid-1);
            }else{
               return SearchInRotatedArray(arr, target, mid+1, ei);
            }
        }else{
                if(arr[ei] >= target && target >= arr[mid]){
                   return SearchInRotatedArray(arr, target, mid+1, ei);
                }else{
                   return SearchInRotatedArray(arr, target, si, mid-1);
                }
        }
    }

    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(SearchInRotatedArray(arr, target, 0, arr.length-1));
    }
}
