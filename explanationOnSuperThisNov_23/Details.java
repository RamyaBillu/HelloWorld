package explanationOnSuperThisNov_23;
class Student{
	String studentName;
	public Student() {
		System.out.println("unknown");
	}
	 public Student(String value) {
		 studentName=value;
		 System.out.println(studentName);
	 }
}

public class Details {
	

	public static void main(String[] args) {
		Student student=new Student();
		Student student2=new Student("anusha");
		final int i;
		i=60;
		//i=90;
		System.out.println(i);
		
		
		

	}

}
