package data;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")


@Inheritance(strategy = InheritanceType.JOINED)

@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.STRING)


public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int id;

	private String firstname;
	private String lastname;
	private String email;

	/*@OneToOne(mappedBy = "user")
	private Student student;

	@OneToOne(mappedBy = "user")
	private Instructor instructor;*/

	@OneToMany(mappedBy = "user")
	Collection<Address> addresses;
	
	@OneToMany(mappedBy = "user")
	Collection<Account> accounts;
	
	
	

	public User() {};




	public int getId() {
		return id;
	}




	public String getFirstname() {
		return firstname;
	}




	public String getLastname() {
		return lastname;
	}




	public String getEmail() {
		return email;
	}




	/*public Student getStudent() {
		return student;
	}




	public Instructor getInstructor() {
		return instructor;
	}*/




	public Collection<Address> getAddresses() {
		return addresses;
	}




	public Collection<Account> getAccounts() {
		return accounts;
	}




	public void setId(int id) {
		this.id = id;
	}




	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}




	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	/*public void setStudent(Student student) {
		this.student = student;
	}




	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
*/



	public void setAddresses(Collection<Address> addresses) {
		this.addresses = addresses;
	}




	public void setAccounts(Collection<Account> accounts) {
		this.accounts = accounts;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", addresses=" + addresses + ", accounts=" + accounts + "]";
	}




	

	
	
	
	
	
}
