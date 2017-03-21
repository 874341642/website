package com.website.dao.base;

import java.util.List;

import com.website.entity.Entity;

public interface BaseDao {
	public Entity getById(Long id);
	public List<Entity> getAll();
	public void insert(Entity entity);
	public void delete(Entity entity);
	public void update(Entity entity);
}
