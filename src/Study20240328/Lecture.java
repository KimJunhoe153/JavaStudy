package Study20240328;

public class Lecture {
    private int lectureId;
    private String title;
    private int duration;
    private String category;
    private String difficulty;

    public Lecture() {
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCategory() {
        return category;
    }

    public Lecture(int lectureId, String title, int duration, String category, String difficulty) {
        this.lectureId = lectureId;
        this.title = title;
        this.duration = duration;
        this.category = category;
        this.difficulty = difficulty;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return lectureId + " / " + title + " / " + category + " / " + difficulty + " / " + duration + "분";
    }
}
