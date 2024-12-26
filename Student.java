/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OurProject;
import java.io.*;
import java.util.Objects;
/**
 *
 * @author Hp
 */
class Student extends Person implements Serializable, Comparable<Student> {
    private int id;

    public Student(int id, String n, String r, String p, String d) {
        super(n, r, p, d);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.id, s.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id;
    }



    public String toString() {
        return new StringBuffer("")
                .append(this.id)
                .append(super.toString()).toString();
    }
}

