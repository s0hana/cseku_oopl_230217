/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OurProject;

import java.io.*;
import java.util.*;


/**
 *
 * @author Hp
 */
public class Person_List implements Serializable {
     ArrayList<Person> pList;

    public Person_List() {
        this.pList = new ArrayList();
    }
    public void addPerson(Person i){
            pList.add(i);
    }
    public void deletePerson(int index){
     pList.remove(index);
    }
    public void updatePerson(int index, Person i){
     pList.set(index,i);
    }
    
    public Person get(int index){
     return pList.get(index);
    }
    public int getIndex(Person c){
     return pList.indexOf(c);
    }
    public boolean Contains(Person i){
     return pList.contains(i);
    }
    public int num_Person(){
     return pList.size();
    }
    
    public void Sort() {
        Collections.sort(pList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
    }
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("");
        for (Person i : pList) {
            sb.append(i);
        }
      return sb.toString();
    }

    public ArrayList<Person> getcList() {
        return pList;
    }
    public boolean isEmpty() {
        return pList.isEmpty();
    }

}

