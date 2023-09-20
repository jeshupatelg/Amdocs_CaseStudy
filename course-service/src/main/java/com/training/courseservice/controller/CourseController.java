package com.training.courseservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.courseservice.intercomm.StudentClient;
import com.training.courseservice.model.Course;
import com.training.courseservice.model.Student;
import com.training.courseservice.repository.CourseRepository;

@RestController
@RequestMapping("/courseapi")
public class CourseController {
	
	@Autowired
	private CourseRepository repository;
	
	@Autowired
	StudentClient studentClient;
	
	@GetMapping("/list")
	public ResponseEntity<List<Course>> getCourseList(){
		return new ResponseEntity<>(repository.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Course> addCourse(@RequestBody Course c) {
		return new ResponseEntity<>(repository.save(c),HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public Course getCourseById(@PathVariable long id) {
		Optional<Course> opt = repository.findById(id);
		if(opt.isPresent())return opt.get();
		else return null;
	}
	
	@PutMapping("/update/{id}")
	public void updateCourse(@RequestBody Course course,@PathVariable long id) {
		Optional<Course> opt = repository.findById(id);
		if(opt.isPresent()) {
			Course old = opt.get();
			old.setCourseName(course.getCourseName());
			old.setCredit(course.getCredit());
			old.setYear(course.getYear());
			repository.save(old);
		}
	}
	
	@DeleteMapping("/del/{id}")
	public void deleteCourse(@PathVariable long id) {
		repository.deleteById(id);
	}
	
	@GetMapping("/service/studapi/stud/{id}")
	public Student getStudentById(@PathVariable long id) {
		return studentClient.getStudent(id);
	}
}
