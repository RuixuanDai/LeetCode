public class Solution {
  public int compareVersion(String version1, String version2)
	{
		//System.out.println(version1);
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		//for(String s :v1) System.out.println(s);
		int result = 0 , i;
		for( i=0 ; i<v1.length&&i<v2.length ; i++)
		{
			if(Integer.parseInt(v1[i])<Integer.parseInt(v2[i]))
				{return -1;}
			if(Integer.parseInt(v1[i])>Integer.parseInt(v2[i]))
			{return 1;}
		}
		if(v1.length==v2.length) return 0;
		int j = i; 
		while(i<v1.length)if(Integer.parseInt(v1[i++])>0) return 1;
		while(j<v2.length)if(Integer.parseInt(v2[j++])>0) return -1;
		return result;
	}
}
