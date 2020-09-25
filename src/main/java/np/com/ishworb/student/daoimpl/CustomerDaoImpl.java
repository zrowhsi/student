package np.com.ishworb.student.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import np.com.ishworb.student.dao.CustomerDao;
import np.com.ishworb.student.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void SaveOrEdit(Customer customer) {
		getSession().merge(customer);
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
