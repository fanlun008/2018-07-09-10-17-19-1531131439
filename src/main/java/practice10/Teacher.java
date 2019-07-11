package practice10;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{

    private Klass klass;
    private List<Klass> classes;

    public List getClasses() {
        return classes;
    }

    public void setClasses(List classes) {
        this.classes = classes;
    }

    public Teacher(int id, String name, int age, List classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(Klass klass) {
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        if (this.classes == null || this.classes.isEmpty()) {
            return String.format("%1$s I am a Teacher. I teach No Class.",super.introduce());
        } else {
            String clasString = "";
            List<String> collect = this.classes.stream().map(value -> value.getNumber().toString()).collect(Collectors.toList());
            Object[] objects = collect.toArray();
            clasString = StringUtils.join(objects, ", ");
            return String.format("%1$s I am a Teacher. I teach Class %2$s.",super.introduce(), clasString);
        }
//        if (this.klass == null) {
//            return String.format("%1$s I am a Teacher. I teach No Class.",super.introduce());
//        } else {
//            return String.format("%1$s I am a Teacher. I teach %2$s.",super.introduce(), this.klass.getDisplayName());
//        }

    }

    public String introduceWith(Student student) {
        if (isTeaching(student)){
            return String.format("%1$s I am a Teacher. I teach %2$s.", super.introduce(), student.getName());
        }else {
            return String.format("%1$s I am a Teacher. I don't teach %2$s.", super.introduce(), student.getName());
        }

    }

    public boolean isTeaching(Student student) {
        for (Klass klass : this.classes) {
            if (klass.getNumber() == student.getKlass().getNumber()) {
                return true;
            }
        }
        return false;
    }
}
