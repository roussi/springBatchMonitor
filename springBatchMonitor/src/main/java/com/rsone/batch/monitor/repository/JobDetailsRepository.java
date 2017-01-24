package com.rsone.batch.monitor.repository;

import com.rsone.batch.monitor.model.JobDetails;
import org.springframework.data.repository.Repository;

/**
 * Created by RSone on 17/01/2017.
 */
public interface JobDetailsRepository extends Repository<JobDetails,Long> {
    JobDetails findByJobName(String name);
}
