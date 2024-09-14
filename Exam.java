
public class Exam {
    int Student_Id;
    String  Student_name ;
    String Student_city;

    public void Study(){
        System.out.println(Student_name+" is study");
    }
    public void FullDetail(){
        System.out.println("My name is "+Student_name);
        System.out.println("my id "+Student_Id);
        System.out.println("my city nsme "+Student_city);
    }
    public static void main(String[] args) {
        Exam st1;
        st1 = new Exam();

        st1.Student_name="Ram";
        st1.Student_Id=22;
        st1.Student_city="Dehli";
        st1.Study();
        st1.FullDetail();
    }
    
}
