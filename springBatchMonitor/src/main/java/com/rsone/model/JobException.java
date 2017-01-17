package com.rsone.model;

import javax.persistence.*;

/**
 * this entity encapsulate fired exceptions during batch running
 * Created by RSone on 16/01/2017.
 */
@Entity
@Table(name = "JOB_EXCEPTION")
public class JobException {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "JX_ID")
    private Long jobExcepId;

    @Column(name = "JX_MSG")
    private String jobExcepMsg;

    @Column(name = "JX_DETAIL")
    private String jobExcepDetail;

    @Column(name = "JX_LAST_TIME")
    private String jobExcepLastTime;

    @ManyToMany
    @JoinColumn(name = "JX_JOB_ID")
    private JobDetails job;

    public Long getJobExcepId() {
        return jobExcepId;
    }

    public void setJobExcepId(Long jobExcepId) {
        this.jobExcepId = jobExcepId;
    }

    public String getJobExcepMsg() {
        return jobExcepMsg;
    }

    public void setJobExcepMsg(String jobExcepMsg) {
        this.jobExcepMsg = jobExcepMsg;
    }

    public String getJobExcepDetail() {
        return jobExcepDetail;
    }

    public void setJobExcepDetail(String jobExcepDetail) {
        this.jobExcepDetail = jobExcepDetail;
    }

    public String getJobExcepLastTime() {
        return jobExcepLastTime;
    }

    public void setJobExcepLastTime(String jobExcepLastTime) {
        this.jobExcepLastTime = jobExcepLastTime;
    }

    public JobDetails getJob() {
        return job;
    }

    public void setJob(JobDetails job) {
        this.job = job;
    }
}
