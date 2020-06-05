public class TestTime2
{
	public static void main(String[] args)
	{
		//creates two Time2 objects
		Time2 t1 = new Time2(6, 37, 49);
		Time2 t2 = new Time2(1,1);
		//sets hour, minute, and seconds
		t2.setHour(6);
		t2.setMinute(37);
		t2.setSecond(49);
		//Prints out the unviresal string and standard dtring for tq and t2
		System.out.println("The time of t1 in universal time is " + t1.toUniversalString());
		System.out.println("The time of t2 in standard time is " + t2.toString());
	}
}
