 public class Dog
        {
                String name;
                String breed;
                String gender;
                int age;
                double weight;
                char fleas;
                public void setName( String s )
                {
                        name = s;
                }
                public void setBreed( String s )
                {
                        breed = s;
                }
                public void setGender( String s )
                {
                        gender = s;
                }
                public void setAge( int s )
                {
                        age = s;
                }
                public void setWeight( double s )
                {
                        weight = s;
                }
                public void setFleas( char s )
                {
                        fleas = s;
                }
                public void eat() {System.out.println("chomp chomp chomp");}
                public void bark() {System.out.println("woof woof woof");}
                public void scratching() {System.out.println("scratch scratch scratch");}
        }

