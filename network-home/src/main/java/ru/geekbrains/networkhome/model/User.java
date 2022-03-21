package ru.geekbrains.networkhome.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;

    private String password;

    private String firstName;

    private String lastName;

    private String nickname;

    private String email;

    public User() {
    }

    public Long getId() {
        return this.id;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private User newUser;

        public Builder(){
            this.newUser = new User();
        }

        public Builder login(String login){
            newUser.setLogin(login);
            return this;
        }

        public Builder password(String password){
            newUser.setPassword(password);
            return this;
        }

        public Builder firstName(String firstName){
            newUser.setFirstName(firstName);
            return this;
        }

        public Builder lastName(String lastName){
            newUser.setLastName(lastName);
            return this;
        }

        public Builder nickname(String nickname){
            newUser.setNickname(nickname);
            return this;
        }

        public Builder email(String email){
            newUser.setEmail(email);
            return  this;
        }

        public User build(){
            return newUser;
        }

    }


    public String toString() {
        return "User(id=" + this.getId() + ", login=" + this.getLogin() + ", password=" + this.getPassword() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", nickname=" + this.getNickname() + ", email=" + this.getEmail() + ")";
    }
}
