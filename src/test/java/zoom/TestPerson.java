package zoom;

import associa.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;


        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();


        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);

    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);



        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testShoeSize(){
        Person person = new Person();
        Integer expected = 8;

        person.setShoeSize(expected);

        Integer actual = person.getShoeSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBirthYear(){
        Person person = new Person();
        Integer expected = 1998;

        person.setBirthYear(expected);

        Integer actual = person.getBirthYear();
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void testEyeColor(){
        Person person = new Person();
        String expected = "Dark Brown";

        person.setEyeColor(expected);

        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void testMiddleName(){
        Person person = new Person();
        String expected = "Jemila";

        person.setMiddleName(expected);

        String actual = person.getMiddleName();
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void testShirtSize(){
        Person person = new Person();
        char expected = 'M';

        person.setShirtSize(expected);

        char actual = person.getShirtSize();
        Assert.assertEquals(expected, actual);
    }
}
