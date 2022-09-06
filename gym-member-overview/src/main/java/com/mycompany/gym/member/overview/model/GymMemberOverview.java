package com.mycompany.gym.member.overview.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class GymMemberOverview {
    private String name;
    private String gender;
    private int age;
    private List<AttendanceEntry> list;

    public GymMemberOverview(String name, String gender, int age, List<AttendanceEntry> list) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.list = list;
    }
}
