//package com.example.demo.configs;
//
//import com.example.demo.entities.StudentEntity;
//import com.example.demo.repositories.StudentRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//@Slf4j
//public class StudentConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner() {
//        return args -> {
////            StudentEntity quinn1 = new StudentEntity( "quinn1", "kongu@", LocalDate.of(2001, Month.AUGUST, 27), 21);
////            StudentEntity quinn2 = new StudentEntity( "quinn2", "kongudau@", LocalDate.of(2004, Month.AUGUST, 27), 21);
////            StudentEntity quinn3 = new StudentEntity( "quinn3", "kongu@", LocalDate.of(2005, Month.AUGUST, 27), 21);
////            List<StudentEntity> lst = new ArrayList<>();
////            lst.add(quinn1);
////            lst.add(quinn2);
////            lst.add(quinn3);
////            repository.saveAll(lst);
////            log.info("Insert studetns");
//        };
//    }
//}
