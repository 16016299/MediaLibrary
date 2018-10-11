package MediaLibrary;

import MediaLibrary.Media;

public class MediaLibrary {
	public static void main(String[] args) {
		
		
		Media media1 = new Media("String1", "String2");
		
		
		Media[] mediaArray = new Media[5];
		
		
		media1.setName("name");
		media1.setDescription("description");
		
		
		System.out.println(media1.getName()+" "+media1.getDescription());
		
	}

	

}
