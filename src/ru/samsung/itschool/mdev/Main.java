package ru.samsung.itschool.mdev;

import com.google.gson.Gson;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String str = "{\"name\":\"Anton\",\"age\":15,\"position\":\"Junior\",\"salary\":100,\"skills\":[\"java\",\"xml\",\"python\",\"Android\"]}";
        Gson gson = new Gson();
        Staff ivan = gson.fromJson(str,Staff.class);
        System.out.println(ivan.skills.size());

    }

    class Staff {
        public String name;
        public int age;
        public String position;
        public BigDecimal salary;
        public List<String> skills;
    }
}
