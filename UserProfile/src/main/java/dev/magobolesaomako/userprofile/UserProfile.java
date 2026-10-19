package dev.magobolesaomako.userprofile;

public class UserProfile {
    private String username;
    private int age;
    private String email;
    private String country;

    //Constructor
    public UserProfile(String username, int age, String email, String country){
        this.username = username;
        this.age = age;
        this.email = email;
        this.country = country;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }
}
