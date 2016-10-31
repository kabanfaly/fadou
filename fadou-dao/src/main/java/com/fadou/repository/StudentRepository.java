package com.fadou.repository;

import com.fadou.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Student repository
 * 
 * @version 1.0
 * @since 10/28/2016
 * @author kaba
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    
}
