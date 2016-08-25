public class Solution {
  	public static String minWindow(String s, String t)
	{
		int lens = s.length();
		int lent = t.length();
		if(lent==0) return "";
		
		Map<Character,Integer> m = new HashMap<>(lent);
		Map<Character,Integer> m2 = new HashMap<>(lent);
//		Deque<Integer> d = new ArrayDeque<>(lent);
		
		for (int j = 0; j < lent; j++)
		{
			if(!m.containsKey(t.charAt(j)))
			{
				m.put(t.charAt(j), 1);
				m2.put(t.charAt(j), 0);
			}
			else
				m.put(t.charAt(j), m.get(t.charAt(j))+1);
		}
		
		
		int temp = 0;
		int start = -1; int end = -1;
		int tstart = -1 ; int tend = -1;
		int sub = -1; int tsub = -1;
		boolean first = true; boolean p = true;
		
		for(int i=0; i<lens ; i++)
		{
			if(!m.containsKey(s.charAt(i))) continue;
			m2.put(s.charAt(i), m2.get(s.charAt(i))+1);
			//d.addLast(i);
			if(p){ start = i; p = false;}
			if(m2.get(s.charAt(i))<=m.get(s.charAt(i)))
				temp++;
			if(temp==lent)
			{
				end = i+1;
				sub = end - start;
				first = false;
				tstart = start; tend = end;
				temp++;
			}
			if(!first)
			{
				tend = i+1;
				char firstchar = s.charAt(tstart);
				while(m2.get(firstchar)>m.get(firstchar))
				{
					m2.put(s.charAt(tstart), m2.get(s.charAt(tstart))-1);
					tstart++;
					firstchar = s.charAt(tstart);
					while(!m.containsKey(firstchar))
					{
						tstart++;
						firstchar = s.charAt(tstart);
					}
				}
				tsub = tend - tstart;
				if(tsub<sub)
				{
					sub = tsub;
					end = tend; start = tstart;
				}
			}			
		}
		if(first) return "";
		else return s.substring(start,end);
		
		
	}
}
