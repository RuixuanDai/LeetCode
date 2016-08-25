public class Solution {
  public static boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        //char a = 'a';
        Map<String, Character> m = new HashMap<>();
        if(pattern.length()!= s.length) return false;
        for(int i=0; i<pattern.length() ; i++)
        {
        	if(!m.containsKey(s[i]))
        	{
        		//m.put(s[i], a);
        		if(m.containsValue(pattern.charAt(i))) return false;
        		else m.put(s[i], pattern.charAt(i));
        	}
        	else if(pattern.charAt(i)!=m.get(s[i])) return false;
        	
        }
        return true;
        
    }	
}
