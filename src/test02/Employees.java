package test02;

public class Employees {
	private String name;
	private int age;
	private String dept;
	private int salry;
	
	public Employees() {}
	
	public Employees(String name, int age, String dept, int salry) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salry = salry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalry() {
		return salry;
	}

	public void setSalry(int salry) {
		this.salry = salry;
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", age=" + age + ", dept=" + dept + ", salry=" + salry + "]";
	}

}
