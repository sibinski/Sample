public class Example {
    public void setName(String name) {
        Name = "Jevgeni Sibinski";
    }

    public void setGrade(int grade) {
        Grade = 100;
    }

    public void setSubject(String subject) {
        Subject = "Math";
    }

    public String Name = "";
    public int Grade = 0;
    public String Subject = "";

    public Example() {
        Name = "Alexandra Shibinskaya";
        Grade = 4;
        Subject = "Russian literature";
    }

    @Override
    public String toString() {
        return "Name='" + Name + '\'' +
                ", Grade=" + Grade +
                ", Subject='" + Subject + '\'' +
                '}';
    }


}
