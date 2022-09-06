package com.mycompany.gym.member.info.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GymMember {
    public GymMember(String memberId, String name, String gender, int age) {
        this.memberId = memberId;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    private String memberId;
    private String name;
    private String gender;
    private int age;

}
