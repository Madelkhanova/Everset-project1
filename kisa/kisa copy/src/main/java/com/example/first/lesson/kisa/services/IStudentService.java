package com.example.first.lesson.kisa.services;

import com.example.first.lesson.kisa.model.StudentDto;
import com.example.first.lesson.kisa.model.StudentDto;

import java.util.List;

public interface IStudentService {

    List<StudentDto> addStudent(StudentDto dto);

    List<StudentDto>  printAllStudents();

    StudentDto addSubject (String name, String subject);

    StudentDto chnageStudent(String name, String faculty);

    StudentDto getStudent (String name);

   /* List<AnimalDto> deleteAnimalByAge(Integer age);

    AnimalDto getAnimalInfo(String name);


    */




}
