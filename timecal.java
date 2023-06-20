package Balaji;
import java.util.Scanner;

public class timecal {
	int timecal(String str)
	{
		String[] times = str.split("-");

		int minutes = 0;

		String dayNight1 = times[0].substring(times[0].length() - 2);

		String dayNight2 = times[1].substring(times[1].length() - 2);

		if(!dayNight1.equals(dayNight2))
			minutes = 720;

		String hour1 = times[0].substring(0, times[0].indexOf(":"));

		String hour2 = times[1].substring(0, times[1].indexOf(":"));

		String minute1 = times[0].substring(times[0].indexOf(":") + 1, times[0].length() - 2);

		String minute2 = times[1].substring(times[1].indexOf(":") + 1, times[1].length() - 2);

		int time1 = Integer.parseInt(hour1) * 60 + Integer.parseInt(minute1);

		int time2 = Integer.parseInt(hour2) * 60 + Integer.parseInt(minute2);

		minutes += time2 - time1;

		if(Integer.signum(minutes) == -1)
			return 1440+minutes;

		return minutes;
	}

	public static void main(String[] args)
	{
		timecal underTest = new timecal();
		
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
	System.out.print(	underTest.timecal(s));


	}


}
