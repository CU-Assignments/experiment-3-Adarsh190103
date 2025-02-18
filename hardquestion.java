import java.util.Scanner;

class CourseFullException extends Exception {
    public CourseFullException() {
        super("Course seats are FULL");
    }
}

class PrerequisiteNotMetException extends Exception {
    public PrerequisiteNotMetException() {
        super("Course prerequisite not met");
    }
}

class Main {
    public static void main(String[] args) {
        int coursecount = 0;
        int course;
        boolean prerequisite = false;
        int flag;
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter course to enroll: ");
        System.out.println("1. Advance Java \n2. ADBMS \n3. NOS"); 
        course = Sc.nextInt();
        
        try {
            switch (course) {
                case 1:
                    coursecount++;
                    System.out.println("Have you done Core Java? \n1. Yes \n2. No");
                    flag = Sc.nextInt();

                    if (flag == 1) {
                        coursecount++;
                        if (coursecount < 2) {
                            System.out.println("Course enrolled successfully");
                        } else {
                            throw new CourseFullException();
                        }
                    } else {
                        throw new PrerequisiteNotMetException();
                    }
                    break;

                case 2:
                    coursecount++;
                    System.out.println("Have you done DBMS? \n1. Yes \n2. No");
                    flag = Sc.nextInt();

                    if (flag == 1) {
                        coursecount++;
                        if (coursecount < 2) {
                            System.out.println("Course enrolled successfully");
                        } else {
                            throw new CourseFullException();
                        }
                    } else {
                        throw new PrerequisiteNotMetException();
                    }
                    break;

                case 3:
                    coursecount++;
                    System.out.println("Have you done OS? \n1. Yes \n2. No");
                    flag = Sc.nextInt();

                    if (flag == 1) {
                        coursecount++;
                        if (coursecount < 2) {
                            System.out.println("Course enrolled successfully");
                        } else {
                            throw new CourseFullException();
                        }
                    } else {
                        throw new PrerequisiteNotMetException();
                    }
                    break;

                default:
                    System.out.println("Invalid course selection.");
            }
        } catch (CourseFullException e) {
            System.out.println(e.getMessage());
        } catch (PrerequisiteNotMetException e) { 
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Process completed.");
            Sc.close();
        }
    }
}
