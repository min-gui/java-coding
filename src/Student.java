public class Student {

    private String studentId;
    private String studentNm;
    private int score;

    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentNm() {
        return studentNm;
    }
    public void setStudentNm(String studentNm) {
        this.studentNm = studentNm;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    // 빈 생성자
    public Student() {

    }

    public Student(int score, String studentNm) {
        super();
        this.score = score;
        this.studentNm = studentNm;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentNm=" + studentNm + ", score=" + score + "]";
    }

}
