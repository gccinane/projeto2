package Model;

public class PersonModel {
	
	String name;
	int age;
	int id;
	boolean gotCovid;
	String gender;
	String passport_id;
	String toCountry;
	String fromCountry;
	
	PersonModel () {
		
	}
	
	PersonModel(String name, int age, int id, boolean gotCovid, String gender, String passport_id, String toCountry, String fromCountry) {
		setName(name);
		setAge(age);
		setId(id);
		setGotCovid(gotCovid);
		setGender(gender);
		setPassport_id(passport_id);
		setToCountry(toCountry);
		setFromCountry(fromCountry);
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isGotCovid() {
		return gotCovid;
	}

	public void setGotCovid(boolean gotCovid) {
		this.gotCovid = gotCovid;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassport_id() {
		return passport_id;
	}

	public void setPassport_id(String passport_id) {
		this.passport_id = passport_id;
	}

	public String getToCountry() {
		return toCountry;
	}

	public void setToCountry(String toCountry) {
		this.toCountry = toCountry;
	}

	public String getFromCountry() {
		return fromCountry;
	}

	public void setFromCountry(String fromCountry) {
		this.fromCountry = fromCountry;
	}
}
