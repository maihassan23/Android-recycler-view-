package mo.atef.amit.daythree.daysix_listviews.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import mo.atef.amit.daythree.daysix_listviews.R;
import mo.atef.amit.daythree.daysix_listviews.model.CourseModel;

public class GridAdapter extends ArrayAdapter<CourseModel> {

    private final ArrayList<CourseModel> mCoursesList;
    private final Context mContext;

    public GridAdapter(Context context, ArrayList<CourseModel> courseModelArrayList){
        super(context,0,courseModelArrayList);
        this.mContext=context;
        this.mCoursesList=courseModelArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View gridItem=convertView;
        if(gridItem==null){
            gridItem = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }
        CourseModel course=mCoursesList.get(position);

        if (course!=null){
            ImageView imageView= gridItem.findViewById(R.id.courseImage);
            TextView name=gridItem.findViewById(R.id.tvCourseName);
            name.setText(course.getCourseName());
            Glide
                    .with(mContext)
                    .load(course.getImageId())
                    .centerCrop()
                    .into(imageView);
        }

        return gridItem;
    }
}
