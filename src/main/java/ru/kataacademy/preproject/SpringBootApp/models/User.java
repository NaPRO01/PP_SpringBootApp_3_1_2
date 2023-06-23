package ru.kataacademy.preproject.SpringBootApp.models;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_Name")
//    @NotEmpty(message = "Name should not be empty!")
//    @Size(min = 2, max = 20, message = "Name should be between 2 and 30 characters!")
    private String firstName;

    @Column(name = "last_name")
//    @NotEmpty(message = "Surname should not be empty!")
//    @Size(min = 2, max = 20, message = "Surname should be between 2 and 30 characters!")
    private String lastName;

    @Column(name = "email")
//    @NotEmpty(message = "Email should not be empty!")
//    @Email(message = "Email should be valid!")
    private String email;

    public User() {}

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
