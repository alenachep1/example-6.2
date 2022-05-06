package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника- " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета- " + fullName.toUpperCase(Locale.ROOT));
        System.out.println("Данные для административного отдела- " + fullName.replace(" ", "; "));
        String fullName1 = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника- " + fullName1.replace("ё", "e"));// write your code here
    }
}
