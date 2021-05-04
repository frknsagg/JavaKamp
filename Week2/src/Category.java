
public class Category {
	
	private int id;
	private String name;
	private String instructor;
	public Category() {
		
	}
	public Category(int id,String name,String instructor ) {
		super();
		this.id=id;
		this.name=name;
		this.instructor=instructor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	

}
