

public class Main {

	public static void main(String[] args) {
		
			
		Course course1 = new Course (1,"C# + Angular", "Engin DEMİROĞ", 39.99); //Referans oluşturma, instance,örnek oluşturma
		Course course2 = new Course (2,"java + React", "Engin DEMİROĞ", 49.99);
	
		
Course[] courses = {course1,course2};
		
		for (Course course : courses) {
			
			System.out.println(course.coursename + " " + course.courseteachername);
		}
		

	CourseManager courseManager = new CourseManager();
	
	courseManager.add(course1);
	courseManager.add(course2);
	}
}
