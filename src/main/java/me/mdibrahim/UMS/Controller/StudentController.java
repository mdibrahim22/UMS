package me.mdibrahim.UMS.Controller;

import me.mdibrahim.UMS.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //handler method to handle list students & return mode & view
    @GetMapping("/students")
    public String students(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

}

