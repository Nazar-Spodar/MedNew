package com.example.mednew.dto;

public class UserDto {
    private Long id;
    private String name;
    private Boolean isAdult;
    private String email;
    private String password;
    private Integer age;


    public UserDto(Long id, String name, Boolean isAdult, String email, String password, Integer age) {
        this.id = id;
        this.name = name;
        this.isAdult = isAdult;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public UserDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAdult() {
        return isAdult;
    }

    public void setAdult(Boolean adult) {
        isAdult = adult;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isAdult=" + isAdult +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
