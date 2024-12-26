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
public class Address implements Serializable {
    protected String road, post, district;
    public Address(String r, String p, String d)
            {
                road = r;
                post  = p;
                district = d;
            }
    public void setRoad(String r)
    {
        road = r;
    }
    public String getRoad()
    {
       return road;
    }
    public void setPost(String r)
    {
        post = r;
    }
    public String getPost()
    {
       return post;
    }
    public void setDistrict(String r)
    {
        district = r;
    }
    public String getDistrict()
    {
       return district;
    }
    public String toString() {
        return new StringBuffer("")
        .append(this.road)
        .append(this.post)
        .append(this.district).toString();
       
    }
    
}
