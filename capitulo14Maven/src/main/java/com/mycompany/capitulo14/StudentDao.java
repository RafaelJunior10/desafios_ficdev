/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo14;

import java.sql.*;

public class StudentDao {
    Student findById(int id);
    void save(Student stud);
    void update(Student stud);
    void delete(Student stud);
    List<Student> findAll();
}
