package com.rsone.batch.monitor.example.reader;

import com.rsone.batch.monitor.example.dto.EnrollmentRequestDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.*;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by RSone on 23/01/2017.
 */
public class ListCustomReader implements ItemReader<EnrollmentRequestDTO> , StepExecutionListener {

    Logger logger= LoggerFactory.getLogger(ListCustomReader.class);
    List<EnrollmentRequestDTO> enrollmentRequestDTOs=new ArrayList<>();
    int countElement=0;
    Date startTime, endTime;

    @Override
    public void beforeStep(StepExecution stepExecution) {
        startTime=stepExecution.getStartTime();
        logger.info("#Before Processing of step : "+stepExecution.getStepName());
        for (int i=0; i<1000000;i++){
            enrollmentRequestDTOs.add(new EnrollmentRequestDTO("100000"+i,"name"+i,"066022"+i,"CREATE"));
        }
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        logger.info("#After Processing of step : "+stepExecution.getStepName());
        endTime=stepExecution.getEndTime();
        logger.info("Job finished in : "+(endTime.getTime()-startTime.getTime()));
        if(stepExecution.getExitStatus().equals(ExitStatus.COMPLETED)){
            logger.info("finished successfully");
        }else{
            logger.error("Step failed");
        }
        return null;
    }

    @Override
    public EnrollmentRequestDTO read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if(countElement<enrollmentRequestDTOs.size()) {
            return enrollmentRequestDTOs.get(countElement++);
        }
        return null;
    }
}
