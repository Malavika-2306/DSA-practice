class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=-1;
        int premax=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                premax=max;
                max=arr[i];
            }
            else if(premax<arr[i] && arr[i]<max){
                premax=arr[i];
            }
        }
        return premax;
    }
}