package ru.gotoqa.sp.models;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

//Тупикин Вадим
@Getter
@Setter
@ToString
public class Messages extends CounterData {
    @JsonView
    private String NumbersMin;
    @JsonView
    private String NumbersMax;
    @JsonView
    private String numberCounter;
    @JsonView
    private String message;
    int i = 0;

//    public String getNumbersMin() {
//        return NumbersMin;
//    }
//
//    public String getNumbersMax() {
//        return NumbersMax;
//    }
//
//    public void setNumbersMin(String NumbersMin) {
//        this.NumbersMin = NumbersMin;
//    }
//
//    public void setNumbersMax(String NumbersMax) {
//        this.NumbersMax = NumbersMax;
//    }

    public String randomNumber() {
//        NumbersMin = getNumbersMin();
//        NumbersMax = getNumbersMax();
        int numMin = Integer.parseInt(NumbersMin);
        int numMax = Integer.parseInt(NumbersMax);
        int diff = numMax - numMin;
        Random random = new Random();
        int randNumb = random.nextInt(diff + 1);
        numMin += randNumb;
        NumbersMin = Integer.toString(numMin);
        return NumbersMin;
    }

    public String counterJSON() {
        String count;
        count = Integer.toString(returnNumber());
        return count;
    }

    public String Summa() {
        String summa;
        int sum = returnNumber();
        int cot = Integer.parseInt(numberCounter);
        setArray(sum + 1);
        sum += cot;

        summa = Integer.toString(sum);
        return summa;
    }

    public void writterLog() {
        //C:\Log

        Date date = new Date();
        try (FileWriter writer = new FileWriter("C://Log//log.txt", true)) {
            writer.write(date.toString() + ": " + message);
            writer.append('\n');
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
