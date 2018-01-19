package nl.jtosti.mounteam;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by joost on 18-1-18.
 */

public class CourseAdapter extends ArrayAdapter<Course>{
    private ArrayList<Course> courses;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView courseName;
        ImageView courseIcon;
        LinearLayout courseLayout;
    }

    public CourseAdapter(ArrayList<Course> data, Context context) {
        super(context, R.layout.list_source, data);
        this.courses = data;
        this.mContext=context;

    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        final Course course = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_source, parent, false);
            viewHolder.courseName = (TextView) convertView.findViewById(R.id.course_name);
            viewHolder.courseIcon = (ImageView) convertView.findViewById(R.id.course_icon);
            viewHolder.courseLayout = (LinearLayout) convertView.findViewById(R.id.course_item);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.courseIcon.setImageResource(course.getIcon());
        viewHolder.courseName.setText(course.getName());
        viewHolder.courseLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gson gson = new Gson();
                Intent intent = new Intent(mContext, ActivityCourse.class);
                intent.putExtra("course", gson.toJson(course));
                mContext.startActivity(intent);
            }
        });
        // Return the completed view to render on screen
        return convertView;
    }

    @Override
    public boolean isEnabled(int position) {
        return true;
    }
}
