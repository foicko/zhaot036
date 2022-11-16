import cn.edu.ujn.zhaot036.info.dao.Teacher;
import cn.edu.ujn.zhaot036.info.service.ITeacherService;
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
    ITeacherService teacherService;
    @Test
    public void FindTest(){
//        System.out.println(this.customerService.findAll());
//        System.out.println(new Date());
        System.out.println(teacherService.getAllTeacher());
    }
    @Test
    public void addTeacher(){
        Teacher t = new Teacher();
        t.setTeachername("温道颖");
        t.setTeachernum("202031222036");
        t.setProfession("养猪科学");
        t.setAddtime(new Date());
        teacherService.insert(t);
        System.out.println("成功");
    }
    @Test
    public void testUpdate(){
        Teacher t = teacherService.getOneTeacherById(1);
        t.setAddtime(new Date());
        teacherService.updateTeacher(t);
    }
    @Test
    public void testDelete(){
        teacherService.deleteTeacher(1);
        System.out.println(teacherService.getAllTeacher());
    }


}
