public class Student {
    private String name;
    private String surname;
    private String id;
    private float grade;

    /*
     * Creates a new student with the given name, surname, id and grade.
     * @param name The name of the student.
     * @param surname The surname of the student.
     * @param id The id of the student.
     * @param grade The grade of the student.
     */
    public Student(String name, String surname, String id, float grade) {
        // TODO: Implement this method.
        this.name=name;
        this.surname=surname;
        this.id=id;
        this.grade=grade;
    }

    public Student(){
    }

    public void setGrade(float grade){
        // TODO: Implement this method.
        this.grade=grade;
    }

    public float getGrade() {
        // TODO: Implement this method.
        return this.grade;
    }

    public String getName() {
        // TODO: Implement this method.
        return this.name;
    }

    public void setName(String name) {
        // TODO: Implement this method.
        this.name=name;
    }

    public String getSurname() {
        // TODO: Implement this method.
        return this.surname;
    }

    public void setSurname(String surname) {
        // TODO: Implement this method.
        this.surname=surname;
    }

    public String getId() {
        // TODO: Implement this method.
        return this.id;
    }

    public void setId(String id) {
        // TODO: Implement this method.
        this.id=id;
    }
}