package com.my.demo;
import com.google.gson.Gson;
/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student s =new Student();
        s.setId(100);

        String str = new Gson().toJson(s);
        System.out.println(str);

        Student s1 = new Gson().fromJson(str,Student.class);
        System.out.println(s1.getId());
    }
}
