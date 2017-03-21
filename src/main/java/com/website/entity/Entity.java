package com.website.entity;

import java.sql.Timestamp;

public class Entity {
	private Long id = null;
	private Timestamp cdate = null;

	public Timestamp getCdate() {
		if (cdate == null)
			return new Timestamp(System.currentTimeMillis());
		else
			return cdate;
	}

	public void setCdate(java.sql.Timestamp cdate) {
		this.cdate = cdate;
	}

	public Long getId() {
		if (id == null) {
			long currTime = System.currentTimeMillis();
			System.out.println(currTime);
			return currTime;
		} else
			return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
