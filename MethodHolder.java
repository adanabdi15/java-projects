/*
 * Author: Chris Kelly
 * Date: Spring 2015
 * Location: UMass Boston
 * 
 * Container for static methods, used for CS/IT 114 
 */

import java.util.Scanner;

public class MethodHolder {
    
    // Thought if i could make each student a cost per credit i would stop getting errors (it worked) 
    private static final double COST_PER_CREDIT = 345.59;
    private static final double COST_PER_CREDIT2 = 345.59;
     private static final double COST_PER_CREDIT3 = 345.59;
    
   // Did the samething here. Wondering if i should for intensity, we'll see when i run tests. 
    private static final int SENIOR_MIN_CREDITS = 90;
    private static final int SENIOR_MIN_CREDITS2 = 90;
    private static final int SENIOR_MIN_CREDITS3 = 90;
    
    // Ran some test came across a error so I made 3 intensity's
    private static final int INTENSITY_THRESHOLD = 4;
    private static final int INTENSITY_THRESHOLD2 = 4;
    private static final int INTENSITY_THRESHOLD3 = 4;
    
 protected static Student generateStudent(){
        // When i ran my code it would only allow me to enter the first students successfully, when i got
        // the 2nd student it would get this  (Enter Students name: Enter student Major:), knew something was
        // wrong 
        Scanner scan = new Scanner(System.in);
        String name = ("Harry Potter");
        int credits = 92;
        String major = ("Sociology");
        int age = 17;
        //Figuring out this part was hell on earth, but going back to driverclass and understand what a sentinel was
        //and seeing it was a loop, scrolling down in driverclass and finding "sentinel = scan.nextLine();" hiding in
        //plain sight (lol)
        // Then going through hell again trying to figure out why it didn't work, til i realized the difference 
        // was "Line and Int"
        System.out.print("Enter student's name: ");
        name = scan.nextLine();
        System.out.print("Enter student's major: ");
        major = scan.nextLine();
        System.out.print("Enter number of credits: ");
        credits = scan.nextInt();
        System.out.print("Enter student's age: ");
        age = scan.nextInt();
        // I spent hours trying to figure out why I didn't work. I focused my attention to the pattern. 
        // I split each student into there own respect group. giving them their own title (-,2,3)
        // rinse and repeat
        boolean isSenior = credits >= SENIOR_MIN_CREDITS;
        double tuition = COST_PER_CREDIT * credits;
        boolean isIntense = credits >= INTENSITY_THRESHOLD;
        
      return new Student(name, major, credits, age, tuition, isSenior);
      // ran into a issue here, I was using 1 curly bracett which gave me errors with my next line of code
      // because they weren't both correctly seperated. I thought adding Protected static student generatestudent(){
      // would help but it didnt at all it just made things more difficult. I was struggling for days til I looked at 
      // Driversclass and seen }{ which i don't know what it means but i understood it bridged both codes, and i guess
      // it worked. 
    }
 {
   //Ran into the scanner issue. took me couple hours to figure out why it wasn't running. Til i realized i didn't have
   // a new scanners for the new varibles i created. 
    Scanner scan = new Scanner(System.in);
        String name2 = ("Hermione Granger");
        String major2 = ("Psychology");
        int credits2 = 47;
        int age2 = 18;
        System.out.print("Enter student's name: ");
        name2 = scan.nextLine();
        System.out.print("Enter student's major: ");
        major2 = scan.nextLine();
        System.out.print("Enter number of credits: ");
        credits2 = scan.nextInt();
        System.out.print("Enter student's age: ");
        age2 = scan.nextInt();
        
        boolean isSenior2 = credits2 >= SENIOR_MIN_CREDITS2;
        double tuition2 = COST_PER_CREDIT2 * credits2;
        boolean isIntense2 = credits2 >= INTENSITY_THRESHOLD;
        //Another issue i ran into. Seening how i copied and pasted (return new student) it wouldn't run. My theory was
        //"You can't return to another return" something like that. I was basically messing with it and erased the
        // "Return" and it worked. 
     new Student(name2, major2, credits2, age2, tuition2, isSenior2);
       
       }
    {
      Scanner scan = new Scanner(System.in);
        String name3 = ("Ron Weasley");
        String major3 = ("Physics");
        int credits3 = 33;
        int age3 = 18;
        System.out.print("Enter student's name: ");
        name3 = scan.nextLine();
        System.out.print("Enter student's major: ");
        major3 = scan.nextLine();
        System.out.print("Enter number of credits: ");
        credits3 = scan.nextInt();
        System.out.print("Enter student's age: ");
        age3 = scan.nextInt();
        
        boolean isSenior3 = credits3 >= SENIOR_MIN_CREDITS3;
        double tuition3 = COST_PER_CREDIT3 * credits3;
        boolean isIntense3 = credits3 >= INTENSITY_THRESHOLD;
        
      new Student(name3, major3, credits3, age3, tuition3, isSenior3);
    }
    
    protected static Course generateCourse(){
        Scanner scan = new Scanner(System.in);
        String title = "Occulumency";
        String department = "Psychic";
        int credits = 3; 
        int maxStudents = 15;
        
        System.out.print("Enter course title: ");
        title = scan.nextLine();
        System.out.print("Enter course department: ");
        department = scan.nextLine();
        System.out.print("Enter course credits: ");
        credits = scan.nextInt(); 
        System.out.print("Enter maximum number of students: ");
        maxStudents = scan.nextInt();
        
        double cost = credits * COST_PER_CREDIT;
        boolean isIntense = credits >= INTENSITY_THRESHOLD;
        
        return new Course(title, department, credits, maxStudents, cost, isIntense);
      }
    
    
    {  
        
        String title2 = "Polyjuice";
        String department2 = "Potions";
        int credits2 = 6; 
        int maxStudents2 = 24;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter course title: ");
        title2 = scan.nextLine();
        System.out.print("Enter course department: ");
        department2 = scan.nextLine();
        System.out.print("Enter course credits: ");
        credits2 = scan.nextInt(); 
        System.out.print("Enter maximum number of students: ");
        maxStudents2 = scan.nextInt();
        
        double cost = credits2 * COST_PER_CREDIT;
        boolean isIntense2 = credits2 >= INTENSITY_THRESHOLD;

        new Course(title2, department2, credits2, maxStudents2, cost, isIntense2);
    }

    
    protected static void printStudentInfo(Student s){
        //For this part which was hell on earth. It took some time but I realized this was command 5 
        //and went back to the it114 project and seen the order the output was. After following the output exactly 
        // with qutation marks for labels. I then went to students because nothing else was working (+ name).
        // After hours of research I came to the conclusion the getname was correct but it still wouldn't run. 
        // after a few more hours I just started staring at Driverclass til i seen "(students.get(i).getName() + ": #"
        // which for some reason made sense to me. I put students.getcredits which came with another error, kept messing
        // with it til i connected the dots and out s.getcredits and omg!!!! it worked. never been so happy. 
        System.out.println("Name: " + s.getName());
        System.out.println("Major: " + s.getMajor());
        System.out.println("Credits: " + s.getCredits());
        System.out.println("Age: " + s.getAge());
        System.out.println("Spent So Far: " + s.getSpentSoFar());
        System.out.println("Student is senior? " + s.isStudentASenior());
        //After figuring out below and running i realized courses was also missing so I did the exact
        // samething with c.printStudents();. 
        System.out.println("Courses "); s.printCourses();

        

    }
    // ran some test and 4 and 5 weren't working. Just realized I didn't enter this part correctly 
    // got really frustrated, gotta learn to take a step back and scan my code.
    protected static void printCourseInfo(Course c){
        
        System.out.println("Title: " + c.getTitle());
        System.out.println("Department: " + c.getDepartment());
        System.out.println("Credits: " + c.getCredits());
        System.out.println("Enrollment: " + c.getEnrollment());
        System.out.println("Cost: " + c.getCost());
        System.out.println("Course is intensive: " + c.isCourseIntensive());
        // I have no clue how this worked. I kept running into issues with Student enrollment not showing
        // all the students that enrolled. Just messed with it til it worked.. no clue how tho. 
        System.out.println("Student enrollment "); c.printStudents();
       

        
        
        


    }
    
    // Enrolls a student in a course, if the student's schedule and 
    // the course both have space
    protected static void enrollStudentInCourse(Student s, Course c){
        
        if (s.hasSpace() && c.hasSpace()) {
            s.addCourse(c);
            c.addStudent(s);
            System.out.println(s.getName() + " added to " + c.getTitle());
        }
        else {
            if (!s.hasSpace())
                System.out.println(s.getName() + "'s schedule is full");
            if(!c.hasSpace())
                System.out.println(c.getTitle() + " is full");
        }
        
    }
   
}
