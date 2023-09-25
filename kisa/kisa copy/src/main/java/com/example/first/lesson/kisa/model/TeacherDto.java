package com.example.first.lesson.kisa.model;

import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherDto {
    private String name;
    @Builder.Default
    private List<String> subjects = new ArrayList<>();
    @Builder.Default
    private List<String> groups = new ArrayList<>();
    @Builder.Default
    private Map<String,StudentDto> studentIds = new HashMap<>();
}