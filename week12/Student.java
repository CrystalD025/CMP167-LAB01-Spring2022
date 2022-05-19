
public class Student extends Person{
	static int studentTot;
	private int idNum;
	private int gradeLevel;
	private int courseTot;
	
	String [] currentCourses;
	public Student() {
		
	}
	public boolean dropAcourse(String courseName) {
		
		if (courseTot>0) {
			int index =-1;
			for (int i=0; i<courseTot; i++) {
				if (currentCourses[i].equalsIgnoreCase(courseName)) {
					index = i;
				}
			}
			
			if (index>-1) {
				for (int i= index; i<courseTot-1; i++) {
					currentCourses[i]=currentCourses[i+1];
					
				}
				
				currentCourses[courseTot-1]=null;
				courseTot--;
				
				return true;
				
			}
		}
		
		
	return false;
	}
	
}
