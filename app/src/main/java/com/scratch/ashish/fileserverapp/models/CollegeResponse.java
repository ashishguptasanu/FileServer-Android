package com.scratch.ashish.fileserverapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashish on 31/10/16.
 */

public class CollegeResponse {
    @SerializedName("colleges")
    @Expose
    private List<College> colleges = new ArrayList<College>();

    /**
     *
     * @return
     * The colleges
     */
    public List<College> getColleges() {
        return colleges;
    }

    /**
     *
     * @param colleges
     * The colleges
     */
    public void setColleges(List<College> colleges) {
        this.colleges = colleges;
    }
}
