package com.scratch.ashish.fileserverapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ashish on 31/10/16.
 */
public class File {

    @SerializedName("file_name")
    @Expose
    private String fileName;
    @SerializedName("file_type")
    @Expose
    private String fileType;

    @SerializedName("file_url")
    @Expose
    private String fileurl;


    /**
     *
     * @return
     * The fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     *
     * @param fileName
     * The file_name
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     *
     * @return
     * The fileType
     */
    public String getFileType() {
        return fileType;
    }

    /**
     *
     * @param fileType
     * The file_type
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }
}
