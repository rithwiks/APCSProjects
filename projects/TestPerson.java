public class TestPerson
{
	public static void main ( String [] args )
	{
		//creates a faculty, staff, and student object, which also creates a person and employee object
		Faculty f1 = new Faculty();
		Staff staff_member = new Staff();
		Student s1 = new Student();
		
		//uses the setter methods to set informtaion for the 3 objects
		f1.setName("Bob");
		f1.setAddress("123 bill road");
		f1.setEmailAddress("imbob@gmail.com");
		f1.setPhoneNumber("1234567890");
		f1.setBirthDate(1, 1, 1990);
		f1.setSalary( 120000 );
		f1.setHireDate(1,1,2012);
		f1.setOfficeHours("9am - 5pm");
		f1.setRank("professor");
		
		staff_member.setName("Rob");
                staff_member.setAddress("124 bill road");
                staff_member.setEmailAddress("imrob@gmail.com");
                staff_member.setPhoneNumber("1234567880");
                staff_member.setBirthDate(1, 1, 1991);
                staff_member.setSalary( 60000 );
                staff_member.setHireDate(7,1,2017);
		staff_member.setJobTitle("Janitor");
		
		s1.setName("George");
                s1.setAddress("123 bill road");
                s1.setEmailAddress("imgeorge@gmail.com");
                s1.setPhoneNumber("1234445555");
                s1.setBirthDate(1, 1, 2004);
		s1.setClassStatus("Sophmore");
		
		//prints out all of the information of the faculty member, staff member, and student
		System.out.println(f1.toString());
		System.out.println(staff_member.toString());
		System.out.println(s1.toString());
	}
}
