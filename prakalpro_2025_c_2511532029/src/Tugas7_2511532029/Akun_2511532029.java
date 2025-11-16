package Tugas7_2511532029;
public class Akun_2511532029 {
    
    private String username;
    private String password;
    private String email;
    private int pinAngka;
    
    
    public Akun_2511532029(String username, String password, String email, int pinAngka) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.pinAngka = pinAngka;
    }
    
 
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
    
    public int getPinAngka() {
        return pinAngka;
    }
    
    public void setPinAngka(int pinAngka) {
        this.pinAngka = pinAngka;
    }
    
 
    public boolean isPasswordValid() {
        return password != null && password.length() >= 8;
    }
    

    public boolean isEmailValid() {
        return email != null && email.contains("@") && email.contains(".");
    }
    

    public String getIdPengguna() {
        return username + password;
    }
}