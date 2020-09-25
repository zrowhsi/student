package np.com.ishworb.student.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import np.com.ishworb.student.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/")
	public String customer(Map<String, Object> map) {
		map.put("customer", new Customer());
		return "custIndex";
	}
//	@RequestMapping(value = "/add", method = RequestMethod.POST)
//	public String saveCustomer(Model model, @ModelAttribute("customer") Customer customer, BindingResult result) {
////		model.addAttribute("msg", "add successfull");
//		return "redirect:list";
//	}
}
