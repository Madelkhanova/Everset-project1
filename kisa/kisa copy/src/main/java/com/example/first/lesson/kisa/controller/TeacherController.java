package com.example.first.lesson.kisa.controller;
import com.example.first.lesson.kisa.model.StudentDto;
import com.example.first.lesson.kisa.model.TeacherDto;
import com.example.first.lesson.kisa.services.IStudentService;
import com.example.first.lesson.kisa.services.ITeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@RequiredArgsConstructor

public class TeacherController {
    private final ITeacherService teacherService;

    @PostMapping("/add-subject-for-teacher")
    public TeacherDto addSubject(@RequestParam (name = "teacherName")String teachertName,
                                 @RequestParam  (name = "subject")String subject){
        return teacherService.addSubject(teachertName, subject);
    }
    @PostMapping("/add-teachers-student")
    public TeacherDto addStudentName(@RequestParam (name = "teacherName")String teachertName,
                                 @RequestParam  (name = "studentName")String studentName,
                                     @RequestParam  (name = "id")String id){
        return teacherService.addStudentsGroup(teachertName, id, studentName);
    }
}
