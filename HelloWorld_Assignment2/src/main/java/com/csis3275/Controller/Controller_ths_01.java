package com.csis3275.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.csis3275.model.*;

@Controller
public class Controller_ths_01 {
	@GetMapping("/profile")
    public String userProfile(Model model) {
		TingNan_HelloWorld user = new TingNan_HelloWorld();
        user.setUsername("Ting-Nan Hsia");
        user.setBio("Hi, my name is Ting-Nan Hsia an I am studying in Douglas College. My program is CSIS. Nice to meet you.");
        user.setPhotoUrl("/image/picture_ths_01.jpeg");

        model.addAttribute("user", user);
        return "profile";
    }
	
	@GetMapping("/profile2")
	public String userProfile2(Model model) {
		ThanhHung_HelloWorld user2 = new ThanhHung_HelloWorld();
		user2.setUsername("Thanh Hung, Do");
		user2.setBio("Hola, I'm Thanh Hung but you can call me Ben. I would like to learn more about computer science like everyone here. It is my pleasure to be in HelloWorld group to introduce you upcomming project we are building.");
		user2.setPhotoUrl("/image/picture_ths_02.jpg");
		
		model.addAttribute("user2", user2);
		return "profile2";
	}

	@GetMapping("/homepage")
	public String homepage(Model model) {
	    TingNan_HelloWorld user = new TingNan_HelloWorld();
	    ThanhHung_HelloWorld user2 = new ThanhHung_HelloWorld();
	    user.setPhotoUrl("/image/picture_ths_01.jpeg");
	    user2.setPhotoUrl("/image/picture_ths_02.jpg");
	
	    model.addAttribute("user", user);
	    model.addAttribute("user2", user2);
	    return "homepage";
	}

	
	
    
    

}
