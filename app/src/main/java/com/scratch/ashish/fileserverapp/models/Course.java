package com.scratch.ashish.fileserverapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashish on 31/10/16.
 */
public class Course {
    @SerializedName("course_name")
    @Expose
    private String courseName;
    @SerializedName("years")
    @Expose
    private List<Year> years = new ArrayList<Year>();

    /**
     *
     * @return
     * The courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     *
     * @param courseName
     * The course_name
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     *
     * @return
     * The years
     */
    public List<Year> getYears() {
        return years;
    }

    /**
     *
     * @param years
     * The years
     */
    public void setYears(List<Year> years) {
        this.years = years;
    }
    @Override
    public String toString() {
        return courseName;
    }
}
