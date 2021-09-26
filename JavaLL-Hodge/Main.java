public class Main {
    public static void main(String[] args){
        studentProfile profileOne = new studentProfile("Niraj","Kandpal",2020,
                10, "Physics", 2023);
        studentProfile profileTwo = new studentProfile("Vivek","lohani",2019,10,
                "Physics",2022);

        profileTwo.incrementExpectedGraduationyear();
        System.out.println(profileTwo.expectedYearToGraduate);


    }
}
