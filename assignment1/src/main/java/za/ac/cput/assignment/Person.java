/*
 * @author:219169640 - Casey Michael Keven Crafford
 * ADP372S Assignment 1 Term 1
 * Using Github, Maven and Test Driven Development
 */

package za.ac.cput.assignment;

public class Person {
    private String id, name, gender;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
