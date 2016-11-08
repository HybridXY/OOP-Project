package classes;

public abstract class Person {
	private int id;
	private String fn;
	private String ln;
	
	public Person()
	{
		id = 0;
		fn = " ";
		ln = " ";
	}
	
	public Person(int id, String fn, String ln)
	{
		this.id = id;
		this.fn = fn;
		this.ln = ln;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public abstract void Display();
}
