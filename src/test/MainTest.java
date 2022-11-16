import cn.edu.ujn.zhaot036.info.college.dao.College;
import cn.edu.ujn.zhaot036.info.college.service.ICollegeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:Context/applicationContext.xml"})
public class MainTest {
    @Autowired
    ICollegeService collegeService;
    @Test
    public void FindTest(){
//        System.out.println(new Date());
        System.out.println(collegeService.getAllCollege());
    }
    @Test
    public void addTeacher(){
        College c = new College();
        c.setCollegename("信息科学与工程学院");
        c.setCollegenum("202031222036");
        c.setEnglishname("info College");
        c.setInuse("true");
        c.setRemark("null");
        c.setAddtime(new Date());
        collegeService.insert(c);
        System.out.println("成功");
    }
    @Test
    public void testUpdate(){
        College t = collegeService.getOneCollegeById(1);
        t.setAddtime(new Date());
        collegeService.updateCollege(t);
    }
    @Test
    public void testDelete(){
        collegeService.deleteCollege(1);
        System.out.println(collegeService.getAllCollege());
    }


}
