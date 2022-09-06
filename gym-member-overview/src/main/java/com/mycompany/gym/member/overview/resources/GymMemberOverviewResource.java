package com.mycompany.gym.member.overview.resources;

import com.mycompany.gym.member.overview.model.AttendanceEntry;
import com.mycompany.gym.member.overview.model.GymMember;
import com.mycompany.gym.member.overview.model.GymMemberOverview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/gym-member-overview")
public class GymMemberOverviewResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{memberId}")
    public GymMemberOverview getMemberOverview(@PathVariable("memberId") String memberId) {
        //GymMember gymMember = new GymMember(memberId,"John", "Male", 26);
        GymMember gymMember = restTemplate.getForObject("http://gym-member-info-service/gym-member-info/" + memberId, GymMember.class);

        List<AttendanceEntry> attendanceEntryList = Arrays.asList(
                new AttendanceEntry("1234", "06-Sep-2022"),
                new AttendanceEntry("1235", "07-Sep-2022"));
        GymMemberOverview gymMemberOverview = new GymMemberOverview();
        gymMemberOverview.setName(gymMember.getName());
        gymMemberOverview.setGender(gymMember.getGender());
        gymMemberOverview.setAge(gymMember.getAge());
        gymMemberOverview.setList(attendanceEntryList);
        return gymMemberOverview;
    }
}
