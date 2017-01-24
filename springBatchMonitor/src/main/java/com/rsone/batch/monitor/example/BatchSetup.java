package com.rsone.batch.monitor.example;

import com.rsone.batch.monitor.example.dto.EnrollmentRequestDTO;
import com.rsone.batch.monitor.example.processor.EnrollmentProcessor;
import com.rsone.batch.monitor.example.reader.ListCustomReader;
import com.rsone.batch.monitor.example.writer.EnrollmentWriter;
import org.hibernate.id.IncrementGenerator;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by RSone on 23/01/2017.
 */
@Configuration
@EnableBatchProcessing
public class BatchSetup {

    @Autowired
    JobBuilderFactory jobBuilderFactory;

    @Autowired
    StepBuilderFactory stepBuilderFactory;

    @Bean
    public ItemReader<EnrollmentRequestDTO> reader(){
        return new ListCustomReader();
    }
    @Bean
    public ItemProcessor<EnrollmentRequestDTO,EnrollmentRequestDTO> processor(){
        return new EnrollmentProcessor();
    }
    @Bean
    public ItemWriter<EnrollmentRequestDTO> writer(){
        return new EnrollmentWriter();
    }
    @Bean
    public Step step1(){
        return stepBuilderFactory.get("step1")
                .<EnrollmentRequestDTO,EnrollmentRequestDTO> chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .build();
    }
    @Bean
    public Job enrollJob(){
        return jobBuilderFactory.get("job1")
                .incrementer(new RunIdIncrementer())
                .flow(step1())
                .end()
                .build();
    }
}
