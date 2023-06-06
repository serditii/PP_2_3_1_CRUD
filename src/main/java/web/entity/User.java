package web.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int id;

    @NotEmpty
    @Size(min = 2, max = 30)
    @Column(name = "name")
    private String name;

    @NotEmpty
    @Size(min = 2, max = 30)
    @Column(name = "last_name")
    private String lastName;

    @NotEmpty
    @Size(min = 4, max = 30)
    @Column(name = "email")
    @Email
    private String email;

    @NotEmpty
    @Size(min = 2, max = 30)
    @Column(name = "sity")
    private String sity;

    @NotEmpty
    @Min(0)
    @Max(100)
    @Column(name = "age")
    private int age;

    public User() {
    }

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSity() {
        return sity;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }
}

