package com.sonata.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.Model.Task;
import com.sonata.Repository.TaskRepository;

@RestController
public class TaskController {
	
	Optional<Task> t1;
	
	@Autowired
	private TaskRepository prepository;
	
	
	@GetMapping("/task")
	public List<Task> getAllTasks(){
		return prepository.findAll();
	}
	
	@GetMapping(value= "/task/{id}")
	public ResponseEntity getuserById(@PathVariable(value="id") Long Task_ID)
	{
		t1= prepository.findById(Task_ID);
		return ResponseEntity.ok().body(t1);
	}
	@PostMapping(value = "/task")
	public Task saveProduct(@RequestBody Task task)
	{
		return prepository.save(task);
	}
	
	@PutMapping(value="/task/{id}")
	public ResponseEntity updateTask(@PathVariable(value="id") Long taskId, @Valid @RequestBody Task pdata) {
		t1 = prepository.findById(taskId);
		Task p2 = t1.get();
		p2.setTask_ID(pdata.getTask_ID());
		p2.setOwner_ID(pdata.getOwner_ID());
		p2.setCreator_ID(pdata.getCreator_ID());
		p2.setName(pdata.getName());
		p2.setDescription(pdata.getDescription());
		p2.setStatus(pdata.getStatus());
		p2.setPriority(pdata.getPriority());
		p2.setNotes(pdata.getNotes());
		p2.setBookmarked(pdata.getBookmarked());
		p2.setCreated_On(pdata.getCreated_On());
		p2.setStatus_Changed_On(pdata.getStatus_Changed_On());
				
		Task updateTask=prepository.save(p2);
		return ResponseEntity.ok(updateTask);
	}
	
	@DeleteMapping(value="/task/{id}")
	public ResponseEntity deleteTask(@PathVariable(value="id")Long taskId) {
		prepository.deleteById(taskId);
		return ResponseEntity.noContent().build();
	}

}
