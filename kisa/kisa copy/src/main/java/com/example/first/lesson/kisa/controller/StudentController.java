package com.example.first.lesson.kisa.controller;

import com.example.first.lesson.kisa.model.StudentDto;
import com.example.first.lesson.kisa.services.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@RequiredArgsConstructor

public class StudentController {
    private final IStudentService studentService;

    @PostMapping
    public ResponseEntity<List<StudentDto>> addNewStudent(@RequestBody StudentDto studentDto) {
        return ResponseEntity.ok(studentService.addStudent(studentDto));
    }

    @GetMapping("/print-all")
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        return ResponseEntity.ok(studentService.printAllStudents());
    }

    @PostMapping ("/add-subj")
    public StudentDto addSubject(@RequestParam (name = "studentName")String studentName,
                                 @RequestParam  (name = "subject")String subject){
    return studentService.addSubject(studentName, subject);
    }

    @PutMapping ("/change-fac")
    public StudentDto changeFaculty(@RequestParam (name = "studentName")String studentName,
                                    @RequestParam  (name = "faculty")String faculty){
        return studentService.chnageStudent(studentName, faculty);
    }
    /*@GetMapping("/move")
    public ResponseEntity<String> getMove() {
       return  ResponseEntity.ok(animalService.move());
    }

    @GetMapping("/by-name")
    public ResponseEntity<AnimalDto> getAnimalByName(@RequestParam(name = "name") String name) {
        return ResponseEntity.ok(animalService.getAnimalInfo(name));
    }

    @PostMapping
    public ResponseEntity<List<AnimalDto>> addNewAnimal(@RequestBody AnimalDto animalDto) {
        return ResponseEntity.ok(animalService.addAnimal(animalDto));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<List<AnimalDto>> deleteAnimalByAge(@RequestParam(name = "age") Integer name) {
        return ResponseEntity.ok(animalService.deleteAnimalByAge(name));
    }

     */
}
