package cn.edu.ujn.zhaot036.info.controller;

import cn.edu.ujn.zhaot036.info.dao.Teacher;
import cn.edu.ujn.zhaot036.info.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    private ITeacherService teacherService;

    @RequestMapping("/AddTeacherJSON")
    @ResponseBody
    public String AddTeacherJSON(@RequestBody Teacher teacher){
        teacher.setAddtime(new Date());
        teacherService.insert(teacher);
        System.out.println(teacher);
        return "redirect:findAllTeacher";
    }
    @RequestMapping("toJSON")
    public String toJSON(){
        return "AddJSON";
    }

    @RequestMapping("/findAllTeacher")
    public String findAllTeacher(Model model) {
        List<Teacher> Teachers = teacherService.getAllTeacher();
        model.addAttribute("Teachers", Teachers);
        return "teacherList";
    }
    @RequestMapping("AddTeacher")
    public String AddTeacher(Teacher Teacher){
        Teacher.setAddtime(new Date());
        teacherService.insert(Teacher);
        return "redirect:findAllTeacher";
    }
    @RequestMapping("toAddTeacher")
    public String toAddTeacher(){
        return "AddTable";
    }

    @RequestMapping("DeleteTeacher")
    public String DeleteTeacher(int id){
        teacherService.deleteTeacher(id);
        return "redirect:findAllTeacher";
    }
    @RequestMapping("UpdateTeacher")
    public String UpdateTeacher(Teacher Teacher){
        System.out.println(Teacher);
        teacherService.updateTeacher(Teacher);
        return "redirect:findAllTeacher";
    }
    @RequestMapping("toUpdateTeacher")
    public String toUpdateTeacher(int id, Model model){
        model.addAttribute("Teacher",teacherService.getOneTeacherById(id));
        return "UpdateTable";
    }
}
