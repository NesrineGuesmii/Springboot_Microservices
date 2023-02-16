package com.example.user.service.service;

import com.example.user.service.VO.Department;
import com.example.user.service.VO.ResponseTemplateVO;
import com.example.user.service.entity.User;
import com.example.user.service.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("inside saverUser of userService");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("inside getUser of userService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);

        Department department =
                restTemplate.getForObject("http://localhost:9001/departments/" + user.getId(),Department.class);
        vo.setUser(user);
        vo.setDepartment(department);

        return vo;
    }
}
