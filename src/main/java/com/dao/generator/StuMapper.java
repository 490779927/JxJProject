package com.dao.generator;

import com.entity.Stu;

public interface StuMapper {
    int insert(Stu record);

    int insertSelective(Stu record);
}