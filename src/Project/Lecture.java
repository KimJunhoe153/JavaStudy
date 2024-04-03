package Project;

public class Lecture { // 유니크한 값을 만들어야 한다
    int lectureId;
    String title;
    String description;
    String lecturer;
    int duration;
    String difficulty;

    public Lecture() {
    }

    public Lecture(int lectureId, String title, String description,
                   String lecturer, int duration, String difficulty) {
        this.lectureId = lectureId;
        this.title = title;
        this.description = description;
        this.lecturer = lecturer;
        this.duration = duration;
        this.difficulty = difficulty;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
