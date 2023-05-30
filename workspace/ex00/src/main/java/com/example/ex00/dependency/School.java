package com.example.ex00.dependency;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Data
@Component
@RequiredArgsConstructor
public class School {
    ArrayList<Teacher> teachers;
    ArrayList<Student> students;
}
