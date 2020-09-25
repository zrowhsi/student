package np.com.ishworb.student.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import np.com.ishworb.student.dao.StudentDao;
import np.com.ishworb.student.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void saveOrEdit(Student student) {
		getSession().merge(student);
	}

	public void delete(int id) {
		Student student = getStudentById(id);
		if (student != null) {
			getSession().delete(student);
		}
	}

	public List<Student> getAllStudent() {

		return getSession().createCriteria(Student.class).list();
	}

	public Student getStudentById(int id) {
		return (Student) getSession().get(Student.class, id);
	}

	public Session getSession() {
		Session session = getSessionFactory().getCurrentSession();
		if (session == null) {
			session = getSessionFactory().openSession();
		}
		return session;
	}

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
