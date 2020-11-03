package com.example.gmail;

import java.util.ArrayList;
import java.util.List;

public class EmailItem {
    private  int avatar = R.drawable.thumb1;
    private String sender;
    private String brief;
    private String date;
    private boolean isImportant = false;

    public EmailItem(String sender, String brief, String date) {
        this.sender = sender;
        this.brief = brief;
        this.date = date;
    }

    public int getAvatar() {
        return avatar;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    public static List<EmailItem> samples(){
        // Creating a list
        List<EmailItem> emails
                = new ArrayList<EmailItem>();
        for (int i = 1; i <= 100; i++){
            emails.add(new EmailItem("User "+i, "Content "+i+": Using TextView to show content ", "12:00 PM"));
        }

        return emails;
    }
}
