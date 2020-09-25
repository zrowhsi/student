package np.com.ishworb.student.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import np.com.ishworb.student.model.Student;
import np.com.ishworb.student.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping("register")
	public String student(Map<String, Object> map) {
		map.put("student", new Student());
		return "/form";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student student, BindingResult result) {
		studentService.saveOrEdit(student);
		return "redirect:list";
	}

	@RequestMapping("list")
	public String listStudents(Map<String, Object> map) {
		map.put("studentList", studentService.getAllStudent());
		return "/listStudent";
	}

	@RequestMapping("/delete")
	public String deleteStudent(@ModelAttribute("student") Student student, BindingResult bindingResult) {
		studentService.delete(student.getStdId());
		return "redirect:list";
	}

	@RequestMapping("/edit")
	public ModelAndView editStudent(@ModelAttribute("student") Student student, BindingResult bindingResult) {
		Student std = studentService.getStudentById(student.getStdId());
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("student", std);
		return new ModelAndView("updateStudent", model);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateStudent(@ModelAttribute("student") Student student, BindingResult bindingResult) {
		studentService.saveOrEdit(student);
		return "redirect:list";
	}
}
