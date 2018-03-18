package com.mycompany.app;

import javax.persistence.*;
import java.util.List;

@Entity
public class Lector {

	@Id
	@Column(name = "lectorID")
	private long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "phoneNumber")
	private Phone phone;

	@OneToMany(mappedBy = "lector")
	private List<Subject> subjects;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

}
