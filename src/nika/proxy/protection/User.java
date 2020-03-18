package nika.proxy.protection;

public class User {
    private UserRole role;

    public User(UserRole role) {
        this.role = role;
    }

    public UserRole getRole() {
        return role;
    }
}
