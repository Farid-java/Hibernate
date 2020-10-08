package second_level_cache;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "Student_Information")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name = "Name" , length = 50, nullable = false)
	private String name;
	@Column(name = "Address", length = 150, nullable = false)
	private String address;
	
	 
}
