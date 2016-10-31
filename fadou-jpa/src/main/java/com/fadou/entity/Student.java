package com.fadou.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Student entity class
 *
 * @version 1.0
 * @since 10/17/2016
 * @author kaba
 */
@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
public class Student implements Serializable {

    @Id
    private String studentId;

    private String firstname;
    private String lastname;
    private Date dateOfBirth;


    @Override
    public String toString() {
        return String.format("%s \n %s %s \n %s", studentId, firstname, lastname, dateOfBirth);
    }

}
