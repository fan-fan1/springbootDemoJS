package com.example.demo.service;

import com.example.demo.dao.ICourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ICourseServiceImpl implements ICourseService {
    @Autowired
    ICourseDao iCourseDao;
    @Override
    public void findCourseAll() {
        iCourseDao.findall();

    }
}
