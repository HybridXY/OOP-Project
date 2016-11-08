package classes;

public class Programme extends Record {
	private Course course;
	private int max_course;
	private String Award;
	private String Accred;
	
	
	
	public Programme() 
	{
		super();
		course = new Course();
		max_course = 0;
		Award = " ";
		Accred = " ";
	}
	
	public Programme(String code, String name, Course a, int  max, String A, String Acc)
	{
		super(code,name);
		course = a;
		max_course = max;
		Award = A;
		Accred = Acc;
	}
	
	public void Display()
	{
		System.out.println("Programme code: " + super.getCode());
		System.out.println("Programme name: " + super.getName());
		System.out.println("Programme maximum course: " + max_course);
		System.out.println("Programme Awards: " + Award);
		System.out.println("Programme Accreditation: " +  Accred);
		course.Display();
	}

}
