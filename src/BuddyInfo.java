
public class BuddyInfo {

	private String address, name, phoneNumber;
	
	public BuddyInfo(String name, String address, String phoneNumber){
		
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		
	}
	
	public static void main(String[] args) {

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void newMethod() {
		
		System.out.println("New Method");
	}
	
	//edit on git
	

}
