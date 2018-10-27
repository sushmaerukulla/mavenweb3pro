package com.sushma.secondpro.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sushma.secondpro.dao.BlogDao;
import com.sushma.secondpro.dao.JobDao;
import com.sushma.secondpro.model.Blog;
import com.sushma.secondpro.model.Job;

@RestController
public class JobController {
	@Autowired
	JobDao jobdao;
    @PostMapping("/createjob")
        public ResponseEntity<Job> createJob(@RequestBody Job job)
    {
        System.out.println("Control at job Controller ");
        String random_id = UUID.randomUUID().toString();
        job.setJobid(random_id);
        jobdao.save_job(job);
       
        return new ResponseEntity<Job>(job,HttpStatus.OK);
}

}
