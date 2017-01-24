package com.rsone.batch.monitor.repository;

import com.rsone.batch.monitor.model.StepDetails;
import org.springframework.data.repository.Repository;

import java.util.Collection;

/**
 * Created by RSone on 17/01/2017.
 */
public interface StepDetailsRepository extends Repository<StepDetails,Long> {

    Collection<StepDetails> findByJob_JobName(String jobName);
}
