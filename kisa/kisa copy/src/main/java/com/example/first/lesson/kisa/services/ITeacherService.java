package com.example.first.lesson.kisa.services;

import com.example.first.lesson.kisa.model.TeacherDto;

import java.util.List;

public interface ITeacherService {

    TeacherDto addSubject(String name, String subject);
    TeacherDto addGroup (String name, List<String> group);
    TeacherDto addStudentsGroup (String name, String group, String studentName);

}
