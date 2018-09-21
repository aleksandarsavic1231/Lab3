import java.util.*; 

public class AddressBook {
 
	private ArrayList<BuddyInfo> buddyInfo = new ArrayList<BuddyInfo>();
	
 	public AddressBook(){
 	

 	}
 	
 	public static void main(String[] args) {
 	
		BuddyInfo buddy = new BuddyInfo("Tash", "orleans", "61373731111");
		System.out.println("Address Book");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
	}
	
 
	
	public ArrayList<BuddyInfo> getBuddyInfo() {
		return buddyInfo;
	}

	public void setBuddyInfo(ArrayList<BuddyInfo> buddyInfo) {
		this.buddyInfo = buddyInfo;
 	}
 	
 	public void addBuddy(BuddyInfo buddy) {

		buddyInfo.add(buddy);
		
	}	

	public void removeBuddy(int index) {
	buddyInfo.remove(index);
 	}
 }
