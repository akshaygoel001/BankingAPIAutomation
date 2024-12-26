package com.api.models.request;

public class SignUpRequest {

    private String username ;
    private String password;
    private String email ;
    private String firstName;
    private String lastName;
    private String mobileNumber;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public SignUpRequest(String username, String password, String email, String firstName, String lastName, String mobileNumber) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "SignUpRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNumber=" + mobileNumber +
                '}';
    }

    public static class Builder{
        private String username ;
        private String password;
        private String email ;
        private String firstName;
        private String lastName;
        private String mobileNumber;

        public Builder userName(String username){
            this.username=username;
            return this;
        }
        public Builder passWord(String password){
            this.password=password;
            return this;
        }
        public Builder email(String email){
            this.email=email;
            return this;
        }
        public Builder firstname(String firstname){
            this.firstName=firstname;
            return this;
        }
        public Builder lastname(String lastname){
            this.lastName=lastname;
            return this;
        }
        public Builder mobilenumber(String mobilenumber){
            this.mobileNumber=mobilenumber;
            return this;
        }
        public SignUpRequest build(){
            SignUpRequest signUpRequest = new SignUpRequest(username,password,email,firstName,lastName,mobileNumber);
            return signUpRequest;
        }


    }
}
