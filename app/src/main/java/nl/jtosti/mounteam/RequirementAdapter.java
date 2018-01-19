package nl.jtosti.mounteam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;

import java.util.List;

/**
 * Created by joost on 19-1-18.
 */

public class RequirementAdapter extends ArrayAdapter<String> {
    public RequirementAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public RequirementAdapter(Context context, int resource, List<String> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.checklist, null);
        }

        String p = getItem(position);

        CheckBox checkbox = (CheckBox) convertView.findViewById(R.id.checkBox);
        checkbox.setText(p);

        return v;
    }

}
