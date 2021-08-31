package com.sonata.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Notification {
	@Id
	private int Task_ID;
	private int Task_Owner_ID;
	private String Status;
	private Date Created_On;
	private Date Status_Changed_On;
	public int getTask_ID() {
		return Task_ID;
	}
	public void setTask_ID(int task_ID) {
		Task_ID = task_ID;
	}
	public int getTask_Owner_ID() {
		return Task_Owner_ID;
	}
	public void setTask_Owner_ID(int task_Owner_ID) {
		Task_Owner_ID = task_Owner_ID;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Date getCreated_On() {
		return Created_On;
	}
	public void setCreated_On(Date created_On) {
		Created_On = created_On;
	}
	public Date getStatus_Changed_On() {
		return Status_Changed_On;
	}
	public void setStatus_Changed_On(Date status_Changed_On) {
		Status_Changed_On = status_Changed_On;
	}
	
	
}
