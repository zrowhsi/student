package np.com.ishworb.student.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {

	@Id
	@Column(name = "std_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stdId;
	@Column(name = "first_name", nullable = false)
	private String firstName;
	@Column(name = "last_name", nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private String gender;
	@Column(nullable = false)
	private long phone;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private Date dob;
	@Column(nullable = false)
	private String classlvl;

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getClasslvl() {
		return classlvl;
	}

	public void setClasslvl(String classlvl) {
		this.classlvl = classlvl;
	}

	

}
