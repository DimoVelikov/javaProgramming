package day44_Abstaction.breakfast;

public abstract class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }


    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }

    public abstract void eat();
    public void drink(){
        System.out.println("all the animals drink water");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
