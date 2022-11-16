package cn.edu.ujn.zhaot036.info.college.service;

import cn.edu.ujn.zhaot036.info.college.dao.College;
import cn.edu.ujn.zhaot036.info.college.dao.CollegeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CollegeServiceImpl implements ICollegeService{
    @Autowired
    CollegeMapper collegeMapper;

    @Override
    public College getOneCollegeById(int id) {
        return collegeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<College> getAllCollege() {
        return collegeMapper.findAll();
    }

    @Override
    public int insert(College College) {
        return collegeMapper.insert(College);
    }

    @Override
    public int deleteCollege(int id) {
        return collegeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateCollege(College College) {
        return collegeMapper.updateByPrimaryKey(College);
    }
}
