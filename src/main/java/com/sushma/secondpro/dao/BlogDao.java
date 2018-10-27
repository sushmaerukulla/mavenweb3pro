package com.sushma.secondpro.dao;

import java.util.List;

import com.sushma.secondpro.model.Blog;



public interface BlogDao {
	public boolean save_blog(Blog blog);
	public List getAllBlog();
}
