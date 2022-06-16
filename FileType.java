package com.insigma.File;

public enum FileType {
    TS(".ts"),
    JPG(".jpg"),
    TXT(".txt");

    private FileType(String type){
        this.FILETYPE = type;
    }


    public String getFILETYPE() {
        return FILETYPE;
    }

    public void setFILETYPE(String FILETYPE) {
        this.FILETYPE = FILETYPE;
    }

    private String FILETYPE;
}
