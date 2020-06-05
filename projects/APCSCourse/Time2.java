public class Time2
{
	//initializes variable
	private int second;
	
	//sets up constructors for different ways to enter and turns all enters into seconds 
	public Time2()
	{
		this(0,0,0);
	}

	public Time2(int hour)
	{
		this.second = hour * 3600;
	}
	
	public Time2(int hour, int minute)
	{
		this.second = (hour * 3600) + (minute * 60);	
	}
	
	public Time2(int hour, int minute, int second)
	{
		//makes sure numbers are in the correct range
		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		
		if (minute < 0 || minute >= 60)
                        throw new IllegalArgumentException("hour must be 0-59");
		
		if (second < 0 || second >= 60)
                        throw new IllegalArgumentException("hour must be 0-59");
		
		this.second = (hour * 3600) + (minute * 60) + second;
	}
	
	public Time2(Time2 time)
	{
		this.second = time.getHour() * 3600 + time.getMinute() * 60 + time.getSecond();
	}
	
	//sets seconds, hours, and minutes by changing it into seconds
	public void setSecond( int second)
	{
                //makes sure numbers are in the correct range

		if (second < 0 || second >= 60)
                        throw new IllegalArgumentException("hour must be 0-59");
		this.second -= getSecond();
		this.second += second;
	}
	
	public void setHour( int hour )
	{
                //makes sure numbers are in the correct range

		if (hour < 0 || hour >= 24)
                        throw new IllegalArgumentException("hour must be 0-23");
		this.second -= (getHour() * 3600);
		second += hour * 3600;
	}
	
	public void setMinute(int minute)
	{
                //makes sure numbers are in the correct range

		if (minute < 0 || minute >= 60)
                        throw new IllegalArgumentException("hour must be 0-59");
		this.second -= (getMinute() * 60);
		second += minute * 60;
	}
	
	
	public void setTime(int hour, int minute, int second)
	{
                //makes sure numbers are in the correct range

		if (hour < 0 || hour >= 24)
                        throw new IllegalArgumentException("hour must be 0-23");

                if (minute < 0 || minute >= 60)
                        throw new IllegalArgumentException("hour must be 0-59");

                if (second < 0 || second >= 60)
                        throw new IllegalArgumentException("hour must be 0-59");

                this.second = (hour * 3600) + (minute * 60) + second;
	}
	
	//returns the hour, minute, or second after dividing by certain numbers
	public int getHour()
	{
		return second / 3600;
	}
	
	public int getMinute()
	{
		return ((second % 3600) / 60);
	}
	
	public int getSecond()
	{
		return ((second % 3600) % 60);
	}
	
	//prints the variables in a universal string format or standard format
	public String toUniversalString()
	{
		return String.format(
			"%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	public String toString()
	{
		return String.format("%d:%02d:%02d %s",
			((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
			getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
}
	
