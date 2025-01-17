package ru.honeyrinn.MySpringBoot2Dbase.dao;

import org.springframework.stereotype.Repository;
import ru.honeyrinn.MySpringBoot2Dbase.entity.Subject;

import java.util.List;

@Repository
public interface SubjectDAO {

    List<Subject> getAllSubjects();

    Subject saveSubject(Subject subject);

    Subject getSubject(int id);

    void deleteSubject(int id);
}

