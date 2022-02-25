public class App {
    public static void main(String[] args) throws Exception {
        Course course = new Course();
        course.add("A");
        course.add("B");
        course.add("C");
        course.remove("B");
        course.displayStudents();
    }
}
