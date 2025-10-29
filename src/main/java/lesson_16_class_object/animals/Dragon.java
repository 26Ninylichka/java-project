package lesson_16_class_object.animals;

public class Dragon {

    private String name;
    private int age;
    private double weight;


    public Dragon() {

        System.out.println("Викликано конструктор без параметрів");
        System.out.println("Створено невідомого Дракона");
    }

    public Dragon(String name, int age, double weight) {
        System.out.println("Викликано конструктор з параметрами");
        System.out.println("Створено повноцінного Дракона");

        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }
    public void voice() {
        System.out.println("Тепер я тебе можу з'їсти 🔥");
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
