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
	
	
    
    

}
