/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OurProject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Hp
 */
public class Student_List implements Serializable {
     ArrayList<Student> sList;

    public Student_List() {
        this.sList = new ArrayList();
    }
    public void addStudent(Student i){
            sList.add(i);
    }
    public void deleteStudent(int index){
     sList.remove(index);
    }
    public void updateStudent(int index, Student i){
     sList.set(index,i);
    }
    
    public Student get(int index){
     return sList.get(index);
    }
    public int getIndex(Student c){
     return sList.indexOf(c);
    }
    public boolean Contains(Student i){
     return sList.contains(i);
    }
    public int num_Students(){
     return sList.size();
    }
    
    public void Sort(){
        Collections.sort(sList);
    }
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("");
        for (Student i : sList) {
            sb.append(i);
        }
      return sb.toString();
    }

    public ArrayList<Student> getsList() {
        return sList;
    }
    public boolean isEmpty() {
        return sList.isEmpty();
    }

}
