package com.mycompany.gym.member.info.resources;

import com.mycompany.gym.member.info.models.GymMember;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gym-member-info")
public class GymMemberInfoResource {

    @RequestMapping("/{memberId}")
    public GymMember getMemberInfo(@PathVariable("memberId") String memberId) {
        return new GymMember(memberId,"John", "Male", 26);
    }

}
