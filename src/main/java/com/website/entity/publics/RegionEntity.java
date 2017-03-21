package com.website.entity.publics;

import java.io.Serializable;

import com.website.entity.Entity;

public class RegionEntity extends Entity implements Serializable {

	private static final long serialVersionUID = 2195231165145332626L;

	private Integer parent_id;
	private String path;
	private Integer level;
	private String name;

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
