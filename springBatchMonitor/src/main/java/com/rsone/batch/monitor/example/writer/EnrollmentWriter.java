package com.rsone.batch.monitor.example.writer;

import com.rsone.batch.monitor.example.dto.EnrollmentRequestDTO;
import com.rsone.batch.monitor.example.processor.EnrollmentProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by RSone on 23/01/2017.
 */
public class EnrollmentWriter implements ItemWriter<EnrollmentRequestDTO> {

    private static final Logger log= LoggerFactory.getLogger(EnrollmentProcessor.class);
    @Override
    public void write(List<? extends EnrollmentRequestDTO> list) throws Exception {

        for(EnrollmentRequestDTO dto:list){
            log.info("#Writer Item "+dto.getPan());
        }
    }
}
