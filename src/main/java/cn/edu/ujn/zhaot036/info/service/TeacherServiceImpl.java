package cn.edu.ujn.zhaot036.info.service;

import cn.edu.ujn.zhaot036.info.dao.Teacher;
import cn.edu.ujn.zhaot036.info.dao.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements ITeacherService{
    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public Teacher getOneTeacherById(int id) {
        return teacherMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherMapper.selectAll();
    }

    @Override
    public int insert(Teacher teacher) {
        return teacherMapper.insert(teacher);
    }

    @Override
    public int deleteTeacher(int id) {
        return teacherMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        return teacherMapper.updateByPrimaryKey(teacher);
    }
}
