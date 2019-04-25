package example.modules.controllers;

import example.common.exception.SpringException;
import example.modules.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/student")
public class StudentController {
    @RequestMapping(value="/student",method= RequestMethod.GET)
    public ModelAndView student(){
      return new ModelAndView("student/student","command",new Student());
    }
    @RequestMapping(value="/addStudent",method = RequestMethod.POST)
    @ExceptionHandler({SpringException.class})
    public String addStudent(@ModelAttribute("HelloWeb")Student student, ModelMap modelMap){

        if(student.getName().length() < 5){
            throw new SpringException("Given name is too short");
        }else {
            modelMap.addAttribute("name",student.getName());
        }

        if(student.getAge() < 10){
            throw new SpringException("Given age is too low");
        }else{
            modelMap.addAttribute("age",student.getAge());
        }
        modelMap.addAttribute("id",student.getId());

        return "student/result";
    }

}
