public class Person {

    private String name;
    private int age;
    private String email;
    private Boolean isStudent = false;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public Boolean getIsStudent() {
        return isStudent;
    }
    public void setIsStudent(Boolean isStudent) {
        this.isStudent = isStudent;
    }
    @Override
    public int hashCode() {
        return 31 * name.hashCode() + email.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person other = (Person) obj;
        return this.name.equals(other.name) && this.email.equals(other.email);
    }
}

