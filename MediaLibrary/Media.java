package MediaLibrary;

import java.util.Scanner;

public class Media {
	Scanner kboard = new Scanner(System.in);
	String mName;
	String mDescription;
	
	public Media(String name, String description) {
		mName = name;
		mDescription = description;
	}
	
	public void setName(String name){
		System.out.println("What is the name of the media?");
		name = kboard.nextLine();
		mName = name;
	}
	
	public void setDescription(String description) {
		System.out.println("Please describe the media");
		description = kboard.nextLine();
		mDescription = description;
	}
	
	public String getName() {
		return mName;
	}
	
	public String getDescription() {
		return mDescription;
	}

}
