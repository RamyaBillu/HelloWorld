package arrays_Nov8;

public class PersonObject {

	public static void main(String[] args) {
		PersonObject personObjects=new PersonObject();
		 Persons[] person=personObjects.personDetails();
			 System.out.println(person[0]);
		 
		 
	}
	public Persons[] personDetails() {
		Persons[] persons=new Persons[4];
		
		Persons person1=new Persons();
		person1.setName("radha");
		person1.setAge(24);
		persons[0]=person1;
		return persons;
	}

}
