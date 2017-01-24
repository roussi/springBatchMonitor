package com.rsone.batch.monitor.example.processor;

import com.rsone.batch.monitor.example.dto.EnrollmentRequestDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by RSone on 23/01/2017.
 */
public class EnrollmentProcessor implements ItemProcessor<EnrollmentRequestDTO, EnrollmentRequestDTO> {
    private static final Logger log= LoggerFactory.getLogger(EnrollmentProcessor.class);

    @Override
    public EnrollmentRequestDTO process(EnrollmentRequestDTO enrollmentRequestDTO) throws Exception {
        log.info("#Proccess item "+enrollmentRequestDTO.getPan());
        return enrollmentRequestDTO;
    }
}
