package com.bankezy.controller_advisor;

import com.bankezy.models.User;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
@ControllerAdvice
public class AdvisorController {
    @ModelAttribute("registerUser")
    public User getUserDefaults() {
        return new User();
    }
}
