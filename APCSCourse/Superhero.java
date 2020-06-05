import java.lang.String;
import java.lang.System;
public class Superhero
{
	//declars and intializes the varibales
	String hero_name;
	String suit;
	String suit_descript;
	String cape;
	String power;
	String super_power;
	 void SetHeroName ( String hn )
        //sets a value for each variable
	{
                hero_name = hn;
        }
	public void SetHeroSuit ( String hs )
	{
		suit = hs;
	}
	public void SetHeroDescript ( String hd )
	{
		suit_descript = hd;
	}
	public void SetHeroCape ( String hc )
	{
		cape = hc;
	}
	public void SetPower ( String p )
	{
		power = p;
	}
	public void SetSuperPower ( String sp )
	{
		super_power = sp;
	}
	//intiallizes the variables for the date
	private int month;
  	private int day;
  	private int year;
	//creates getter and setter methods for the date
  	public void Date() { month = 0; day = 0; year = 0; }

  	public void SetDate( int m, int d, int y )
  	{
    	month = m; day = d; year = y;
  	}

  	public String GetDateString()
  	{
    	return month + "/" + day + "/" + year;
  	}


}	
