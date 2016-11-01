package com.scratch.ashish.fileserverapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashish on 31/10/16.
 */
public class Subject {
    @SerializedName("subject_name")
    @Expose
    private String subjectName;
    @SerializedName("subject_id")
    @Expose
    private String subjectId;
    @SerializedName("files")
    @Expose
    private List<File> files = new ArrayList<File>();

    /**
     *
     * @return
     * The subjectName
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     *
     * @param subjectName
     * The subject_name
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    /**
     *
     * @return
     * The files
     */
    public List<File> getFiles() {
        return files;
    }

    /**
     *
     * @param files
     * The files
     */
    public void setFiles(List<File> files) {
        this.files = files;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public String toString() {
        return subjectName;
    }
}
