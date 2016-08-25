public class Solution {
   public boolean isValid(String s)
	{
		int size = s.length();
		Deque<Character> dq = new ArrayDeque<>();
		if(s.equals("")) return true;
		
		
		for(int i=0 ; i<size ; i++)
		{
			if(dq.isEmpty()){
				dq.push(s.charAt(i));continue;
			}
			char temp = '0';
			switch(s.charAt(i))
			{
			case ')': temp = '('; break;
			case ']': temp = '['; break;
			case '}': temp = '{'; break;
			}
			if(dq.peek() == temp)
				dq.pop();
			else
				dq.push(s.charAt(i));
		}
		if(dq.isEmpty())return true;
		else return false;
	}
}
