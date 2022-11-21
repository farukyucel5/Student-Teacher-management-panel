package School_Management;

import java.util.Scanner;

public class User_interface {
    public static void main(String[] args) {
        Teacher_affairs teacher=new Teacher_affairs();

        Scanner scan=new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("STUDENT AND TEACHER MANAGEMENT PANEL");
        System.out.println("======================================================");

        System.out.println("1.Teacher affairs\n"+"2.Student affairs\n"+"Q.Exit");
        String input=scan.next();

        if (input.equals("1")) {


           while (true)
           {
               System.out.println("============= İŞLEMLER =============");
               System.out.println("1.Add\n"+"2.Search\n"+"3.Listing\n"+"4.Delete\n"+"5.Exit");
               String input1=scan.next();
               switch (input1)
               {
                   case "1":
                       System.out.print("Username: \n");
                       String name=scan.next();
                       System.out.println("Surname: \n");
                       String surname=scan.next();
                       System.out.println("Id no: \n");
                       String id=scan.next();
                       System.out.println("Age: \n");
                       int age= scan.nextInt();
                       System.out.println("Department: \n");
                       String depart=scan.next();
                       System.out.println("Registration number: ");
                       String regist_no=scan.next();
                       teacher.add(name,surname,id,age,depart,regist_no);
                       break;

                   case "2":
                       System.out.println("Id no: \n");
                       String id1=scan.next();
                       System.out.println(teacher.search(id1));
                       break;


                   case "3":
                       teacher.listing();
                       break;
                   case "4":
                       System.out.println("Id no: \n");
                       String id2=scan.next();
                       teacher.delete(id2);
                       break;

                   case "5":
                       teacher.exit();
                       break;
                   default:
                       System.out.println("please enter a valid input");
               }
           }


        }
        if (input.equals("2")) {
            while (true)
            {
                System.out.println("============= İŞLEMLER =============");
                System.out.println("1.Add\n"+"2.Search\n"+"3.Listing\n"+"4.Delete\n"+"5.Exit");
                String input1=scan.next();
                switch (input1)
                {
                    case "1":
                        System.out.print("Username: \n");
                        String name=scan.next();
                        System.out.println("Surname: \n");
                        String surname=scan.next();
                        System.out.println("Id no: \n");
                        String id=scan.next();
                        System.out.println("Age: \n");
                        int age= scan.nextInt();
                        System.out.println("student number: \n");
                        String student_no=scan.next();
                        System.out.println("Batch_no: ");
                        String batch_no=scan.next();
                        teacher.add(name,surname,id,age,student_no,batch_no);
                        break;

                    case "2":
                        System.out.println("Id no: \n");
                        String id1=scan.next();
                        System.out.println(teacher.search(id1));
                        break;


                    case "3":
                        teacher.listing();
                        break;
                    case "4":
                        System.out.println("Id no: \n");
                        String id2=scan.next();
                        teacher.delete(id2);
                        break;

                    case "5":
                        teacher.exit();
                        break;
                    default:
                        System.out.println("please enter a valid input");
                }
            }

        }

        if (input.equals("q"))
            teacher.exit();

    }
}
