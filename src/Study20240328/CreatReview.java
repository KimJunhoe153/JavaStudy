package Study20240328;

public class CreatReview {
    public boolean creatReview(String userId, int lectureId, int rating, String text) {

        // 2-1)
        if (rating < 1 || rating > 10) {
            return false;
        }

        // 2-2)
        for (Review review : reviews) {
            if (review.getLoginId().equals(userId) && review.getLectureId() == lectureId) {
                return false;
            }
        }

        
    }
}
