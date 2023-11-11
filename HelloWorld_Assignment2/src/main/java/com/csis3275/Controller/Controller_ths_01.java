package com.csis3275.Controller;

public class Controller_ths_01 {
	private String username;
    private String bio;
    private String photoUrl;
    
    public Controller_ths_01() {
    	
    }
    
	public Controller_ths_01(String username, String bio, String photoUrl) {
		super();
		this.username = username;
		this.bio = bio;
		this.photoUrl = photoUrl;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
    
    

}
