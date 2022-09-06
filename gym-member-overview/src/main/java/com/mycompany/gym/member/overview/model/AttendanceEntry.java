package com.mycompany.gym.member.overview.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AttendanceEntry {
    public AttendanceEntry(String attendanceId, String date) {
        this.attendanceId = attendanceId;
        this.date = date;
    }

    private String attendanceId;
    private String date;
}
