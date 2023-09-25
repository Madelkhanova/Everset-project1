package com.example.first.lesson.kisa.services.impl;

import com.example.first.lesson.kisa.model.StudentDto;
import com.example.first.lesson.kisa.model.TeacherDto;
import com.example.first.lesson.kisa.services.IStudentService;
import com.example.first.lesson.kisa.services.ITeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements ITeacherService {
    private final IStudentService studentService;

    private List<TeacherDto> addTeacher() {

        ArrayList<TeacherDto> teacherDtos = new ArrayList<>();
        teacherDtos.add(TeacherDto.builder()
                .name("Aksanabyev")
                .build());
        teacherDtos.add(TeacherDto.builder()
                .name("Pakita")
                .build());
        teacherDtos.add(TeacherDto.builder()
                .name("Baisakov")
                .build());
        return teacherDtos;
    }

    @Override
    public TeacherDto addSubject(String name, String subject) {
        List<TeacherDto> teachers = addTeacher();
        for(TeacherDto teacherDto : teachers){
            if(teacherDto.getName().equals(name)){
                if(!teacherDto.getSubjects().contains(subject)){
                    teacherDto.getSubjects().add(subject);
                    return teacherDto;
                }

            }
        }
        return null;
    }

    @Override
    public TeacherDto addGroup(String name, List<String> group) {
        return null;
    }

    @Override
    public TeacherDto addStudentsGroup(String name, String id, String studentName) {
        List<TeacherDto> teachers = addTeacher();
        for(TeacherDto teacherDto : teachers){
            if(teacherDto.getName().equals(name)){
                StudentDto student = studentService.getStudent(studentName);
                teacherDto.getStudentgroups().put(id, student);
                return teacherDto;
            }
        }
        return null;
    }
}
