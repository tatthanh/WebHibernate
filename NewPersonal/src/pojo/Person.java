package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="person")
public class Person {
	private int Id;
	private String Name;
	private String Address;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name,String add){
		Name=name;
		Address=add;
	}
	@Id
	@Column(name="Id")
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@Id
	@Column(name="Name")
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Id
	@Column(name="Address")
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

}
