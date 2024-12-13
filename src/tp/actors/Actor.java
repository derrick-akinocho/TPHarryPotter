package tp.actors;

import java.time.LocalDate;

public class Actor {

    private String fullName;
    private LocalDate birthDate;
    private String role;

    public Actor(String fullName, LocalDate birthDate, String role) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.role = role;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", role='" + role + '\'' +
                '}';
    }
}
