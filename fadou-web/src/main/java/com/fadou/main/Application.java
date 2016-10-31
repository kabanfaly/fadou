package com.fadou.main;

import com.fadou.entity.Student;
import com.fadou.service.StudentServiceBean;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Student application
 *
 * @version 1.0
 * @since 10/28/2016
 * @author kaba
 */
@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public CommandLineRunner demo(StudentServiceBean serviceBean){
        return args -> {
            Student s = new Student();
            s.setStudentId("21332");
            s.setFirstname("KABA");
            s.setLastname("N'faly");
            
            serviceBean.save(s);
            List<Student> students = serviceBean.findAll();
            
            students.stream().forEach(System.out::println);
        };
    }

}
