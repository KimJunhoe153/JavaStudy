package Project;

import java.util.ArrayList;
import java.util.List;

public class Freeborad {
    String id;
    String title;
    String content;
    String loginId;

    static List<Reply> replies = new ArrayList<>();

    public Freeborad() {
    }

    public Freeborad(String id, String title,
                     String content, String loginId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.loginId = loginId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public static List<Reply> getReplies() {
        return replies;
    }

    public static void setReplies(List<Reply> replies) {
        Freeborad.replies = replies;
    }
}
