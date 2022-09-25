package mo.atef.amit.daythree.daysix_listviews.model;

import android.graphics.drawable.Drawable;

public class CourseModel {
    String CourseName;
    Drawable ImageId;

    public CourseModel(String courseName, Drawable imageId) {
        CourseName = courseName;
        ImageId = imageId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public Drawable getImageId() {
        return ImageId;
    }

    public void setImageId(Drawable imageId) {
        ImageId = imageId;
    }
}
