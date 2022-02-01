package com.example.demo.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class RecetasControllerAdvice {
	
	@ExceptionHandler(value = DuplicateRecetaException.class)
    public ModelAndView duplicateBookException(DuplicateRecetaException e) {
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("ref", e.getReceta().getId());
        modelAndView.addObject("object", e.getReceta());
        modelAndView.addObject("message", "Cannot add an already existing book");
        modelAndView.setViewName("error-book");
        return modelAndView;
    }

}
