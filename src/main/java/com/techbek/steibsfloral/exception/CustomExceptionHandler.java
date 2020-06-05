package com.techbek.steibsfloral.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler({Exception.class})
    public ModelAndView handleGeneralException(HttpServletRequest request, Exception e) throws Exception {

        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null){
            throw e;
        }

        ModelAndView mav = new ModelAndView();
        mav.addObject("errorCode", 404);
        mav.addObject("message", e.getMessage());
        mav.addObject("pageTitle", "An Error Occured! We couldn't process request");
        log.info(e.getMessage());
        log.info(e.getClass().getName());
        mav.setViewName("error");

        return mav;
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Request URL not found")
    @ExceptionHandler({NoHandlerFoundException.class})
    public ModelAndView throwNoPageFound(HttpServletRequest request,NoHandlerFoundException ex){
        ModelAndView mav = new ModelAndView();
        mav.addObject("errorCode", 404);
        mav.addObject("message", "Page not found exception");
        log.info(request.getRequestURL().toString());
        mav.setViewName("error");
        return mav;
    }





}
