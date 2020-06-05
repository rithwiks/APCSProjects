public interface AllInterface extends Drawable, Rotatable, Resizable, Sounds 
{
	//combines all the other interfaces
	void setName(String s);
	void setAge(int n);
	String getName();
	int getAge();
}
