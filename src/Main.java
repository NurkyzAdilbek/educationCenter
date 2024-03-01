import java.time.LocalDate;
import java.time.Period;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Educationcenter university= new University("TU Berlin", "Berlin",LocalDate.of(1894,2,3));
        Educationcenter school=new School("A.B","Frankfurt",LocalDate.of(2023,2,3));
        Educationcenter collage=new College("Studienkolleg TU", "Darmstadt",LocalDate.of(1832,4,3));


       Student student=new Student("Nurkyz","ADilbekova","Fem", LocalDate.of(2002,2,6), university);
        Student student1=new Student("Tumar","Toktorbaeva","Fem", LocalDate.of(2023,2,6), collage);
        Student student2=new Student("Luiza","Turgumbekova","Fem", LocalDate.of(2012,2,6),school);
        Student student3=new Student("Finn","kaKFJ","Fem", LocalDate.of(2003,2,6),university);
        Student student4=new Student("Thao","AFxcv","Fem", LocalDate.of(2021,2,6),collage);
        Student student5=new Student("Bogdan","Alex","Mask", LocalDate.of(2013,2,6),university);
        Student student6=new Student("Steffi","AFADF","Fem", LocalDate.of(2004,2,6),school);
        Student student7=new Student("Mehrahen","Alambegi","Fem", LocalDate.of(2007,2,6),school);
        Student student8=new Student("Rogrigo","Marsell","Mask", LocalDate.of(2015,2,6),collage);
        Student student9=new Student("Maximilian","ASD","Fem", LocalDate.of(2002,2,6),university);

        Student []students={student,student1,student2,student3,student4,student5,student6,student7,student8,student9};

    getInfo(students);


    }

    public static void getInfo(Student[]students){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
            System.out.println(" Seit  "+Period.between(students[i].getDateOfStart(),LocalDate.now()).getYears() +" jahren studiert");

        }}

        public static void getUni(Student[]students){
            for (int i = 0; i < students.length; i++) {
                System.out.println(Period.between(students[i].getDateOfStart(),LocalDate.now()).getYears());

            }}

    }