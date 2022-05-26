package com.example.demo.controllers;


import com.example.demo.entities.StudentEntity;
import com.example.demo.models.StudentModel;
import com.example.demo.models.UserResponseModel;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }



    @GetMapping("/get-student/{student_id}")
    public StudentEntity getStudentByIdController(@PathVariable("student_id") long studentId) {
        return studentService.getStudentById(studentId);
    }

    @PutMapping("/update-student/{student_id}")
    public ResponseEntity<UserResponseModel> updateStudentByIdController(@PathVariable("student_id") long studentId, @RequestBody StudentModel studentModel){
        studentService.updateStudentById(studentModel, studentId);

        return new ResponseEntity<>(
                new UserResponseModel(HttpStatus.OK.value(), "Update student successfully!"),
                HttpStatus.OK
        );
    }



    @GetMapping
    public List<StudentEntity> getAllStudent(){
        return studentService.getAllStudent();
    }


    @PostMapping
    public ResponseEntity<UserResponseModel> createStudentByIdController( @RequestBody StudentModel studentModel){
        studentService.createStudent(studentModel);

        return new ResponseEntity<>(
                new UserResponseModel(HttpStatus.OK.value(), "Create student successfully!"),
                HttpStatus.OK
        );
    }

    @DeleteMapping("/{student_id}")
    public ResponseEntity<UserResponseModel> deleteStudentByIdController(@PathVariable("student_id") long studentId){
        studentService.deleteStudentById(studentId);

        return new ResponseEntity<>(
                new UserResponseModel(HttpStatus.OK.value(), "Delete student successfully!"),
                HttpStatus.OK
        );
    }
}
