package com.hedgefunds.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Event {
    
    private Long id;
    private String title;
    private Date date;

    private Event(String title, Date date) {
        this.title = title;
        this.date = date;
    }

    @Id
    @GeneratedValue
    private Long getId() {
        return id;
    }

    @Column(name = "event_title")
    public String getTitle() {
        return title;
    }

    @Temporal(value = TemporalType.DATE)
    public Date getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static Event getEvent(String event1, Date date) {
        return new Event(event1, date);  //To change body of created methods use File | Settings | File Templates.
    }
}
