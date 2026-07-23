class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
         helper(n,0,0,"",ans);
         return ans ;

    }

       public void helper (int n , int left ,int right ,String s,List<String> ans){
        if(right==n) {
            ans.add(s);
        return ;
        }
        if(left<n){
             helper(n,left+1,right,s+"(",ans);
        }
        if(left>right){
             helper(n,left,right+1,s+")",ans);
        }

       }
}