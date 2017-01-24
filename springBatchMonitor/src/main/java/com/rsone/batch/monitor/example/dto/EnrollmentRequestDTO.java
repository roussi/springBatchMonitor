package com.rsone.batch.monitor.example.dto;

/**
 * Created by RSone on 23/01/2017.
 */
public class EnrollmentRequestDTO {

    private String pan;
    private String cardholderName;
    private String cardholderPhoneNumber;
    private String operationType;

    public EnrollmentRequestDTO() {
    }

    public EnrollmentRequestDTO(String pan, String cardholderName, String cardholderPhoneNumber, String operationType) {
        this.pan = pan;
        this.cardholderName = cardholderName;
        this.cardholderPhoneNumber = cardholderPhoneNumber;
        this.operationType = operationType;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getCardholderPhoneNumber() {
        return cardholderPhoneNumber;
    }

    public void setCardholderPhoneNumber(String cardholderPhoneNumber) {
        this.cardholderPhoneNumber = cardholderPhoneNumber;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
}
