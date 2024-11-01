public class GradeBookTest {
    public static void main(String[] args) {
        final int NUMBER_OF_STUDENTS = 3;
        Student[] students = new Student[NUMBER_OF_STUDENTS];
        students[0] = new Student("A111223020", "何思嫻");
        students[1] = new Student("A111223020", "周宥萱");
        students[2] = new Student("A111223020", "胡碩成");
        GradeBook gradeBook = new GradeBook("Java程式設計", students, NUMBER_OF_STUDENTS);
        gradeBook.processStudentsGrades();
        gradeBook.displayGradeReport();
    }
}
