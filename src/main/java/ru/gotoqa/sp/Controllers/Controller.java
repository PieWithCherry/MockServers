package ru.gotoqa.sp.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.gotoqa.sp.models.*;


@RestController
public class Controller {


    @RequestMapping(value = "/task1", method = RequestMethod.POST)
    public ResponseEntity<ResponseTask1> checkCard(@RequestBody PhonesByCardNumberRq phonesByCardNumberRq){
        ResponseTask1 responseTask1 = new ResponseTask1();

        responseTask1.setValue(phonesByCardNumberRq.getMessages().randomNumber());

        StatusRule statusRule = new StatusRule();
        statusRule.setCode("Success");
        statusRule.setDesc("Успешно отработал");
        responseTask1.setStatusRuleObject(statusRule);
        responseTask1.setTimeout(10L);

        return new ResponseEntity<>(responseTask1, HttpStatus.OK);
    }
    @RequestMapping(value = "/task2", method = RequestMethod.POST)
    public ResponseEntity<ResponseTask2> task1(@RequestBody PhonesByCardNumberRq phonesByCardNumberRq) {
        ResponseTask2 responseTask2 = new ResponseTask2();
        responseTask2.setCounter(phonesByCardNumberRq.getMessages().counterJSON());
        responseTask2.setSumma(phonesByCardNumberRq.getMessages().Summa());
        StatusRule statusRule = new StatusRule();
        statusRule.setCode("Success");
        statusRule.setDesc("Успешно отработал");
        responseTask2.setStatusRuleObject(statusRule);
        return new ResponseEntity<>(responseTask2, HttpStatus.OK);
    }

    @RequestMapping(value = "/task3", method = RequestMethod.POST)
    public ResponseEntity<ResponseTask3> task3(@RequestBody PhonesByCardNumberRq phonesByCardNumberRq){
        ResponseTask3 responseTask3 = new ResponseTask3();

        phonesByCardNumberRq.getMessages().writterLog();
        StatusRule statusRule = new StatusRule();
        statusRule.setCode("Success");
        statusRule.setDesc("Лог записан");
        responseTask3.setStatusRuleObject(statusRule);
        return new ResponseEntity<>(responseTask3, HttpStatus.OK);
    }
    @RequestMapping(value = "/")
    public ResponseEntity<ResponseTask1> get(){
        ResponseTask1 responseTask1 = new ResponseTask1();
        responseTask1.setValue("Здесь будет ответ на задание");
        StatusRule statusRule = new StatusRule();
        statusRule.setCode("SUCCESS");
        statusRule.setDesc("Успешно обработано");
        responseTask1.setStatusRuleObject(statusRule);
        responseTask1.setTimeout(10L);
        return new ResponseEntity<>(responseTask1, HttpStatus.OK);
    }

}
