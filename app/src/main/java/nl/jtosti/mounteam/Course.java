package nl.jtosti.mounteam;


import java.util.ArrayList;

/**
 * Created by joost on 18-1-18.
 */

public class Course {
    private String purpose;
    private ArrayList<String> preRequirements;
    private ArrayList<String> tips;
    private ArrayList<Step> steps;
    private Boolean solved;
    private String notes;
    private int icon;
    private String name;

    public Course(String purpose, ArrayList<String> preRequirements, ArrayList<String> tips, ArrayList<Step> steps, Boolean solved, String notes, int icon, String name) {
        this.purpose = purpose;
        this.preRequirements = preRequirements;
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

    public ArrayList<String> getPreRequirements() {
        return preRequirements;
    }

    public void setPreRequirements(ArrayList<String> preRequirements) {
        this.preRequirements = preRequirements;
    }

    public void addPreRequirement(String preRequirements) {
        this.preRequirements.add(preRequirements);
    }

    public ArrayList<String> getTips() {
        return tips;
    }

    public void setTips(ArrayList<String> tips) {
        this.tips = tips;
    }

    public void addTip(String tip) {
        this.tips.add(tip);
    }

    public ArrayList<Step> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<Step> steps) {
        this.steps = steps;
    }

    public void addStep(Step step) {
        this.steps.add(step);
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
