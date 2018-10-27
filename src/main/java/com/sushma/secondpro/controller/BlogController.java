package com.sushma.secondpro.controller;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sushma.secondpro.dao.BlogDao;
import com.sushma.secondpro.model.Blog;

@RestController
public class BlogController {
	@Autowired
	BlogDao blogdao;
    @PostMapping("/createblog")
        public ResponseEntity<Blog> createBlog(@RequestBody Blog blog)
    {
        System.out.println("Control at Blog Controller ");
        String random_id = UUID.randomUUID().toString();
        blog.setBlog_id(random_id);
        blog.setLike_blog("0");
        blog.setDislike_blog("0");
        blogdao.save_blog(blog);
        return new ResponseEntity<Blog>(blog,HttpStatus.OK);
}
    @GetMapping("/getallblog")
    public ResponseEntity<List> getallblog()
    {
    	List Bloglist=blogdao.getAllBlog();
    return new ResponseEntity<List>(Bloglist,HttpStatus.OK);
    	
    }

}
