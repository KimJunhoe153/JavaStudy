package Study20240328;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teacher {
    private String name;
    private String teacherId;
    private String department;

    public Teacher() {
    }

    // 생성자
    public Teacher(String name, String teacherId, String department) {
        this.name = name;
        this.teacherId = teacherId;
        this.department = department;
    }

    // Getter, Setter 메서드들
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

// LectureTeacher 클래스 정의
class LectureTeacher {
    private String lectureId;
    private String teacherId;

    // 생성자

    public LectureTeacher() {
    }

    public LectureTeacher(String lectureId, String teacherId) {
        this.lectureId = lectureId;
        this.teacherId = teacherId;
    }

    public String getLectureId() {
        return lectureId;
    }

    public void setLectureId(String lectureId) {
        this.lectureId = lectureId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}

// 메서드 구현을 위한 클래스
class ManagemaentSystem {
    private Map<String, Teacher> teacher = new HashMap<>();
    private Map<String, List<LectureTeacher>> lectureTeachers = new HashMap<>();
    public ManagemaentSystem() {

    }

    // 특정 과목ID로 해당 과목을 가르치는 teacher의 이름을 출력
    public String getTeacherByLectureId(String lectureId) {
        if (lectureTeachers.containsKey(lectureId)) {
            for (LectureTeacher lt : lectureTeachers.get(lectureId)) {
                if (teacher.containsKey(lt.getTeacherId())) {
                    return teacher.get(lt.getTeacherId()).getName();
                }
            }
        }
        return "Not Found";
    }

    // 특정 teacher가 가르치는 과목명 리스트 출력
    public List<String> getLectureTitleListByTeacherId(String teacherId) {
        List<String> lectureTitles = new ArrayList<>();
        lectureTeachers.values().forEach(list -> list.stream()
                .filter(lt -> lt.getTeacherId().equals(teacherId))
                .forEach(lt -> lectureTitles.add(lt.getLectureId())));
        return lectureTitles;
    }

    public static void main(String[] args) {
        ManagemaentSystem ms = new ManagemaentSystem();

    }
}