package com.codingdojo.java.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@Controller
public class HoppersReceiptApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoppersReceiptApplication.class, args);
	}

	
    @RequestMapping("/")
    public String index1(Model model) {
    	
    	
       String name = "Grace Hopper";
       String itemName = "Copper wire";
       double price = 5.25;
       String description = "Metal strips, also an illustration of nanoseconds.";
       String vendor = "Little Things Corner Store";
    	
   	// Your code here! Add values to the view model to be rendered
    	model.addAttribute("names",name);
    	model.addAttribute("itemsName",itemName);
       	model.addAttribute("prices",price);
        model.addAttribute("descriptions",description);
        model.addAttribute("vendors",vendor);

        return "index.jsp";
    }

}
