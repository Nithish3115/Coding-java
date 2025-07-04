class Solution {
    public List<List<Integer>> permute(int[] nums) {
    ArrayList<Integer> n = new ArrayList<>();
    return pe(n,nums);

    }
    static List<List<Integer>> pe(List<Integer> n,int[] arr){
        if(arr.length==0){
         List<List<Integer>> list = new ArrayList<>();

list.add(new ArrayList<>(n)); 
             return list;
        }

        int num=arr[0];
         List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<=n.size();i++){
            List<Integer> f= new ArrayList<>(n.subList(0,i));
            List<Integer> s = new ArrayList<>(n.subList(i,n.size()));
            f.add(num);
            f.addAll(s);
            ans.addAll(pe(f,Arrays.copyOfRange(arr,1,arr.length)));
        }

        return ans;


    }
}