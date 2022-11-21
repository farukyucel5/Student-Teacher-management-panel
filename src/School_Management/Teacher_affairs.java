package School_Management;

import java.util.ArrayList;

public class Teacher_affairs extends Teachers_common_features {
    Teacher_affairs(String first_name, String last_name, String id, double age, String department, String regist_no) {
        super(first_name, last_name, id, age, department, regist_no);
    }

    ArrayList<Teacher_affairs> teachers= new ArrayList<>();

    public Teacher_affairs() {

        super();
    }

    @Override
    public void add(String name,String surname,String id,double age,String depart,String regist_no) {
        Teacher_affairs teacher1=new Teacher_affairs(name,surname,id,age,depart,regist_no);

        teachers.add(teacher1);

    }

    @Override
    public boolean search(String id) {
        for(Teacher_affairs each:teachers)
        {
            if (each.id.equals(id))
                return true;
        }

        return false;
    }

    @Override
    public void listing() {
        System.out.println(teachers);
    }

    @Override
    public void delete(String id) {
        teachers.removeIf(each -> each.id.equals(id));
    }

    @Override
    public void exit() {
        System.exit(0);

    }
}
