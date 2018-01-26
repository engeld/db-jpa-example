import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="Patient")
@Entity
public class Patient {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String firstname;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
}
