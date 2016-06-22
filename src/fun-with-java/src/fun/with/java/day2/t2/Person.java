package fun.with.java.day2.t2;

/**
 * 一个简单的Java Bean
 * @author riguz
 *
 */
public class Person {
	private String name;
	private String address;
	private String website;
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
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString(){
		return String.format("Person:%s (%s)", this.name, this.website);
	}
}
