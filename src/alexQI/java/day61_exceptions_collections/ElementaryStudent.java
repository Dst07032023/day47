package alexQI.java.day61_exceptions_collections;

public class ElementaryStudent {
    private String name;
    private int age;

    public ElementaryStudent(){

    }
    public ElementaryStudent(String name, int age) throws IllegalAccessException {
        setName(name);
        setAge(age);
    }

    @Override
    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalAccessException {
        //check if name is null first, otherwise we might get null pointer exception
        if( name == null || name.isEmpty()){
            throw new IllegalAccessException("Name cannot be empty or null");
        }
        //if name is all numbers, or starts with number
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAccessException {
        if(age < 5 || age > 12) {
            throw new IllegalAccessException("Age cannot be < 5 or > 12");
        }

        this.age = age;
    }
}
