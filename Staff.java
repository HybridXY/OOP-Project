package classes;
import java.util.Date;

public class Staff extends Person {
	private String faculty;
	private String department;
	private Date dobj = new Date();
	
	public Staff() 
	{
		super();
		faculty = " ";
		department = " ";
		dobj = new Date();
	}
	
	public Staff(int id, String fn, String ln, String f, String d, Date date)
	{
		super(id, fn, ln);
		faculty = f;
		department = d;
		dobj = date;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getDobj() {
		return dobj;
	}

	public void setDobj(Date dobj) {
		this.dobj = dobj;
	}
	
	public void Display()
	{
		System.out.println("Staff's id: " + super.getId());
		System.out.println("Staff's First Name: " + super.getFn());
		System.out.println("Staff's Last Name: " + super.getLn());
		System.out.println("Staff's Faculty: " + faculty);
		System.out.println("Staff's Department: " + department);
		System.out.println("Staff's Date Employed: " + dobj);
	}

}
