package classes;

public class Course extends Record {
	private int credits;
	private String pre_req;
	
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getPre_req() {
		return pre_req;
	}
	public void setPre_req(String pre_req) {
		this.pre_req = pre_req;
	}
	public Course()
	{
		super();
		credits = 0;
		pre_req = " ";
	}
	public Course(String code, String name, int cred, String pr)
	{
		super(code,name);
		credits = cred;
		pre_req = pr;
	}
	public void Display()
	{
		System.out.println("Course code: " + super.getCode());
		System.out.println("Course name: " + super.getName());
		System.out.println("Course credits: " + credits);
		System.out.println("Course pre - requisites: " + pre_req);
	}
}
