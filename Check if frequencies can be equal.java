//https://practice.geeksforgeeks.org/problems/check-frequencies4211/1?
/*
    s = xyyz
    Output: 1
*/
class Solution {
    boolean sameFreq(String s) {
        // code here
        // HashMap<Character,Integer> map = new HashMap<>();
        // int n=s.length();
        // for(int i=0;i<n;i++){
        //     char ch =s.charAt(i);
        //     if(map.containsKey(ch)){
        //         map.put(ch,map.get(ch)+1);
        //     } else {
        //         map.put(ch,1);
        //     }
        // }
        // int index=map.get(s.charAt(0));
        // Set<Character> set =map.keySet();
        // int counter=1;
        // for(char ch: set){
        //     if(index!=map.get(ch)){
        //         map.put(ch,map.get(ch)-1);
        //         if(map.get(ch)==0){
        //             map.remove(ch);
        //         }
        //         break;
        //     }
        // }
        // Set<Character> set2 =map.keySet();
        // for(char ch: set2){
        //     if(index != map.get(ch)){
        //         return false ;
        //     }
        // }
    
        // return true;
        
        int c[] = new int[26];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            c[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(c[i] > 0){
                int temp = map.getOrDefault(c[i], 0);
                map.put(c[i], temp+1);
            }
        }
        
        if(map.size() == 1)return true;
        if(map.size() > 2)return false;
        
        
        int val1 = -1;
        int val2 = -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getKey() == 1 && entry.getValue() == 1)return true;
            
            if(val1 == -1)val1 = entry.getKey();
            else val2 = entry.getKey();
        }
        if(Math.abs(val2 - val1) > 1)return false;
        if(val1 > val2 && map.get(val1) == 1)return true;
        if(val2 > val1 && map.get(val2) == 1)return true;
        return false;
    }
}

