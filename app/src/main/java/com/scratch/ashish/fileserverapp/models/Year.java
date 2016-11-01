package com.scratch.ashish.fileserverapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ashish on 31/10/16.
 */
public class Year {
    @SerializedName("year_name")
    @Expose
    private String yearName;
    @SerializedName("subjects")
    @Expose
    private List<Subject> subjects = new ArrayList<Subject>();

    /**
     *
     * @return
     * The yearName
     */
    public String getYearName() {
        return yearName;
    }

    /**
     *
     * @param yearName
     * The year_name
     */
    public void setYearName(String yearName) {
        this.yearName = yearName;
    }

    /**
     *
     * @return
     * The subjects
     */
    public List<Subject> getSubjects() {
        return subjects;
    }

    /**
     *
     * @param subjects
     * The subjects
     */
    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
    @Override
    public String toString() {
        return yearName;
    }
}
