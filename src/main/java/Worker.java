public class Worker {
	private String name;
	private int depart;
	private int year;
	
	public Worker(String name, int depart, int year) {
		super();
		this.name = name;
		this.depart = depart;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepart() {
		return depart;
	}

	public void setDepart(int depart) {
		this.depart = depart;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", depart=" + depart + ", year=" + year + "]";
	}
	
	
}
