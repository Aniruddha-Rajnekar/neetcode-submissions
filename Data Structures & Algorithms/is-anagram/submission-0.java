class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
        return false;
        char[] s_sorted = s.toCharArray();
        char[] t_sorted = t.toCharArray();
        Arrays.sort(s_sorted);
        Arrays.sort(t_sorted);
        for( int i=0;i<s_sorted.length;i++)
        {
            if(s_sorted[i]!=t_sorted[i])
            return false;
        }
        return true;

    }
}
