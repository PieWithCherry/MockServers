package ru.gotoqa.sp.models;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ResponseTask2 {
    @JsonView
    private String summa;
    @JsonView
    private String counter;
    StatusRule StatusRuleObject;

    public String getSumma() {
        return summa;
    }

    public void setSumma(String summa) {
        this.summa = summa;
    }

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }


    public StatusRule getStatusRuleObject() {
        return StatusRuleObject;
    }

    public void setStatusRuleObject(StatusRule statusRuleObject) {
        StatusRuleObject = statusRuleObject;
    }

}
