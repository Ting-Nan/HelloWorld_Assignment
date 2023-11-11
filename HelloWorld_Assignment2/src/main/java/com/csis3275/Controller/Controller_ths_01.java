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
        user.setUsername("Your Username");
        user.setBio("This is your personalized bio.");
        user.setPhotoUrl("/images/your_photo.jpg");

        model.addAttribute("user", user);
        return "profile";
    }
	
	
    
    

}
