class Solution {
    public boolean hasDuplicate(int[] nums) {
        //method 1:- use hashset
        HashSet< Integer> hs= new HashSet<>();
        for( int n: nums)
        {
            if(hs.contains(n))
            return true;
            hs.add(n);
        }
        return false;

    }
}