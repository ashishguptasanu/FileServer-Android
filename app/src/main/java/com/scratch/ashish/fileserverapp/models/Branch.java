package com.scratch.ashish.fileserverapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashish on 31/10/16.
 */

public class Branch {

    @SerializedName("branch_name")
    @Expose
    private String branchName;
    @SerializedName("courses")
    @Expose
    private List<Course> courses = new ArrayList<Course>();

    /**
     *
     * @return
     * The branchName
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     *
     * @param branchName
     * The branch_name
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     *
     * @return
     * The courses
     */
    public List<Course> getCourses() {
        return courses;
    }

    /**
     *
     * @param courses
     * The courses
     */
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return branchName;
    }
}
