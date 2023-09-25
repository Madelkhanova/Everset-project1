package com.example.first.lesson.kisa.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto{
    private String faculty;
    private String name;
    private Integer age;
    private List<String> subjects = new ArrayList<>();
}
