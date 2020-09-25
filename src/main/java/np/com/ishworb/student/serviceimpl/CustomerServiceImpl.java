package np.com.ishworb.student.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import np.com.ishworb.student.dao.CustomerDao;
import np.com.ishworb.student.model.Customer;
import np.com.ishworb.student.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	@Transactional
	public void SaveOrEdit(Customer customer) {
		customerDao.SaveOrEdit(customer);
	}

}
