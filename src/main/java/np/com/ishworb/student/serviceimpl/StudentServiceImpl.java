package np.com.ishworb.student.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import np.com.ishworb.student.dao.StudentDao;
import np.com.ishworb.student.model.Student;
import np.com.ishworb.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Transactional
	public void saveOrEdit(Student student) {
		studentDao.saveOrEdit(student);
	}

	@Transactional
	public void delete(int id) {
		studentDao.delete(id);
	}

	@Transactional(readOnly = true)
	public List<Student> getAllStudent() {
		return studentDao.getAllStudent();
	}

	@Transactional(readOnly = true)
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

}
