/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examplestudent;

/**
 * Part-Time branch
 * @author sivagamasrinivasan
 */
public class ExampleStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // using array print name , sid 
        Student s1 = new Student();
        s1.setName("peter");
        s1.setSid(1);
           Student s2 = new Student();
        s2.setName("john");
        s2.setSid(2);
           Student s3 = new Student();
        s3.setName("kiran");
        s3.setSid(3);
        //int[] 
       Student[] list = new Student[3]; // array of object 
       list[0]=s1;
       list[1]=s2;
       list[2] =s3 ;//objects are saved in array
       for(int i=0;i<list.length;i++)
       {
           // Student s1 = new Student();
           System.out.println(list[i].getName()+ " "+list[i].getSid());
       }
    }
    
}
