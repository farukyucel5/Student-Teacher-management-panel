package School_Management;

import java.util.ArrayList;

public class Student_affairs extends Students_common_features {


    public Student_affairs(String s_first_name, String s_last_name, String s_id, double s_age, String student_no, String batch_no) {
        super(s_first_name, s_last_name, s_id, s_age, student_no, batch_no);
    }
    public Student_affairs()
    {
        super();
    }

    ArrayList<Student_affairs> students= new ArrayList<>();

    @Override
    public void add(String name, String surname, String id, double age, String student_no, String batch_no) {
        Student_affairs student=new Student_affairs();
        students.add(student);
    }

    @Override
    public boolean search(String id) {

        for (Student_affairs each:students) {
            if (each.s_id.equals(id))
                return true;
        }

        return false;
    }

    @Override
    public void listing() {
        System.out.println(students);

    }

    @Override
    public void delete(String id) {
            students.removeIf(each-> each.s_id.equals(id));
    }

    @Override
    public void exit() {
        System.exit(0);

    }
}
