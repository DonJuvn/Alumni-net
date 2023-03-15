//package net.javaguides.sms.service.impl;
//
//import java.util.List;
//
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//
//import net.javaguides.sms.entity.Student;
//import net.javaguides.sms.repository.StudentRepository;
//import net.javaguides.sms.service.StudentService;
//
//@Service
////@Component
//public abstract class StudentServiceImpl implements StudentService{
//
//	private StudentRepository studentRepository;
//
////	List<Student> getAllStudents();
////
////	public List<Student> listAll(String keyword){
////		if (keyword != null){
////			return studentRepository.findAll(keyword);
////		}
////		return studentRepository.findAll();
////	}
//
//	public StudentServiceImpl(StudentRepository studentRepository) {
//		super();
//		this.studentRepository = studentRepository;
//	}
//
//	@Override
//	public List<Student> getAllStudents() {
//		return studentRepository.findAll();
//	}
//
//	@Override
//	public Student saveStudent(Student student) {
//		return studentRepository.save(student);
//	}
//
//	@Override
//	public Student getStudentById(Long id) {
//		return studentRepository.findById(id).get();
//	}
//
//	@Override
//	public Student updateStudent(Student student) {
//		return studentRepository.save(student);
//	}
//
//	@Override
//	public void deleteStudentById(Long id) {
//		studentRepository.deleteById(id);
//	}
//
//}