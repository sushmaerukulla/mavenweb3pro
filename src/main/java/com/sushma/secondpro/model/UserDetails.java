package com.sushma.secondpro.model;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Table
@Entity
@Component
public class UserDetails {
	 @Id
	    private String username;
	    
	    private String email;
	    private String fname;
	    private String lname;
	    private String address;
	    private String mobile;
	    private String role;
	    private String gender;
	    private Date dateofbirth;
	    
	    public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Date getDateofbirth() {
			return dateofbirth;
		}

		public void setDateofbirth(Date dateofbirth) {
			this.dateofbirth = dateofbirth;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getIs_online() {
			return is_online;
		}

		public void setIs_online(String is_online) {
			this.is_online = is_online;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public MultipartFile getMulti() {
			return multi;
		}

		public void setMulti(MultipartFile multi) {
			this.multi = multi;
		}

		private String password;
	    private String is_online;
	    private String status;
	    
	    @Transient
	    private MultipartFile multi;
	    
}
