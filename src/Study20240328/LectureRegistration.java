package Study20240328;

public class LectureRegistration {
    String loginId;
    int lectureId;

    public LectureRegistration() {
    }

    public LectureRegistration(String userId, int lectureId) {
        this.loginId = loginId;
        this.lectureId = lectureId;
    }

    public String loginId() {
        return loginId;
    }

    public void getLoginId(String loginId) {
        this.loginId = loginId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }
}
