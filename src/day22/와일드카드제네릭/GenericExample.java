package day22.와일드카드제네릭;

public class GenericExample {
    public static void main(String[] args) {
        //모든 사람 신청 가능

        /*
         Person person = new Person();
         Applicant<Person> applicant = new Applicant<>(person);
         Course.registerCourse1(applicant);
         */


        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        //학생만 신청 가능
//        Course.registerCourse2(new Applicant<Person>(new Person()));  불가
//        Course.registerCourse2(new Applicant<Worker>(new Worker()));  불가
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        //직장인만 신청 가능
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
//        Course.registerCourse3(new Applicant<Student>(new Student()));                불가
//        Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));        불가
//        Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));    불가
    }
}
