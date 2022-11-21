package School_Management;

public abstract class Teachers_common_features {
    String first_name;
    String last_name;
    String id;
    double age;
    String department;
    String regist_no;
    Teachers_common_features(String first_name, String last_name, String id, double age, String department, String regist_no)
    {
        this.first_name=first_name;
        this.last_name=last_name;
        this.id=id;
        this.age=age;
        this.department=department;
        this.regist_no=regist_no;

    }
    public Teachers_common_features() {

    }


    public abstract void add(String name, String surname, String id, double age, String depart, String regist_no);

    public abstract boolean search(String id);

    public abstract void listing();

    public abstract void delete(String id);

    public abstract void exit();

    @Override
    public String toString() {
        return
                "{first_name= " + first_name +
                        ", last_name= " + last_name +
                        ", id= " + id +
                        ", age=" + age +
                        ", department= " + department +
                        ", regist_no= " + regist_no +"}\n";
    }


}
