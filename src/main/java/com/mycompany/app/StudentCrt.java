package com.mycompany.app;

import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.googlecode.ehcache.annotations.Cacheable;

import javax.persistence.EntityManager;


@Repository
@Transactional
public class StudentCrt {

        @PersistenceContext
        private EntityManager em;

        public Student addStudent(Student student) {
            em.persist(student);
            return student;
        }
        @Cacheable(cacheName = "getStudent")
        public Student getStudent(int id) {
            return em.find(Student.class,id);
        }

        public void saveStudent(Student student) {
            em.merge(student);
        }
}
