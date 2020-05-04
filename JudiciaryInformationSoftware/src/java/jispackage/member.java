/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jispackage;

/**
 *
 * @author student
 */
public class member {
    
    String id;
    String password;
    String category;
    member next;
    member(String id,String password,String category)
    {
        this.id=id;
        this.password=password;
        this.category=category;
        next=null;
    }
    public String toString()
    {
        return id+" "+password+" "+category;
    }
    
}
