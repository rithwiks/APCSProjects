public class Contact
{
	// declares variables and creates setter and getter methods
	private String first;
	private String last;
	private String number;
	private String email;
	
	public void setFirst(String s)
	{
		first = s;
	}
	
	public void setLast(String c)
        {
                last = c;
        }
	
	public void setNumber(String b)
        {
                number = b;
        }

	public void setEmail(String a)
        {
                email = a;
        }
	
	public String getFirst()
	{
		return first;
	}

        public String getLast()
        {
                return last;
        }

        public String getNumber()
        {
                return number;
        }

        public String getEmail()
        {
                return email;
        }
}
