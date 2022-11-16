package cn.edu.ujn.zhaot036.info.dao;

import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Teacher row);

    int insertSelective(Teacher row);

    Teacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teacher row);

    int updateByPrimaryKey(Teacher row);

    List<Teacher> selectAll();
}