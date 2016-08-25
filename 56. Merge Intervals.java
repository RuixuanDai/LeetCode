/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
public static List<Interval> merge(List<Interval> intervals)
	{
		List<Interval> lists = new ArrayList<>();
		intervals.sort(new Comparator<Interval>()
		{			@Override
			public int compare(Interval o1, Interval o2)
			{
				if(o1.start>o2.start) return 1;
				else if (o1.start==o2.start)return 0;
				return -1;
			}
		});
		Iterator<Interval> ii = intervals.iterator();
		
		if(!ii.hasNext()) return intervals;
		Interval t1 = ii.next();
		Interval t2;
		while(ii.hasNext())
		{
			t2 = ii.next();
			if(t1.end>=t2.start)
			{	if(t1.end<t2.end)t1.end = t2.end;}
			else
			{
				lists.add(t1);
				t1 = t2;
			}				
		}
		lists.add(t1);
		
		return lists;
		
	}
}
