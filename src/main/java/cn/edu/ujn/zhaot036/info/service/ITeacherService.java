package cn.edu.ujn.zhaot036.info.service;


import cn.edu.ujn.zhaot036.info.dao.Teacher;

import java.util.List;

public interface ITeacherService {
    Teacher getOneTeacherById(int id);
    List<Teacher> getAllTeacher();
    int insert(Teacher teacher);

    int deleteTeacher(int id);
    int updateTeacher(Teacher teacher);
}
