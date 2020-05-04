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
public class memberlist {
     
    member start,end;
    void add(String id,String pass,String category)
    {
        member bundle=new member(id,pass,category);
        if(start==null)
        {
            start=bundle;
            end=bundle;
        }
        else
        {
            end.next=bundle;
            end=bundle;
        }
    }
    void traversal()
    {
        member current=start;
        while(current!=null)
        {
            System.out.println(current);
            current=current.next;
        }
    }
    int search(String key)
    {
        int flag=0;
        member current=start;
        while(current!=null)
        {
            if(current.id.equals(key))
            {
                flag++;
                break;
            }
            else
                current=current.next;
        }
       return flag;
    }
}
    
   
   
