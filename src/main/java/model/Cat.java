package model;

public class Cat {
    private long id;
    private String catName;
    private int age;

    public Cat() {
    }

    public Cat(Long id, String catName, int age) {
        this.id = id;
        this.catName = catName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{ id=" + id +
                ", catName='" + catName + '\'' +
                ", age=" + age + '}';
    }

    // accessors

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
