public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", 
            "012-345-6789", "somsak@mymail.com");
        person.renderPersonT();
        person.renderPerson();
        System.out.println(person);
        System.out.println();

        Student student = new Student("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", 
            "012-345-6789", "somsak@mymail.com",1);
        student.renderStudent();
        student.renderPerson();
        System.out.println(student);
        System.out.println();

        Employee employee = new Employee("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", 
            "012-345-6789", "somsak@mymail.com", "office",25000,"date");
        employee.renderEmployee();
        employee.renderPerson();
        System.out.println(employee);
        System.out.println();

        Faculty faculty = new Faculty("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520"
            , "012-345-6789", "somsak@mymail.com","office",25000,"date", 9,"rank");
        faculty.renderFaculty();
        faculty.renderPerson();
        System.out.println(faculty);
        System.out.println();

        Staff staff = new Staff("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", 
            "012-345-6789", "somsak@mymail.com", "office",25000,"date","title");
        staff.renderStaff();
        staff.renderPerson();
        System.out.println(staff);
        System.out.println();
    }
}

