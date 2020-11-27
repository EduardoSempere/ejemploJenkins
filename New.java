import java.util.HashMap;
import java.util.Map;

public class New {
    
    public static void main(String[] args) {
        
        Employee emp = new Employee();

        emp.setAge(13);
        emp.setName("Eduardo");

        Student est = new Student();
        est.setAge(34);
        est.setName("Student");
        Map<String, Object> map = new HashMap<>();
        map.put("emp", emp);
        map.put("est", est);

        map.entrySet().stream().map(x -> x.getValue())
                            .map( m -> ((Employee)m).getName())
                            .forEach(System.out::println);


    }


}

class Employee {

    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

}

class Student extends Employee {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

}