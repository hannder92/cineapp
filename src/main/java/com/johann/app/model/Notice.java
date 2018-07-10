
package com.johann.app.model;

import java.util.Date;

public class Notice {

    private int id;
    private String title;
    private Date noticeDate;
    private String detail;
    private String status;

    public Notice() {
        super();
        this.noticeDate = new Date();
        this.status = "Active";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Notice [id=" + id + ", title=" + title + ", noticeDate=" + noticeDate + ", detail="
                + detail + ", status=" + status + "]";
    }

}
