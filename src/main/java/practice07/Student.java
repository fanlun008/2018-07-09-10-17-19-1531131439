package practice07;

public class Student extends Person {
    private Klass klass;

    public Student(Klass klass) {
        this.klass = klass;
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student() {
    }

    @Override
    public String introduce() {
        return String.format("%1$s I am a Student. I am at %2$s.",super.introduce(), klass.getDisplayName());
    }
}