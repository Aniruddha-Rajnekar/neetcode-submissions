class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer= new ArrayList<>();
        HashMap<String,List<String>> hm= new HashMap<>();
        for( int i=0;i<strs.length;i++)
        {
            String str= strs[i];
            char[] temp =str.toCharArray();
            Arrays.sort(temp);
            String sortedStr = new String(temp);
            if(hm.containsKey(sortedStr))
            {
                hm.get(sortedStr).add(str);
            }
            else{
                List<String> t= new ArrayList<>();
                t.add(str);
                hm.put(sortedStr,t);
            }
            
        }
        for(Map.Entry<String, List<String>> entry : hm.entrySet())
        {
         
            answer.add(entry.getValue());
        }
        return answer;
        
    }
}
