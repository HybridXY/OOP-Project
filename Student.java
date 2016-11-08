package classes;
import java.util.Date;

public class Student extends Person{
	private String address;
	private Date date = new Date();
	private String contact;
	private String pcode;
	private String status;
	
	public Student() 
	{
		super();
		address = " ";
		date = new Date();
		contact = " ";
		pcode = " ";
		status = " ";
	}
	
	public Student(int id, String fn, String ln, String add, Date d, String num, String pc, String sta)
	{
		super(id,fn,ln);
		address = add;
		date = d;
		contact = num;
		pcode = pc;
		status = sta;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void Display()
	{
		System.out.println( super.getId());
		System.out.println(super.getFn());
		System.out.println( super.getLn());
		System.out.println(address );
		System.out.println(date);
		System.out.println(contact);
		System.out.println(pcode);
		System.out.println(status);
	}

}
