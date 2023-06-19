
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
public class StudentDaoImpl implements StudentDao {
    private final List<Student> students;

    public StudentDaoImpl() {
        this.students = new ArrayList<>();
    }

    public Student findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void save(Student stud) {
        students.add(stud);
    }

    public void update(Student stud) {
        for (Student student : students) {
            if (student.getId() == stud.getId()) {
                student.setName(stud.getName());
                student.setAge(stud.getAge());
                // Update other attributes as needed
                break;
            }
        }
    }

    public void delete(Student stud) {
        students.remove(stud);
    }

    public List<Student> findAll() {
        return students;
    }
}