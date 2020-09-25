package np.com.ishworb.student.dao;

import java.util.List;

import np.com.ishworb.student.model.Student;

public interface StudentDao {

	public void saveOrEdit(Student student);
	public void delete(int id);
	public List<Student> getAllStudent();
	public Student getStudentById(int id);
	
}
