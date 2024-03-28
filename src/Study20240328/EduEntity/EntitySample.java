package Study20240328.EduEntity;

public class EntitySample {
    class User { // 플랫폼을 사용하는 모든 개인
        private String name;
        //        private String nickName;
        private String email;
        private String passWord;
        private String category;
    }

    class Course { // 학습할 주제 또는 교육 프로그램
        private String courseID;
        private String courseName;
        private String explanation;
        private String group;
        private String startDate;
        private String endDate;
        private String professorID;
    }

    class Lecture { // 과정 내의 개별 학습 단원 또는 세션
        private String lectureID;
        private String courseID;
        private String lectureName;
        private String explanation;
        private String videoURL;
        private String duration;
    }

    class Assignment { // 학생들이 수행해야 할 과제나 프로젝트
        private String assignmentID;
        private String courseID;
        private String explanation;
        private int submissionDeadline;
        private int maximumScore;
    }

    class Quiz { // 학생들의 이해도를 평가하기 위한 질문들의 집합
        private String quizID;
        private String courseID;
        private String quizName;
        private String explanation;
        private int startDate;
        private int endDate;
    }

    class QnA { // 학생들이 강의에 대해 질문하고 교수나 다른 학생들이 답변할 수 있는 공간
        private String userID;
        private String courseID;
        private String question;
        private String answer;
        private int creationTime;
    }

    class Announcement { // 과정 관련 중요한 정보나 업데이트를 공유하기 위한 수단
        private String notificationID;
        private String courseID;
        private String title;
        private String contents;
        private int publishedDate;
    }

    class Resource { // 과정을 수행하는 데 필요한 추가 학습 자료들(예: PDF, PPT, 외부 링크)
        private String resourceID;
        private String courseID;
        private String resourceName;
        private String explanation;
        private String fileURL;
    }

    class Evaluation { // 과제나 퀴즈에 대한 학생의 성적과 교수의 피드백
        private String evaluationID;
        private String homeworkID;
        private String quizID;
        private String userID;
        private int score;
        private String feedback;
    }

    class UserProgress { // 학생이 과정에서 어느 정도 진행되었는지 나타내는 정보
        private String progressID;
        private String userID;
        private String courseID;
        private String progress;
        private String completedLectures;
        private String completedQuiz;
    }
}
