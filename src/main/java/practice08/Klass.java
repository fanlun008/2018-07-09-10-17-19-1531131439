package practice08;

public class Klass {

    private int number;
    private Student leader;

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student) {
        this.leader = student;
    }

    public Klass() {
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return String.format("Class %d", this.number);
    }

}
