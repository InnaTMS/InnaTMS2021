package com.home.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Computer {
    private String processor;
    private int ram; // оперативная память
    private int disk; // жесткий диск
    private int resource; // ресурс полных циклов работы (включений/выключений)

    public void info() {
        System.out.printf("Процессор %s оперативка %d жесткий диск %d ресурс полных циклов %d", processor, ram, disk, resource);
    }
    public void on() {
        System.out.println("Включение...");
       if (checkAction() && checkResource()) {
           off();
       } else {
           burned();
       }
    }

    private void burned() {
        System.out.println("Компьютер сгорел!");
    }

    private boolean checkAction() {

        return true;
    }

    public void off() {
        resource--;
        System.out.println("Выключение");
    }
     private boolean checkResource(){
        return resource >0;
     }

}
