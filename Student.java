public class Student {
    private int id;
    private String schoolName;
    private double tenthGrade;
    private String aadharCardNumber;

    public Student(int id, String schoolName, double tenthGrade, String aadharCardNumber) {
        this.id = id;
        this.schoolName = schoolName;
        this.tenthGrade = tenthGrade;
        this.aadharCardNumber = aadharCardNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", schoolName='" + schoolName + '\'' +
                ", tenthGrade=" + tenthGrade +
                ", aadharCardNumber='" + aadharCardNumber + '\'' +
                '}';
    }
}
