package kodlamaio;

public class Main {

	public static void main(String[] args) {
		 Student student1 = new Student();
		 student1.setId(1);
		 student1.setFirstName("VEL�");
		 student1.setLastName("KE�EC�");
		 student1.setEmail("vli.kcc@hotmail.com");
		 student1.setPassword("123456");
		 student1.setLessons(0,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)");
		 
		
		 
		 Instructor instructor1 = new Instructor();
		 instructor1.setId(1);
		 instructor1.setFirstName("ENG�N");
		 instructor1.setLastName("DEM�RO�");
		 instructor1.setEmail("engindemirog@gmail.com");
		 instructor1.setPassword("abc123");
		 instructor1.setLessons(0,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)");
		 instructor1.setLessons(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		 instructor1.setLessons(2,"Programlamaya Giri� i�in Temel Kurs");
		 
		 UserManager userManager = new UserManager();
		 userManager.add(student1);
		 userManager.add(instructor1);
		 System.out.println(instructor1.getLessons(0));
		 System.out.println(instructor1.getLessons(1));
		 System.out.println(instructor1.getLessons(2));
		 
		

	}

}
