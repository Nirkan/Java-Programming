public class studentProfile {
    String firstName;
    String lastName;
    double graduationYear;
    double GPA;
    String declaredMajor;
    int expectedYearToGraduate;

    public studentProfile(String firstName, String LastName, double GraduationYear,
                          double GPA, String declaredMajor, int expectedYearToGraduate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
        this.expectedYearToGraduate = expectedYearToGraduate;
    }

    public void incrementExpectedGraduationyear(){
            this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
    }
}
