public class constructor {
    public static void main(String args[]){
        Student s = new Student("Saisidhartha");
    }
}
class Student{
    String name;
    int roll;
    Student(String name)
    {
       
        System.out.println(name);
    }
}