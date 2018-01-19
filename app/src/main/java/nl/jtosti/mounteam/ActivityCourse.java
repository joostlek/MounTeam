package nl.jtosti.mounteam;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;

public class ActivityCourse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Gson gson = new Gson();
        final String courseJson = getIntent().getExtras().getString("course");
        Course course = gson.fromJson(courseJson, Course.class);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gson gson = new Gson();
                Intent intent = new Intent(ActivityCourse.this, ActivityOverview.class);
                intent.putExtra("course", courseJson);
                startActivity(intent);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView purposeHeader = (TextView) findViewById(R.id.purpose_header);
        TextView purposeText = (TextView) findViewById(R.id.purpose_text);
        TextView requirementsHeader = (TextView) findViewById(R.id.req_header);
//        ListView requirementsList = (ListView) findViewById(R.id.req_list);
        TextView tipsHeader = (TextView) findViewById(R.id.tips_header);
        TextView tipsText = (TextView) findViewById(R.id.tips_text);

//        if (course.getPreRequirements().size() > 0) {
//            for (int i = 1; i < course.getPreRequirements().size(); i++) {
//                RequirementAdapter requirementAdapter = new RequirementAdapter(this, , course.getPreRequirements());
//                requirementsList.setAdapter(requirementAdapter);
//            }
//        } else {
//            requirementsHeader.setVisibility(View.INVISIBLE);
//            requirementsList.setVisibility(View.INVISIBLE);
//        }
//        if (course.getTips().size() > 0) {
//            StringBuilder tips     = new StringBuilder();
//            for (int i = 1; i < course.getTips().size(); i++) {
//                tips.append(course.getTips().get(i)).append("\n");
//            }
//            tipsText.setText(tips.toString());
//        } else {
//            tipsText.setVisibility(View.INVISIBLE);
//            tipsHeader.setVisibility(View.INVISIBLE);
//        }
        purposeText.setText(course.getPurpose());
    }

}
