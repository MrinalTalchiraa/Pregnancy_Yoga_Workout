package com.pragnancy_yoga.pragnancy_yoga_files.database;

public class HistroyHelper {
    String date;
    String id;

    public HistroyHelper(String str, String str2) {
        this.id = str;
        this.date = str2;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }
}
