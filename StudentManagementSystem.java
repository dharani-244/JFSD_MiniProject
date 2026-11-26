import java.util.Scanner;

public class StudentManagementSystem {
    private int studentId;
    private String name;
    private String department;
    private int total;
    private int mark1, mark2, mark3, mark4, mark5;
    private double avg;
    private String grade;
    private int result;
    StudentManagementSystem(int studentId, String name, String department) {
    this.studentId = studentId;
    this.name = name;
    this.department = department;
}
    void display(int studentId,String name,String department,int total,double avg,String grade,String result){
        System.out.println("========student report========");
        System.out.println("Student id :"+studentId);
        System.out.println("student name :"+name);
        System.out.println("department :"+department);
        System.out.println("total marks :"+total);
        System.out.println("avarage :"+avg);
        System.out.println("grade :"+grade);
        System.out.println("result :"+result);


    }
    int calculateTotal(){
        return total=mark1+mark2+mark3+mark4+mark5;
        
    }
    double calculateAverage(){
        total=calculateTotal();
        avg=total/5;
        return avg;

        
    }

    String calculategrade(){
        avg=calculateAverage();
        if(avg>=90 ){
            return "A+";
           
        }
       else if(avg>=80 && avg<90){
            return "A";
             
        }
        else if(avg>=70 && avg<80){
            return "B";
             
        }
        else if(avg>=60 && avg<70){
            return "C";
            
        }
        else if(avg>=50 && avg<60){
            return "D";
            
        } 
        else{
            return "F";
        }
    }
    String calculateResult(){
        grade=calculategrade();
        if(avg>=50){
            return "Pass";
        }
        else{
            return "Fail";
        }
    }
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t===========Student management system==========");
         System.out.println("enter student ID: ");
        int Id=sc.nextInt();
        System.out.println("enter student name: ");
        String name=sc.next();
        
       System.out.println("enter department :");
        String dep=sc.next();
        StudentManagementSystem s=new StudentManagementSystem(Id, name, dep);        
        
        System.out.println("enter subject 1 marks :");
        s.mark1=sc.nextInt();
        System.out.println("enter subject 2 marks:");
        
        s.mark2=sc.nextInt();
        System.out.println("enter subject 3 marks:");
        
        s.mark3=sc.nextInt();
        System.out.println("enter subject 4 marks:");
        
        s.mark4=sc.nextInt();
        System.out.println("enter subject 5 marks:");
        
        s.mark5=sc.nextInt();
        
        int total=s.calculateTotal();
     
        double avg=s.calculateAverage();
        
        String grade=s.calculategrade();
        
        String result=s.calculateResult();
       
        s.display(Id, name, dep, total, avg, grade, result);
        
       

        sc.close();
    }





       
        

       


}
   


    

