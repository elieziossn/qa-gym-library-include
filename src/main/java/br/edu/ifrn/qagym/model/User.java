package br.edu.ifrn.qagym.model;

public class User {

    private String registration;
    private String name;
    private boolean active;

    public User(String registration, String name) {
        this.registration = registration;
        this.name = name;
        this.active = true;
    }

    public String getRegistration() {
        return registration;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return name + " [" + registration + "]";
    }
}
