package com.module;

public class UserDetails {
	private int id;
	private int age;
	private String name;
	private String email;
	private String gender;
	private String country;
	private String city;
	private String mnumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMnumber() {
		return mnumber;
	}

	public void setMnumber(String mnumber) {
		this.mnumber = mnumber;
	}

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", age=" + age + ", name=" + name + ", email=" + email + ", gender=" + gender
				+ ", country=" + country + ", city=" + city + ", mnumber=" + mnumber + "]";
	}

}
