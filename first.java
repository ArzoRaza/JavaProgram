public class first {
    public static void main(String[] args)
    {
        int testScore = 70;
        String  gradeplus;

        if (testScore >= 60) {
            gradeplus = "1st Position";
        }
        else if (testScore >= 50) {
            gradeplus = "2nd Position";
        }
        else if (testScore >= 40) {
            gradeplus = " 3rd Position";
        }
        else {
            gradeplus = "Results not found";
        }
        System.out.println(gradeplus);
    }
}