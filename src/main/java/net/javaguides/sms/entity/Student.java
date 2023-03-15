package net.javaguides.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "graduation_year")
	private int gradYear;

	@Column(name = "faculty")
	private String faculty;

	@Column(name = "phone_number")
	private BigInteger phoneNum;

	@Column(name = "location")
	private String location;
//	@Column(name = "friend")
//	private boolean friend;

//	public boolean isFriend() {
//		return friend;
//	}
//
//	public void setFriend(boolean friend) {
//		this.friend = friend;
//	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "password")
	private String password;

	public Student() {
		
	}

	public Student(String firstName, String lastName, String email, int gradYear,
				   String faculty, BigInteger phoneNum, String location, String password
				   /*boolean friend*/) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gradYear = gradYear;
		this.faculty = faculty;
		this.phoneNum = phoneNum;
		this.location = location;
		this.password = password;
//		this.friend = friend;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGradYear() {
		return gradYear;
	}

	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public BigInteger getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(BigInteger phoneNum) {
		this.phoneNum = phoneNum;
	}

}
