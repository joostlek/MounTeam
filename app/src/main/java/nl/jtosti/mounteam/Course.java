package nl.jtosti.mounteam;

import android.graphics.drawable.Icon;

/**
 * Created by joost on 18-1-18.
 */

public class Course {
    private String purpose;
    private String[] preRequires;
    private String[] tips;
    private Step[] steps;
    private Boolean solved;
    private String notes;
    private int icon;
    private String name;

    public Course(String purpose, String[] preRequires, String[] tips, Step[] steps, Boolean solved, String notes, int icon, String name) {
        this.purpose = purpose;
        this.preRequires = preRequires;
        this.tips = tips;
        this.steps = steps;
        this.solved = solved;
        this.notes = notes;
        this.icon = icon;
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String[] getPreRequires() {
        return preRequires;
    }

    public void setPreRequires(String[] preRequires) {
        this.preRequires = preRequires;
    }

    public String[] getTips() {
        return tips;
    }

    public void setTips(String[] tips) {
        this.tips = tips;
    }

    public Step[] getSteps() {
        return steps;
    }

    public void setSteps(Step[] steps) {
        this.steps = steps;
    }

    public Boolean getSolved() {
        return solved;
    }

    public void setSolved(Boolean solved) {
        this.solved = solved;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
