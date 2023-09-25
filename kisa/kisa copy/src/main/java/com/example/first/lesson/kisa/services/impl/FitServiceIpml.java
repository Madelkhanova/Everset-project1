package com.example.first.lesson.kisa.services.impl;

import com.example.first.lesson.kisa.model.StudentDto;
import com.example.first.lesson.kisa.model.StudentDto;
import com.example.first.lesson.kisa.services.IStudentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
@Qualifier("FitServiceIpml")
@Primary
public class FitServiceIpml implements IStudentService {
    /*@Override
    public String move() {
        return "на лапах";
    }

    @Override
    public AnimalDto getAnimalInfo(String name) {
        List<AnimalDto> animals = addAnimals();
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getName().equals(name)) {
                return animals.get(i);
            }
        }
        return null;
    }

    @Override
    public List<AnimalDto> addAnimal(AnimalDto dto) {
        List<AnimalDto> animals = addAnimals();

        Boolean  contain = false;

        for (AnimalDto animalDto : animals) {
            if (animalDto.getName().equals(dto.getName())) {
                contain = true;
            }
        }

        if (!contain) {
            animals.add(dto);
        }
        return animals;
    }

    public List<AnimalDto> deleteAnimalByAge (Integer age) {
        List<AnimalDto> animals = addAnimals();
        List<AnimalDto> newAnimals = new ArrayList<>();
        Boolean containe = false;

        for (AnimalDto animalDto : animals) {
            if (!animalDto.getAge().equals(age)) {
                newAnimals.add(animalDto);
            }
        }

        animals = newAnimals;
        return animals;

    }

     */

    public List<StudentDto> addStudent(StudentDto dto) {
        List<StudentDto> students = addStudents();

        Boolean  contain = false;

        for (StudentDto studentDto : students) {
            if (studentDto.getName().equals(dto.getName())) {
                contain = true;
            }
        }

        if (!contain) {
            students.add(dto);
        }
        return students;
    }


    public List<StudentDto> printAllStudents (){
        return addStudents();
    }

    @Override
    public StudentDto addSubject(String name, String subject) {
        List<StudentDto> students = addStudents();
        StudentDto student = null;

        for (StudentDto studentDto : students) {
            if (studentDto.getName().equals(name)) {
                    student = studentDto;
                    break;
            }
        }
        if (Objects.nonNull(student)) {
            if (!student.getSubjects().contains(subject)) {
                student.getSubjects().add(subject);
            }
        }

        return student;
    }

    @Override
    public StudentDto chnageStudent(String name, String faculty) {
        List<StudentDto> students = addStudents();

        for(StudentDto studentDto : students){
            if(studentDto.getName().equals(name)){
                if(!studentDto.getFaculty().equals(faculty)){
                    studentDto.setFaculty(faculty);
                    return studentDto;
                }
            }
        }
        return null;
    }

    @Override
    public StudentDto getStudent(String name) {
        List<StudentDto> students = addStudents();

        for(StudentDto studentDto : students){
            if(studentDto.getName().equals(name)){
                    return studentDto;
            }
        }
        return null;
    }

    private List<StudentDto> addStudents() {
        List<String> subjects = new ArrayList<>();
        subjects.add("oop");
        subjects.add("history");
        ArrayList<StudentDto> studentDtos = new ArrayList<>();
        studentDtos.add(StudentDto.builder()
                        .faculty("Is")
                        .age(21)
                        .name("Nargo")
                        .subjects(subjects)
                .build());

        studentDtos.add(StudentDto.builder()
                .faculty("IS")
                .age(21)
                .name("Aru")
                .subjects(subjects)
                .build());

        studentDtos.add(StudentDto.builder()
                .faculty("IS")
                .age(21)
                .name("Rabi")
                .build());


        return studentDtos;
    }
}
