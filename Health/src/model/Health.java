package model;

import java.io.Serializable;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;


public class Health  implements Serializable {
	private double height,weight,bmi;
    private String bodyType;
      
    public double getHeight(){return height;}    
    public void setHeight(double Height){this.height = height;}    
    public double getWeight(){return weight;}    
    public void setWeight(double weight){this.weight = weight;}    
    public void setBmi(double bmi){this.bmi = bmi;}    
    public double getBmi(){return this.bmi;}    
    public void setBodyType(String bodytype)
    {
    	this.bodyType = bodyType;
    }    
    public String getBodyType(){return this.bodyType;}

}
