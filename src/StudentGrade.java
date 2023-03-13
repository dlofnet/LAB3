import javax.swing.JOptionPane;

public class StudentGrade {
    public static void main(String[] args) throws Exception {

        // String name = ":Syng Kong Kwang";
        // String program = ":BS Astronaut Subject";
        // String course = ":IT101-2";

        // String dummyNum = ":00.00";

        // String pOrF = ":PASSED";

        String name = ":" + JOptionPane.showInputDialog(null, "Student name: ");
        String program = ":" + JOptionPane.showInputDialog(null, "program: ");
        String course = ":" + JOptionPane.showInputDialog(null, "course: ");

        float first = Float.valueOf(JOptionPane.showInputDialog(null, "First exam grade: "));
        float second = Float.valueOf(JOptionPane.showInputDialog(null, "Second exam grade: "));
        float third = Float.valueOf(JOptionPane.showInputDialog(null, "Third exam grade: "));
        float fourth = Float.valueOf(JOptionPane.showInputDialog(null, "Fourth exam grade: "));

        String remarks = ":PASSED";

        float gradeAve = (first + second + third + fourth) / 4;

        if (gradeAve < 75) {
            remarks = ":FAILED";
        }

        System.out.printf("%20s", name);

        JOptionPane.showMessageDialog(null, 
        String.format("Student name %20s", name) + "\n" +
        String.format("Program %35s", program) + "\n" +
        String.format("Course %24s", course) + "\n\n" +
        "Please input the grade for the following examinations: \n\n" +
        String.format("First %20s", ":" + first) + "\n" +
        String.format("Second %15s", ":" + second) + "\n" +
        String.format("Third %19s", ":" + third) + "\n" +
        String.format("Fourth %17s", ":" + fourth) + "\n" +
        "---------------------------------------" + "\n" +
        String.format("Student name %20s", name) + "\n" +
        String.format("Program %35s", program) + "\n" +
        String.format("Course %24s", course) + "\n\n" +
        "1st        2nd        3rd        4th" + "\n" +
        String.format(first + "%10s%10s%10s", second, third, fourth) + "\n\n" +
        String.format("Average%20s", ":" + gradeAve) + "\n" +
        String.format("Remarks%20s", remarks) + "\n" +
        "----------------------------------------");

    }
}
