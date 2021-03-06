package com.sonata.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Task {
	@Id
	private long Task_ID;
	private long Owner_ID;
	private long Creator_ID;
	private String Name;
	private String Description;
	private String Status;
	private String Priority;
	private String Notes;
	private String Bookmarked;
	private Date Created_On;
	private Date Status_Changed_On;
	
	public Task(){
		
	}
	public void displayTask() {
		System.out.println(Owner_ID);
		System.out.println(Creator_ID);
		System.out.println(Name);
		System.out.println(Description);
		System.out.println(Status);
		System.out.println(Priority);
		System.out.println(Notes);
		System.out.println(Bookmarked);
		System.out.println(Created_On);
		System.out.println(Status_Changed_On);
	}

	public Task(int owner_ID, int creator_ID, String name, String description, String status, String priority,
			String notes, String bookmarked, Date created_On, Date status_Changed_On) {
		super();
		Owner_ID = owner_ID;
		Creator_ID = creator_ID;
		Name = name;
		Description = description;
		Status = status;
		Priority = priority;
		Notes = notes;
		Bookmarked = bookmarked;
		Created_On = created_On;
		Status_Changed_On = status_Changed_On;
	}

	public long getOwner_ID() {
		return Owner_ID;
	}

	public void setOwner_ID(long l) {
		Owner_ID = l;
	}

	public long getCreator_ID() {
		return Creator_ID;
	}

	public void setCreator_ID(long creator_ID) {
		Creator_ID = creator_ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String string) {
		Status = string;
	}

	public String getPriority() {
		return Priority;
	}

	public void setPriority(String priority) {
		Priority = priority;
	}

	public String getNotes() {
		return Notes;
	}

	public void setNotes(String notes) {
		Notes = notes;
	}

	public String getBookmarked() {
		return Bookmarked;
	}

	public void setBookmarked(String bookmarked) {
		Bookmarked = bookmarked;
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

	@Override
	public String toString() {
		return "Task [Owner_ID=" + Owner_ID + ", Creator_ID=" + Creator_ID + ", Name=" + Name + ", Description="
				+ Description + ", Status=" + Status + ", Priority=" + Priority + ", Notes=" + Notes + ", Bookmarked="
				+ Bookmarked + ", Created_On=" + Created_On + ", Status_Changed_On=" + Status_Changed_On + "]";
	}
	public long getTask_ID() {
		return Task_ID;
	}
	public void setTask_ID(long l) {
		Task_ID = l;
	}
	
	

}
