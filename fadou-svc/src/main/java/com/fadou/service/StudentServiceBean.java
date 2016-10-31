package com.fadou.service;

import com.fadou.entity.Student;
import com.fadou.repository.StudentRepository;
import java.util.List;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Student service bean
 *
 * @version 1.0
 * @since 10/28/2016
 * @author kaba
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
public class StudentServiceBean implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceBean(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentServiceBean(){
        
    }
    
    @Override
    public Page<Student> findAll(Pageable pgbl) {

        return studentRepository.findAll(pgbl);
    }
    @Override
    public List<Student> findAll() {

        return studentRepository.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Student save(Student s) {
        if (null == studentRepository.findOne(s.getStudentId())) {
            return studentRepository.save(s);
        }

        return null;
    }

}
