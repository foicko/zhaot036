package cn.edu.ujn.zhaot036.info.college.service;

import cn.edu.ujn.zhaot036.info.college.dao.College;

import java.util.List;

public interface ICollegeService {
    College getOneCollegeById(int id);
    List<College> getAllCollege();
    int insert(College College);

    int deleteCollege(int id);
    int updateCollege(College College);
}
