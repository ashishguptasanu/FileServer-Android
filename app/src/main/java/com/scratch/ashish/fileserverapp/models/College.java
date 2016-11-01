package com.scratch.ashish.fileserverapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashish on 31/10/16.
 */

public class College {
    @SerializedName("college_name")
    @Expose
    private String collegeName;
    @SerializedName("branches")
    @Expose
    private List<Branch> branches = new ArrayList<Branch>();

    /**
     *
     * @return
     * The collegeName
     */
    public String getCollegeName() {
        return collegeName;
    }

    /**
     *
     * @param collegeName
     * The college_name
     */
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    /**
     *
     * @return
     * The branches
     */
    public List<Branch> getBranches() {
        return branches;
    }

    /**
     *
     * @param branches
     * The branches
     */
    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    @Override
    public String toString() {
        return collegeName;
    }
}
