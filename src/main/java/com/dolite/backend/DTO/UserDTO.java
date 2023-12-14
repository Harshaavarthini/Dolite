package com.dolite.backend.DTO;

public class UserDTO {

    private String username;
    private String email;
    private String password;

    private String gender;
    private String date;

    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getDate() {
        return date;
    }
}
