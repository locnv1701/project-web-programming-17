package com.example.demo.services;

import com.example.demo.models.StudentModel;
import com.example.demo.repositories.StudentRepository;
import com.example.demo.entities.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<StudentEntity> getAllStudent(){
        return studentRepository.findAll();
    }

    public StudentEntity getStudentById(long studentId) {
        StudentEntity studentEntity = studentRepository.findById(studentId).get();
        return studentEntity;
    }

    public void updateStudentById(StudentModel studentModel, long studentId) {
        StudentEntity studentEntity = studentRepository.findById(studentId).get();
        studentEntity.setName(studentModel.getName());
        studentEntity.setEmail(studentModel.getEmail());
        studentEntity.setDob(studentModel.getDob());
        studentEntity.setAge(studentModel.getAge());

        studentRepository.save(studentEntity);
    }

    public void deleteStudentById(long studentId) {
        studentRepository.deleteById(studentId);
    }

    public void createStudent(StudentModel studentModel) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(studentModel.getName());
        studentEntity.setEmail(studentModel.getEmail());
        studentEntity.setDob(studentModel.getDob());
        studentEntity.setAge(studentModel.getAge());

        studentRepository.save(studentEntity);
    }
}
