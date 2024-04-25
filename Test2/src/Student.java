public class Student extends Person{

    public Student(String name, int age, String email) throws TooOldException{
        super(name, age, email);
        try {
            if (age > 25) {
                throw new TooOldException("You are too old to be a student");
            } else {
                setIsStudent(true);
            }
        } catch (TooOldException e) {
            e.printStackTrace();
        }
    }
}
