package ru.gotoqa.sp.models;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ResponseTask3 {
    StatusRule StatusRuleObject;

    public StatusRule getStatusRuleObject() {
        return StatusRuleObject;
    }

    public void setStatusRuleObject(StatusRule statusRuleObject) {
        StatusRuleObject = statusRuleObject;
    }

}

