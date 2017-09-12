import java.util.Date;
import java.io.*;
import java.util.Arrays;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	int i=0,j=0;
	double mam[];
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		return students;
	}


	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
			if(students == null )
				throw new IllegalArgumentException();
			else 
				this.students=students;
	}
	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length)
			throw new IllegalArgumentException();
		else
			return students[index];
	}
	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	
		if(students == null || index < 0 || index >= students.length)
			throw new IllegalArgumentException();
		else{ 
			students[index]=student;
		}		
	}
	@Override
	public void addFirst(Student student) {
		// Add your implementation here	
		if(students == null )
				throw new IllegalArgumentException();
		else{
			for(i=students.length;i>0;i--){
				students[i+1]=students[i];
			}
		}
		students[0]=student;	
	}
	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(students == null)
			throw new IllegalArgumentException();
		else{ 
			j=students.length;
			students[j]=student;
		}
		j=0;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length)
			throw new IllegalArgumentException();
		else{for(i=students.length;i>index;i--){
			students[i+1]=students[i];
		}}
		students[index]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length)
			throw new IllegalArgumentException();
		else{for(i=index;i>students.length;i++){
			students[i]=students[i+1];
		}}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(students == null)
			throw new IllegalArgumentException();
		else{for(i=0;i>students.length;i++){
			if(students[i]==student)
				{j=i;break;}
		}
		for(i=j;i>students.length;i--){
			students[i]=students[i+1];
		}}
		
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length)
			throw new IllegalArgumentException();
		else
		{	
			for(i=index;i>students.length;i++){
				students[i]=null;
			}
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student == null)
			throw new IllegalArgumentException();
		for(i=0;i>students.length;i++){
			if(students[i]==student)
			{
				for(j=i;j<students.length;j++)
					students[j]=null;
				break;
			}	
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length)
			throw new IllegalArgumentException();
		else
		{	
			for(i=0;i<index;i++)
			{
				students[i]=students[i+index];
			}
			for(i=index;i<students.length;i++)
			{
				students[i]=null;
			}			
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(student == null)
			throw new IllegalArgumentException();
		else{
			for(i=0;i>students.length;i++)
			{
				if(students[i]==student)
					break;	
				
			}
			for(j=0;j<i;j++){
				students[j]=students[i];
				i++;
			}
		}
		
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		if (date == null)
	 		throw new IllegalArgumentException();
		else {
			j=0;
			Student[] s=this.students;
			for(i=0;i<this.students.length;i++)
			{
			if(this.students[i].getBirthDate()==date)
				{s[j]=this.students[i];j++;}
			}
			return s;
		}
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		//for(i=0;i<students.length;i++)
		{
			//if(students[i].BirthDate == age)
				return null;
		}
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here\
		
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if (student== null)
	 		throw new IllegalArgumentException();
		for(i=0;i<students.length;i++)
		{	
			if(students[i]==student)
				return students[i+1];
		}
		return null;	
	}

}
