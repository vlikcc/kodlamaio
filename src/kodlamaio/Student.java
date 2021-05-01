package kodlamaio;

public class Student extends User {
	
	public Student () {
		
	}
	
	private String[] lessons= new String[10];
	
	public String getLessons(int index) {
		return lessons[index].toString();
	}
	
	public void setLessons(int index,String lessonName) {
		
		this.lessons[index]=lessonName;
			
		
		
		
	}

	

}
