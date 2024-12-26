/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OurProject;
import java.io.*;
/**
 *
 * @author Hp
 */
public class Person implements Serializable{
    protected String name;
    protected Address address;
    public Person(String n, String r, String p, String d)
    {
        name = n;
        address = new Address(r, p, d);
    }
     public void setName(String r)
    {
        name = r;
    }
     public String getName()
    {
      return  name ;
    }
   public int compareTo(Person p1) {
        return this.name.compareTo(p1.name);
    }
     public boolean equals(Object obj) {
        Person p1 = (Person) obj;
        return this.name.equals(p1.name);
    }
     public String toString() {
        return new StringBuffer("")
     .append(name)
        .append(address).toString();
                }
     
}
