package arrays_Nov8;

public class ObjectArray {

	public static void main(String[] args) {
		//creating object array
     Persons [] person=new Persons[2];
     Persons persons=new Persons();
     persons.setAge(12);
     persons.setName("ramya");
    
     Persons persons1=new Persons();
     persons1.setAge(22);
     persons1.setName("anjali");
     person[0]=persons;
     person[1]=persons1;
     for (int i = person.length-1; i >=0; i--) {
		System.out.println(person[i].toString());
	
	}
}
}
//     Persons[] Persons=array.PersonDetails();
//     Persons persons=Persons[0];
//     System.out.println(persons.getName());
//     System.out.println(persons.getAge());
//	
//}
//	public Persons[] PersonDetails() {
//		Persons person1=new Persons();
//		person1.setName("ramya");
//		person1.setAge(22);
//		return 
//	}
//}
//	
//		
//	
