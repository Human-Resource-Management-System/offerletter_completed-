package com.nkxgen.spring.orm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hrms_employmentofferdocuments")
public class empoffdocuments {
	// Other code

	@Id
	@Column(name = "eofd_id")
	private int eofrId;

	@Column(name = "eofd_docindex")
	private int eofdDocIndex;

	@Column(name = "eofd_idty_id")
	private int eofdIdtyId;

	empoffdocuments() {
	}

	public empoffdocuments(int eofrId, int docIndex, int idtyId) {
		this.eofrId = eofrId;
		this.eofdDocIndex = docIndex;
		this.eofdIdtyId = idtyId;
	}

	public int getEofrId() {
		return eofrId;
	}

	public void setEofrId(int eofrId) {
		this.eofrId = eofrId;
	}

	public int getEofdDocIndex() {
		return eofdDocIndex;
	}

	public void setEofdDocIndex(int eofdDocIndex) {
		this.eofdDocIndex = eofdDocIndex;
	}

	public int getEofdIdtyId() {
		return eofdIdtyId;
	}

	public void setEofdIdtyId(int eofdIdtyId) {
		this.eofdIdtyId = eofdIdtyId;
	}

}
