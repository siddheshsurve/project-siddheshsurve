package com.example.Calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Calculator.domain.Operation;

@SpringBootApplication
@Controller
public class CalculatorApp {

    @GetMapping("/index")
    public String viewForm(Model model) {
        model.addAttribute("operation", new Operation());
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(@ModelAttribute Operation operation, BindingResult result, Model model) {
        model.addAttribute("operation", operation);
        return "calculate";
    }

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApp.class, args);
    }
}
