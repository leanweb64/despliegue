package com.example.despliegue.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mensaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String msgFor;
    private String title;
    private String msg;
    private String msgFrom;

    public Mensaje() {
    }

    public Mensaje(Long id, String msgFor, String title, String msg, String msgFrom) {
        this.id = id;
        this.msgFor = msgFor;
        this.title = title;
        this.msg = msg;
        this.msgFrom = msgFrom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsgFor() {
        return msgFor;
    }

    public void setMsgFor(String msgFor) {
        this.msgFor = msgFor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsgFrom() {
        return msgFrom;
    }

    public void setMsgFrom(String msgFrom) {
        this.msgFrom = msgFrom;
    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "id=" + id +
                ", msgFor='" + msgFor + '\'' +
                ", title='" + title + '\'' +
                ", msg='" + msg + '\'' +
                ", msgFrom='" + msgFrom + '\'' +
                '}';
    }
}
