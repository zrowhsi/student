package np.com.ishworb.student.service;

import java.util.List;

import np.com.ishworb.student.model.Student;

public interface StudentService {
	
	public void saveOrEdit(Student student);

	public void delete(int id);

	public List<Student> getAllStudent();

	public Student getStudentById(int id);
}
