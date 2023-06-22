/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo14;

/**
 *
 * @author ficdev
 */
public class Main {
    public static void main(String[] args) {
        DataSource ds = new DataSource("jdbc:postgresql://localhost:5432/Capitulo14teste", "postgres", "123456");
        StudentDao studDao = new StudentDaoImpl();
        studDao.setDataSource(ds);

        // Exemplo de uso do DAO
        Student stud = studDao.findById(1);
        if (stud != null) {
            stud.setName("João");
            studDao.update(stud);
            List<Student> studList = studDao.findAll();
            for (Student s : studList) {
                System.out.println(s.getName());
            }
        } else {
            System.out.println("Estudante não encontrado.");
        }
    }
}
