package org.example.data_access;

import org.example.Model.Classes;
import org.example.Model.Student;

import java.util.List;

public class ClassDaoImpl implements ClassDao {
    private static List<Classes> classesList;
    private static List<Student> students;

    @Override
    public Classes saveClass(Classes classes) {
        if (classesList.contains(classes)) {
            classesList.add(classes);
            System.out.println(classes.getClassesName() + "Added!");
            return classes;
        }
        return null;
    }

    @Override
    public Student register(Student student) {
        if(!students.contains(student))
            students.add(student);
        System.out.println(student.getFullName() + "Registered!");
        return student;
    }

    @Override
    public Student unregister(Student student) {
        students.remove(student);
        System.out.println(student.getFullName() + "Unregistered!");
        return student;
    }


    @Override
    public Classes findById(int Id) {
        for (Classes level: classesList) {
            if (level.getClassesId() == Id) {
                return level;
            }
        }
        return null;
    }

    @Override
    public List<Classes> findByName(String name) {
        for (Classes level: classesList) {
            if (level.getClassesName().equalsIgnoreCase(name)) {
                return classesList;
            }
        }
        return null;
    }

    @Override
    public List<Classes> findAll() {
        for (Classes level: classesList) {
            return classesList;
        }
        return null;
    }

    @Override
    public void informHeadMaster(Student student) {
        System.out.println(" Hi Headmaster! Note that: " + student.getFullName() + " With student id: " + student.getStudentId() + " has been unplaced");
    }

    @Override
    public boolean unplaceStudent(Student student) {
        for (Student stud : students){
            if (stud.equals(student)){
                students.remove(student);
                informHeadMaster(student);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeClasses(Classes classes) {
        for (Classes deleteClasses: classesList) {
            if (deleteClasses.getClassesName().equals(classes)) {
                classesList.remove(deleteClasses);
                System.out.println(classes.getClassesName() + "Deleted!");
            }
            return true;
        }
        return false;
    }
}