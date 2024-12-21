package com.gst.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "gst")
@Entity
public class Gst {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int hsnCode;
	private int percentage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public int getHsnCode() {
		return hsnCode;
	}

	public void setHsnCode(int hsnCode) {
		this.hsnCode = hsnCode;
	}


}
