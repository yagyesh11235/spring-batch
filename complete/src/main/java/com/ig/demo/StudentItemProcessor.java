package com.ig.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class StudentItemProcessor implements ItemProcessor<Student, Student> {

    private static final Logger log = LoggerFactory.getLogger(StudentItemProcessor.class);

    @Override
    public Student process(final Student student) throws Exception {
        final String firstName = student.getFirstName().toUpperCase();
        final String grade = student.getGrade().toUpperCase();

        final Student transformedStudent = new Student(firstName, grade);

        log.info("Converting (" + student + ") into (" + transformedStudent + ")");

        return transformedStudent;
    }

}
