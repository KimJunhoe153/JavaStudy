package Study20240328;

public class FreeBoard {
    private String id;
    private String title;
    private String content;
    private String loginId;

    public FreeBoard() {
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

    public FreeBoard(String id, String title, String content, String loginId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.loginId = loginId;
    }

    public static class Reply {
        private String id;
        private String title;
        private String content;
        private String loginId;
        private FreeBoard freeBoard;

        public Reply() {
        }

        public Reply(String s, String s1, String replyUser, String freeBoard) {
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

        public FreeBoard getFreeBoard() {
            return freeBoard;
        }

        public void setFreeBoard(FreeBoard freeBoard) {
            this.freeBoard = freeBoard;
        }

        public Reply(String id, String title, String content,
                     String loginId, FreeBoard freeBoard) {
            this.id = id;
            this.title = title;
            this.content = content;
            this.loginId = loginId;
            this.freeBoard = freeBoard;

        }
    }
}

