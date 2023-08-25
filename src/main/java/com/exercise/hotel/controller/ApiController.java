package com.exercise.hotel.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.hotel.model.Book;
import com.exercise.hotel.service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService sser;
	@PostMapping("addstudent")
	public Book add(@RequestBody Book ss) {
		return sser.saveinfo(ss);
	}
	@PostMapping("addnstudent")
	public List<Book> addndetails(@RequestBody List<Book> ss){
		return sser.savedetails(ss);
	}
	
	@GetMapping("showdetails")
	public List<Book> show(){
		return sser.showinfo();
		
	}
	//show by id
	@GetMapping("showdetbyid/{id}")
		public Optional<Book> showid(@PathVariable int id){
			return sser.showbyid(id);
		}
	
	@PutMapping("update")
	public Book modify(@RequestBody Book ss ) {
		return sser.changeinfo(ss);
	}
	@PutMapping("updatebyid/{id}")
	public String modifybyid(@PathVariable int id, @RequestBody Book ss) {
		return sser.updateinfobyid(id,ss);
	}
	@DeleteMapping("deletedetail")
		public String del(@RequestBody Book ss) {
			sser.deleteinfo(ss);
			return "Deleted successfully";
		}
	//pathvariable example
	@DeleteMapping("delid/{id}")
	public void deletemyid(@PathVariable int id) {
		sser.deleteid(id);
	}
}