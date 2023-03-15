package net.javaguides.sms.controller;


import net.javaguides.sms.entity.Blog;
import net.javaguides.sms.entity.Product;
import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.BlogRepository;
import net.javaguides.sms.repository.ProductRepository;
import net.javaguides.sms.repository.StudentRepository;
//import net.javaguides.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@Controller
public class StudentController {
	
//	private StudentService studentService;

//	public StudentController(StudentService studentService) {
//		super();
//		this.studentService = studentService;
//	}
//
//	 handler method to handle list students and return mode and view
//	@GetMapping("/students")
//	public String listStudents(Model model) {
//		model.addAttribute("students", studentService.getAllStudents());
//		return "students";
//	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		// create student object to hold student form data
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
		
	}
	
//	@PostMapping("/students")
//	public String saveStudent(@ModelAttribute("student") Student student) {
//		studentService.saveStudent(student);
//		return "redirect:/students";
//	}
	
//	@GetMapping("/students/edit/{id}")
//	public String editStudentForm(@PathVariable Long id, Model model) {
//		model.addAttribute("student", studentService.getStudentById(id));
//		return "edit_student";
//	}

//	@PostMapping("/students/edit/{id}")
//	public String editStudent(@PathVariable Long id,
//							  @ModelAttribute("student") Student student,
//							  Model model) {
//
//		// get student from database by id
//		Student existingStudent = studentService.getStudentById(id);
//		existingStudent.setId(id);
//		existingStudent.setFirstName(student.getFirstName());
//		existingStudent.setLastName(student.getLastName());
//		existingStudent.setEmail(student.getEmail());
//
//		// save updated student object
//		studentService.updateStudent(existingStudent);
//		return "redirect:/students";
//	}

//	@PostMapping("/students/{id}")
//	public String updateStudent(@PathVariable Long id,
//			@ModelAttribute("student") Student student,
//			Model model) {
//
//		// get student from database by id
//		Student existingStudent = studentService.getStudentById(id);
//		existingStudent.setId(id);
//		existingStudent.setFirstName(student.getFirstName());
//		existingStudent.setLastName(student.getLastName());
//		existingStudent.setEmail(student.getEmail());
//
//		// save updated student object
//		studentService.updateStudent(existingStudent);
//		return "redirect:/students";
//	}
	
	// handler method to handle delete student request
	
//	@GetMapping("/students/{id}")
//	public String deleteStudent(@PathVariable Long id) {
//		studentService.deleteStudentById(id);
//		return "redirect:/students";
//	}




	@Autowired
	private BlogRepository blogRepository;
	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private StudentRepository studentRepository;




	@GetMapping("/main")
	public String mainPage(Model model) {
		Iterable<Blog> blogs = blogRepository.findAll();
		model.addAttribute("blogs", blogs);
		return "main";
	}

	@GetMapping("/profile")
	public String progilePage(Model model){
		return "profilee";
	}
//
//	@GetMapping("/profile")
//	public String profilePage(Model model) {
//		return "profile";
//	}

//	@GetMapping("/profile/{id}")
//	public String EachProfile(@PathVariable Long id) {
//		model.addAttribute("student", studentService.getStudentById(id));
//		return "profile";
//	}



	@GetMapping("/friends")
	public String friendsPage(Model model){
		Iterable<Student> students = studentRepository.findAll();
		model.addAttribute("students", students);
		return "friends";
	}




	@GetMapping("/news")
	public String newsPage(Model model) {
		Iterable<Blog> blogs = blogRepository.findAll();
		model.addAttribute("blogs", blogs);
		return "news";
	}

//	@GetMapping("/friends/{id}")
//	public String deleteStudents(@PathVariable Long id) {
//		studentService.deleteStudentById(id);
//		return "redirect:/friends";
//	}

//	@PostMapping("/friends/{id}")
//	public String deleteeStudent(@PathVariable Long id) {
//		studentService.deleteStudentById(id);
//		return "redirect:/friends";
//	}


	@PostMapping("/news/new")
	public String createBlog(@RequestParam String title, @RequestParam String content) {
		Blog blog = new Blog(title, content);
		blogRepository.save(blog);
		return  "redirect:/news";
	}

	@GetMapping("/news/new")
	public String createBlog(Model model) {
		return "janalyk";
	}

	@GetMapping("/products/new")
	public String createProductPage(Model model) {
		return "sell";
	}

	@PostMapping("/products/new")
	public String createNewProduct(@RequestParam String title, @RequestParam String location,
								   @RequestParam String description, @RequestParam int price){
		Product product = new Product(title, location, description,  price);
		productRepository.save(product);
		return  "redirect:/products";
	}

	@GetMapping("/products")
	public String productsPage(Model model) {
		Iterable<Product> products = productRepository.findAll();
		model.addAttribute("products", products);
		return "product";
	}

//	@GetMapping("/product/{id}")
//	public String productsPage(Model model) {
//		return "sell";

//	}
@GetMapping("/mezuns")
public String listMezuns(Model model) {

	Iterable<Student> students = studentRepository.findAll();
	model.addAttribute("students", students);
	return "mezuns-list";
}
//@RequestMapping("/")
//public String searchMezuns(Model model
//		/*@Param("keyword") String keyword*/){
//	String keyword = "2017";
//	List<Student> mezunList = studentService.listAll(keyword);
//	model.addAttribute("listMezuns", mezunList);
//	model.addAttribute("keyword", keyword);
//
//	return "mezuns-list";
//}

	@GetMapping("/login")
	public String loginPage(Model model) {
		return "login";
	}

	@GetMapping("/registration")
	public String registrationPage(Model model) {
		return "registration";
	}

	@PostMapping("/registration")
	public String createNewStudent(@RequestParam String email, @RequestParam String firstName,
								   @RequestParam String lastName, @RequestParam String password,
								   @RequestParam int gradYear, @RequestParam String faculty,
								   @RequestParam BigInteger phoneNum, @RequestParam String location){
		Student student = new Student(firstName, lastName, email, gradYear, faculty, phoneNum, location, password);
		studentRepository.save(student);
		return  "redirect:/main";
	}





	/*@GetMapping("/profile/{id}")
	public String profilePage(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "profile";
	}*/



	@GetMapping("/message")
	public String messagePage(Model model){
		return "message";
	}
}
