package com.website.entity.publics;

import java.io.Serializable;
import com.website.entity.Entity;

public class SmsEntity extends Entity implements Serializable {
	private static final long serialVersionUID = 3592942959010727820L;
	private String mobile;
	private String content;
	private Integer status;
	private String statusNote;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getStatusNote() {
		return statusNote;
	}

	public void setStatusNote(String statusNote) {
		this.statusNote = statusNote;
	}
}
