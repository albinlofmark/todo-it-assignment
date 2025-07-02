package se.lofmark;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Person(int id, String firstName, String lastName, String email) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    // Setters

    public void setId(int id) {

        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID cannot be negative, 0 or empty");
        }
    }

    public void setFirstName(String firstName) {

        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be null or empty");
        }
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        this.email = email;
    }

    public String getSummary() {

        StringBuilder summary = new StringBuilder();

        summary.append("Person Info -> ID: ").append(id)
                .append(", First name: ").append(firstName)
                .append(", Last name: ").append(lastName)
                .append(", Email: ").append(email);

        return summary.toString();
    }


}
