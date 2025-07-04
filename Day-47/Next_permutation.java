class Solution {
    void nextPermutation(int[] arr) {
        int in=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                in=i;
                break;
            }
        }
        if(in==-1){
            rev(arr,0,n-1);
            return ;
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]>arr[in]){
                swap(arr,i,in);
                break;
            }
        }
        
         rev(arr,in+1,n-1);
    }
    
    
    static void swap(int arr[],int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    
    
    static void rev(int arr[] ,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    
   
}