import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class StudentGrade {
    public static void main(String[] args) throws Exception {

        //FINAL INPUT CODE----------------------------------------------------------------------------
        String name = JOptionPane.showInputDialog(null, "Student name: ");
        String program = JOptionPane.showInputDialog(null, "program: ");
        String course = JOptionPane.showInputDialog(null, "course: ");

        float first = Float.valueOf(JOptionPane.showInputDialog(null, "First exam grade: "));
        float second = Float.valueOf(JOptionPane.showInputDialog(null, "Second exam grade: "));
        float third = Float.valueOf(JOptionPane.showInputDialog(null, "Third exam grade: "));
        float fourth = Float.valueOf(JOptionPane.showInputDialog(null, "Fourth exam grade: "));

        //DUMMY CODE---------------------------------------------------------------------------------
        // String name = "Syng Kong Kwang";
        // String program = "BS Astronaut Subject";
        // String course = "IT101-2";

        // float first = 99.87f;
        // float second = 98.79f;
        // float third = 99.99f;
        // float fourth = 100.00f;

        String remarks = "PASSED";

        float gradeAve = (first + second + third + fourth) / 4;

        if (gradeAve < 75) {
            remarks = "FAILED";
        }

        String hold = "Student's name\t:" + name + "\n";
        hold += "Program\t:" + program + "\n";
        hold += "Course \t:" + course + "\n\n";
        hold += "Please input the grade for the following examinations: \n\n";
        hold += "First\t:" + first + "\n";
        hold += "Second\t:" + second + "\n";
        hold += "Third\t:" + third + "\n";
        hold += "Fourth\t:" + fourth + "\n";
        hold += "---------------------------------------" + "\n";
        hold += "Student's name\t:" + name + "\n";
        hold += "Program\t:" + program + "\n";
        hold += "Course \t:" + course + "\n\n";
        hold += "1st\t2nd\t3rd\t4th\n";
        hold += first + "\t" + second + "\t" + third + "\t" + fourth + "\t\n\n";
        hold += "Average\t:" + gradeAve + "\n";
        hold += "Remarks\t:" + remarks + "\n";
        hold += "---------------------------------------";

        JOptionPane.showMessageDialog(null, new JTextArea(hold));

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Student.txt"));
            String student = "Name\t\t\t\tProgram\t\t\t\t\tCourse\t\tFirst\tSecond\tThird\tFourth\tAverage\t\tRemarks\n";
            student += name + "\t\t" + program + "\t" + course + "\t\t" + first + "\t" + second + "\t" + third + "\t" + fourth + "\t" + gradeAve + "\t\t" + remarks;
            writer.write(student);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
