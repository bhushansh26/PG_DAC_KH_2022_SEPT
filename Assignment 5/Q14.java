class Q14
{
	
	static int getTimeInMinutes(String s1)
	{
		String [] curr_time = s1.split(":");
		int t = Integer.parseInt(curr_time[0])*60 + Integer.parseInt(curr_time[1]);
		return t;
	}
	
	static String convertMinutesToTime(int t)
	{
		int hours = t/60;
		String hh = (hours<10) ? "0"+Integer.toString(hours) : Integer.toString(hours);
		
		int min = t%60;
		String mm = (min<10) ? "0"+Integer.toString(min) : Integer.toString(min);
		
		String ans = hh+":"+mm;
		return ans;
	}
	
	static int timeDifference(String s1, String s2)
	{
		int t1 = getTimeInMinutes(s1);
		int t2 = getTimeInMinutes(s2);
		
		int timeDifference = (t1 < t2)? t2 - t1 : t1-t2;
		
		if(timeDifference<0)
			return timeDifference*(-1);
		return timeDifference;
		//return convertMinutesToTime(timeDifference);
	}
	
	public static void main(String args[])
	{
		String [] times = {"24:00", "12:23", "05:50", "23:12"};
		int min =3600;
		for(int i=0 ; i<=times.length-1 ; i++)
		{
			for(int j=i+1 ; j<=times.length-1 ; j++)
			{
				if(timeDifference(times[i],times[j]) < min)
					min = timeDifference(times[i],times[j]);
			}
		}
		
		//System.out.println(timeDifference(times[0],times[1]));
		System.out.println(convertMinutesToTime(min));
	}
}