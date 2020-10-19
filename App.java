import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {

       
        List<Integer> numbers = Arrays.asList(new Integer[]{200,4,50,7,9});
        OptionalDouble average = numbers.stream().mapToInt(num -> num * num)
                                                 .filter(squar -> squar > 100)
                                                 .average();
        System.out.println(average.getAsDouble());
        
        // List<Integer> numbers = Arrays.asList(new Integer[]{2,2,2,2,2,2,2});
        // int suma = numbers.stream().mapToInt(x -> x).sum();
        // System.out.println(suma);

        // Random randomNumSorter = new Random();
        // randomNumSorter.ints().limit(5).sorted().forEach(System.out::println);
       
        // Random randomNumber = new Random();
        // randomNumber.ints().limit(5).forEach(System.out::println);

        // System.out.println("Current day" + java.time.LocalDate.now());
        // System.out.println("Current time " + java.time.LocalTime.now());
        // System.out.println("Current date and time " + java.time.LocalDateTime.now());


        // Integer[] arr1 = new Integer[] { 1, 9, 8, 7, 7, 8, 9 };
        // List<Integer> l1 = Arrays.asList(arr1);
        // Set<Integer> s = l1.stream().collect(Collectors.toSet());
        // s.stream().forEach(System.out::println);


        // List<String> list1 = Arrays.asList("Java", "8");
        // List<String> list2 = Arrays.asList("explained", "through", "programs");

        // Stream<String> s = Stream.concat(list1.stream(),list2.stream());
        // s.forEach(System.out::println);

        // List<String> list = new ArrayList<String>();
       
        // list.add("Softwaretestinghelp");
        // list.add("Steve");
        // list.add("Saket");
        // list.add("Saurav");

        // list.stream().filter(x -> x.length() > 2).forEach(System.out::println);
        
        // int[] arr = new int[]{ 99, 55, 203, 99, 4, 91 };

        // Arrays.stream(arr).sorted().forEach(System.out::println);

        // Stream.iterate(1, count -> count +1).filter(x -> x%2==0).limit(5).forEach(System.out::println);

        // StringJoiner stj = new StringJoiner(",", "(", ")");
         
        // // Separated the elements with a comma in between.
        // //Added a prefix "(" and a suffix ")"
         
        // stj.add("Saket");
        // stj.add("John");
        // stj.add("Franklin");
        // stj.add("Ricky");
        // stj.add("Trevor");
         
        // // Added elements into StringJoiner “stj”
         
        // System.out.println(stj);



        // Map<String, String> m = new HashMap<>();
        // m.put("Config1","sempere");
        // m.put("Config2","ANA");
        // m.put("Config3","sempere2");
        // Map<String, String> m1 = new HashMap<>();
        // m1.put("Config5","Ivhana");
        // m1.put("Config6","Montserrat");
        // m1.put("Config7","Ivhana3");

        // List<Map<String,String>> l = new ArrayList<>();
        // l.add(m);
        // l.add(m1);
        // l.stream().flatMap(x -> x.entrySet().stream()).
        //                     filter(x -> x.getValue().equals("ANA")).forEach(System.out::println);


        // List<List<String>> Names = Arrays.asList(Arrays.asList("Saket", "Trevor"),
        //                                          Arrays.asList("John", "Michael"),
        //                                          Arrays.asList("Shawn", "Franklin"), 
        //                                          Arrays.asList("Johnty", "Sean"));

        /*
         * Created a “List of List of type String” i.e. List<List<String>> Stored names
         * into the list
         */

        // List<String> Start = Names.stream()
        //                         .flatMap(FirstName -> FirstName.stream())
        //                         .filter(s -> s.startsWith("S"))
        //                         .collect(Collectors.toList());

        // /*
        //  * Converted it into Stream and filtered out the names which start with 'S'
        //  */

        // Start.forEach(System.out::println);

        // Integer highest = Stream.of(1, 2, 3, 77, 6,
        // 5).max(Comparator.comparing(Integer::valueOf)).get();

        // Supplier<String> str = () -> "Saket";
        // System.out.println(str.get());

        // Consumer<String> str = str1 -> System.out.println(str1);
        // str.accept("Saket");

        // List<String> list = Arrays.asList("A","B","C","D","B");

        // Optional<String> r = list.stream().findAny();
        // if (r.isPresent()) {
        // System.out.println(r.get());
        // }

        // double t = Arrays.stream(new int[]{ 100, 100, 9, 8, 200 }).map(x -> x *
        // x).filter(i -> i > 100).average().getAsDouble();
        // System.out.println(t);

        // Arrays.stream(new int[]{1,2,3,4,5,6,7,8,9,0}).map(i -> i
        // ).limit(5).forEach(System.out::println);

        // String s = Arrays.stream(new
        // int[]{1,2,3,4,5,6,7,8,9,0}).mapToObj(String::valueOf).skip(5).collect(Collectors.joining("-"));
        // System.out.println(s);

        // double m = Arrays.stream(new int[]{2,7,4,1,9}).map(i -> i
        // ).average().getAsDouble();
        // System.out.println(m);

        // ArrayList<Integer> list = new ArrayList<Integer>();

        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);
        // // Added the numbers into Arraylist
        // System.out.println(sum(list));

        // Given a list of employees, you need to find all the employees whose
        // age is greater than 30 and print the employee names.(Java 8 APIs only)

        // List<Employee> le = new ArrayList<>();
        // le.add(new Employee("Eduardo", 39));
        // le.add(new Employee("Ana", 23));
        // le.add(new Employee("Ivhana", 3));
        // le.add(new Employee("Montse", 2));
        // le.add(new Employee("Montserrat", 9));

        // List<Employee> lr = le.stream().filter(x -> x.getAge() >
        // 30).collect(Collectors.toList());
        // lr.stream().forEach(x->System.out.println(x));

        // Exercise 2
        // Given the list of employees, find the count of employees with age greater
        // than 25?

        // long r = le.stream().filter(x -> x.getAge() > 28).count();
        // System.out.println(r);

        // Exercise 3
        // Given the list of employees, find the employee whose name is John

        // Optional<Employee> e = le.stream().filter(x ->
        // x.getName().equals("Ana")).findAny();
        // if (e.isPresent()) {
        // System.out.println(e.get());
        // }

        // Exercise 4
        // Given a list of employees, You need to find highest age of employee?

        // OptionalInt age = le.stream().mapToInt(x -> x.getAge()).max();
        // OptionalInt age = le.stream().mapToInt(Employee::getAge).max();
        // if (age.isPresent()) {
        // System.out.println(age.getAsInt());
        // }

        // Excercise 5
        // Given a list of employees, you need sort employee list by age? Use java 8
        // APIs only

        // le.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);

        // List<Employee> lr =
        // le.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).collect(Collectors.toList());
        // lr.stream().forEach(System.out::println);

        // Excercise 6
        // Given the list of Employees, you need to join the all employee names with
        // ","?

        // String r =
        // le.stream().map(Employee::getName).collect(Collectors.joining(","));
        // System.out.println(r);

        // Excercise 7
        // Given the list of employees, you need to group them by name

        // List<Employee> le2 = new ArrayList<>();
        // le2.add(new Employee("Eduardo", 39));
        // le2.add(new Employee("Ana", 23));
        // le2.add(new Employee("Ivhana", 3));
        // le2.add(new Employee("Ana", 2));
        // le2.add(new Employee("Eduardo", 9));

        // // Map<String, List<Employee>> mr =
        // le2.stream().collect(Collectors.groupingBy(x -> x.getName()));
        // Map<String, List<Employee>> mr =
        // le2.stream().collect(Collectors.groupingBy(Employee::getName));
        // mr.entrySet().stream().forEach(System.out::println);

    }

    static class Employee {
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

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Employee [age=" + age + ", name=" + name + "]";
        }

    }

    public static int sum(ArrayList<Integer> list) {
        return list.stream().mapToInt(x -> x).max().getAsInt();
    }
}
