// // User function Template for Java

// class Solution {
//     // Function to rotate an array by d elements in counter-clockwise direction.
//     static void rotateArr(int arr[], int d) {
//         int n=arr.length -1;
//         // d%=n;
//         for(int i=0;i<d;i++)
//         {
//             int tem=arr[0];
//             for(int j=0;j<n;j++){
//                 arr[j]=arr[j+1];
//             }
//             arr[n]=tem;
//         }
//     }
// }



class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
      int n=arr.length ;
      d%=n;
      rev(arr,0,d-1);
      
      rev(arr,d,n-1);
      rev(arr,0,n-1);
      
      
    }
    
    static void rev(int arr[],int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}