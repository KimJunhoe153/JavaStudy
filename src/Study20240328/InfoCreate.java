package Study20240328;

import java.time.LocalDate;
import java.util.ArrayList;

public class InfoCreate {
    public static void infoCreates() {
        Main.users = new ArrayList<User>();
        User user1 = new User("Steve", "hero11", "pass",
                LocalDate.of(1999, 1, 1), "steve@email.com");
        Main.users.add(user1);
        User user2 = new User("Tom", "tommy", "12345",
                LocalDate.of(2001, 2, 5), "tom@email.com");
        Main.users.add(user2);
        User user3 = new User("Susie", "sue", "qwe!@",
                LocalDate.of(1988, 5, 12), "susie@email.com");
        Main.users.add(user3);
        User user4 = new User("Laura", "nice", "234785923",
                LocalDate.of(2004, 11, 11), "laura@email.com");
        Main.users.add(user4);
        User user5 = new User("Emily", "goodlife", "fashdkeuh",
                LocalDate.of(2001, 3, 23), "emily@email.com");
        Main.users.add(user5);

        Main.lectures = new ArrayList<>();
        Lecture lecture1 = new Lecture(1, "Java", 100, "Programming", "beginner");
        Main.lectures.add(lecture1);
        Lecture lecture2 = new Lecture(2, "Spring", 150, "Programming", "intermediate");
        Main.lectures.add(lecture2);
        Lecture lecture3 = new Lecture(3, "Javascript", 80, "Programming", "beginner");
        Main.lectures.add(lecture3);

        Main.lectureRegistrations = new ArrayList<>();
        LectureRegistration lectureRegistration1 = new LectureRegistration("hero11", 1);
        Main.lectureRegistrations.add(new LectureRegistration("hero11", 1));
        LectureRegistration lectureRegistration2 = new LectureRegistration("tommy", 2);
        Main.lectureRegistrations.add(new LectureRegistration("tommy", 2));
        LectureRegistration lectureRegistration3 = new LectureRegistration("sue", 1);
        Main.lectureRegistrations.add(new LectureRegistration("sue", 3));
        LectureRegistration lectureRegistration4 = new LectureRegistration("nice", 3);
        Main.lectureRegistrations.add(new LectureRegistration("nice", 2));
        LectureRegistration lectureRegistration5 = new LectureRegistration("goodlife", 1);
        Main.lectureRegistrations.add(new LectureRegistration("goodlife", 1));
    }
}
