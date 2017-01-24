package com.rsone.batch.monitor.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * This entity encapsulate job detail info
 * Created by RSone on 16/01/2017.
 */
@Entity
@Table(name = "JOB_DETAILS")
public class JobDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "JOB_ID")
    private Long jobId;
    
    @Column(name = "JOB_NAME")
    private String jobName;

    @Column(name = "JOB_START_TIME")
    private volatile String startExecTime;

    @Column(name = "JOB_END_TIME")
    private volatile String endExecTime;

    @Column(name = "JOB_DURATION")
    private volatile Long jobDuration;
    
    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private volatile Collection<StepDetails> steps;

    @Column(name = "JOB_STATUS")
    private String jobStatus;

    @Column(name = "JOB_PARAMETER")
    private volatile String jobParameters;

    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private volatile Collection<JobException> jobExceptions;


    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getStartExecTime() {
        return startExecTime;
    }

    public void setStartExecTime(String startExecTime) {
        this.startExecTime = startExecTime;
    }

    public String getEndExecTime() {
        return endExecTime;
    }

    public void setEndExecTime(String endExecTime) {
        this.endExecTime = endExecTime;
    }

    public Long getJobDuration() {
        return jobDuration;
    }

    public void setJobDuration(Long jobDuration) {
        this.jobDuration = jobDuration;
    }

    public Collection<StepDetails> getSteps() {
        return steps;
    }

    public void setSteps(Collection<StepDetails> steps) {
        this.steps = steps;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public Collection<JobException> getJobExceptions() {
        return jobExceptions;
    }

    public void setJobExceptions(Collection<JobException> jobExceptions) {
        this.jobExceptions = jobExceptions;
    }

    public String getJobParameters() {
        return jobParameters;
    }

    public void setJobParameters(String jobParameters) {
        this.jobParameters = jobParameters;
    }

    @Override
    public String toString() {
        return "# Job Details = {" +
                "jobId=" + jobId +
                ", jobName='" + jobName + '\'' +
                ", startExecTime='" + startExecTime + '\'' +
                ", endExecTime='" + endExecTime + '\'' +
                ", jobDuration=" + jobDuration +
                ", steps=" + steps +
                ", jobStatus='" + jobStatus + '\'' +
                ", jobParameters='" + jobParameters + '\'' +
                '}';
    }
}
