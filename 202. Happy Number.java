public class Solution {
   public boolean isHappy(int n)
	{
		Map<Integer, Integer> t = new TreeMap<>();
		if(n == 1) return true;
		t.put(n, 1);
		int sum = 0;
		while(n!=0)
		{
			int temp = n%10;
			sum += temp*temp;
			n /= 10;
		}
		return happy(t,sum);
		
	}

	private boolean happy(Map<Integer, Integer> t, int n)
	{
		// TODO Auto-generated method stub
		if(n == 1) return true;
		else if(t.containsKey(n))
				return false;
		else
		{
			t.put(n, 1);
			int sum = 0;
			while(n!=0)
			{
				int temp = n%10;
				sum += temp*temp;
				n /= 10;
			}
			return happy(t,sum);
		}
	}
}
