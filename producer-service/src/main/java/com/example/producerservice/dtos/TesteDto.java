package com.example.producerservice.dtos;

import java.io.Serializable;

public class TesteDto implements Serializable {
    Integer num;
    String pal;

    public TesteDto(Integer num, String pal) {
        this.num = num;
        this.pal = pal;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPal() {
        return pal;
    }

    public void setPal(String pal) {
        this.pal = pal;
    }
}
