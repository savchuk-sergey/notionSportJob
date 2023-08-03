package ru.ssavchuk.notionSportJob.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Entity
@Table(name = "exercise")
public class Exercise {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "exercise_set_id", nullable = false)
    private String exerciseSetId;
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_update_datetime", nullable = false)
    @CreationTimestamp
    private Date lastUpdateDatetime;

    public long getId() {
        return id;
    }

    public String getExerciseSetId() {
        return exerciseSetId;
    }

    public void setExerciseSetId(String exerciseSetId) {
        this.exerciseSetId = exerciseSetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastUpdateDatetime() {
        return lastUpdateDatetime;
    }

    public void setLastUpdateDatetime(Date lastUpdateDatetime) {
        this.lastUpdateDatetime = new Date(System.currentTimeMillis());
    }
}
