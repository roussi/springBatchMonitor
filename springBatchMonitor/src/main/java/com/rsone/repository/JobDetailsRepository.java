package com.rsone.repository;

import com.rsone.model.JobDetails;
import org.springframework.data.repository.Repository;

/**
 * Created by RSone on 17/01/2017.
 */
public interface JobDetailsRepository extends Repository<JobDetails,Long> {
    JobDetails findByJobName(String name);
}
