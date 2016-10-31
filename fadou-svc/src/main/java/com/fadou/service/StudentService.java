package com.fadou.service;

import com.fadou.entity.Student;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Student service
 * 
 * @version 1.0
 * @since 10/28/2016
 * @author kaba
 */
public interface StudentService {
    
    Page<Student> findAll(Pageable pgbl);
    List<Student> findAll();
    Student save(Student s);
}
