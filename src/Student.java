public class Student {
    private int rollNo;
    private String standard;
    private String name;
    private static String college;
    private static int nextRollNo;

    static {
        college = "Shri Shivaji Science and art's College";
    }

    public Student(String standard, String name) {
        this.rollNo = nextRollNo;
        nextRollNo++;
        this.standard = standard;
        this.name = name;
    }

    public Student() {
        rollNo = 0;
        name = " ";
        standard = " ";
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public static int getNextRollNo() {
        return nextRollNo;
    }

    public static void setNextRollNo(int nextRollNo) {
        Student.nextRollNo = nextRollNo;
    }

    public void display() {
        System.out.println(" roll No : " + rollNo + " name : " + name + " standard : " + standard + " College : " + college);
    }
}
