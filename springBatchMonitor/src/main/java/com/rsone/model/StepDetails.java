package com.rsone.model;

import javax.persistence.*;

/**
 * this entity encapsulate detail info for a specific job
 * Created by RSone on 16/01/2017.
 */

@Entity
@Table(name = "STEP_DETAILS")
public class StepDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STEP_ID")
    private Long stepId;

    @Column(name = "STEP_NAME")
    private String stepName;

    @Column(name = "STEP_STATUS")
    private String stepStatus;

    @ManyToMany
    @JoinColumn(name = "STEP_JOB_ID")
    private JobDetails job;

    public Long getStepId() {
        return stepId;
    }

    public void setStepId(Long stepId) {
        this.stepId = stepId;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public String getStepStatus() {
        return stepStatus;
    }

    public void setStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
    }

    public JobDetails getJob() {
        return job;
    }

    public void setJob(JobDetails job) {
        this.job = job;
    }
}
