package Study20240328;

public enum LectureCatrgory {
    PROGRAMMING,
    MODELING3D,
    PAINTING,
    TEXTURING,
    SOUND,
    VISUAL_EFFECT;

    public static LectureCatrgory fromString(String text) {
        //for (LectureCategory category : LectureCategory.values()) {
        LectureCatrgory[] categories = LectureCatrgory.values();
        for (int i=0; i<categories.length; i++) {
            if (categories[i].name().equalsIgnoreCase(text)) {
                return categories[i];
            }
        }
        throw new IllegalArgumentException("No constant with name " + text + " found");
    }
}
