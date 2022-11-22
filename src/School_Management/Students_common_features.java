package School_Management;

public abstract class Students_common_features {
    String s_first_name;
    String s_last_name;
    String s_id;
    double s_age;
    String student_no;
    String batch_no;

    public Students_common_features(String s_first_name, String s_last_name, String s_id,
                                    double s_age, String student_no, String batch_no) {
        this.s_first_name = s_first_name;
        this.s_last_name = s_last_name;
        this.s_id = s_id;
        this.s_age = s_age;
        this.student_no = student_no;
        this.batch_no = batch_no;
    }

    public Students_common_features() {

    }


    public abstract void add(String name, String surname, String id, double age, String student_no, String batch_no);

    public abstract boolean search(String id);

    public abstract void listing();

    public abstract void delete(String id);

    public abstract void exit();

    @Override
    public String toString() {
        return
                "{s_first_name= " + s_first_name +
                ", s_last_name= " + s_last_name +
                ", s_id='" + s_id +
                ", s_age=" + s_age +
                ", student_no= " + student_no +
                ", batch_no= " + batch_no +
                "}\n";
    }
}
