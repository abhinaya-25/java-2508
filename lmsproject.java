public class lmsproject {
    public static void main(String[] args) {
        System.out.println("Student information");
         String studentid="21-502";
         String studentname="Abhinaya";
         int age=21;
         int quizscore=85;
         int assignmentscore=90;
         int examscore=88;
         int grade=75;
         double attendance=80;
         double average=(quizscore+assignmentscore+examscore)/3.0;
         ++ attendance;
        attendance ++;
       
         
        System.out.println("studentid: " + studentid);
        System.out.println("studentname: " + studentname);
        System.out.println("age:" + age);
        System.out.println("quizscore:" + quizscore);
        System.out.println("assignmentscore:" + assignmentscore);
        System.out.println("Total Score: " + quizscore+assignmentscore+examscore);
        System.out.println("Average Score: " + quizscore + assignmentscore+examscore/3.0);
       System.out.println("Updated Attendance: " + attendance + "%");
        
        if (average >= 35) {
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }
 if(attendance>75 && grade>=70){
            System.out.println("Student is qualified for attendence award");
        }
        else
        {
            System.out.println("Student is not qualified for attendence award");
        }
        }
    }