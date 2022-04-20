package associa;

public class Person {
    private String name;
    private int age;
    private String middleName;
    private int birthYear;
    private int shoeSize;
    private String eyeColor;
    private char shirtSize;


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;

    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {

        this.name = name;
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getShoeSize() {
        return this.shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public char getShirtSize() {
        return shirtSize;
    }

    public void setShirtSize(char shirtSize) {
        this.shirtSize = shirtSize;
    }

}
