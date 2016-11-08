package classes;

public abstract class Record {
	private String code;
	private String name;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Record()
	{
		code = " ";
		name = " ";
	}
	
	public Record(String c, String n)
	{
		code = c;
		n = name;
	}
	
	public abstract void Display();
}
