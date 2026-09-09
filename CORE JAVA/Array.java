class Student{

    int rollno;
    String name;
    int marks;
}

public class Array {
    public static void main(String[] args) {
        
    //   int nums[] = {3,7,2,4};  
    //   nums[0] = 2;

    Student s1 = new Student();
    s1.rollno = 1;
    s1.name = "Ganesh";
    s1.marks = 88;

    Student s2 = new Student();
    s2.rollno = 2;
    s2.name = "Bhagwan";
    s2.marks = 36;

    Student s3 = new Student();
    s3.rollno = 3;
    s3.name = "Tanmay";
    s3.marks = 53;

    Student students[] = new Student[3];
    students[0] =  s1;
    students[1] =  s2;
    students[2] =  s3;

    // for(int i=0; i<students.length; i++){
    //     System.out.println(students[i]. name + " : " + students[i].marks);
    // }

    // OR

    for(Student stud : students){
        System.out.println(stud.name + " : " + stud.marks);
    }

    int nums[] = new int[4];
    nums[0] = 4;
    nums[1] = 8;
    nums[2] = 3;
    nums[3] = 9;

    for(int i=0; i<4; i++){
        System.out.println(nums[i]);
    }

    }
}
