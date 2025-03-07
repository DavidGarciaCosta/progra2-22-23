public class Main {
    public static void main(String[] args) {
        // Is this the best way to do it?, What if I want to add more students?
        // Although I recommend not touching this code just make sure you understand it,
        // but you can do it if you want.

        // TODO: Create a new instance of the class "Subject" and add 5 students to it.

        Subject subject = new Subject("Math", 5);


        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        Student secondStudent = new Student("Jane", "Doe", "123457", 4.0f);
        Student thirdStudent = new Student("John", "Smith", "123458", 3.0f);

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);
        subject.addStudent(new Student("David", "Doe", "1237", 9.0f));
        subject.addStudent(new Student("Julian", "Sanchez", "157", 4.0f));


        System.out.println("The average grade is: " + subject.getAverageGrade());
        System.out.println("The best student is: " + subject.getBestStudent().getName());
        System.out.println("The worst student is: " + subject.getWorstStudent().getName());

    }
}
