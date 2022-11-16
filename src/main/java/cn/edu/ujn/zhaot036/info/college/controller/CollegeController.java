package cn.edu.ujn.zhaot036.info.college.controller;

import cn.edu.ujn.zhaot036.info.college.dao.College;
import cn.edu.ujn.zhaot036.info.college.service.ICollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class CollegeController {
    @Autowired
    ICollegeService collegeService;

    @RequestMapping("/AddCollegeJSON")
    @ResponseBody
    public String AddCollegeJSON(@RequestBody College college){
        college.setAddtime(new Date());
        collegeService.insert(college);
        System.out.println(college);
        return "successful";
    }
    @RequestMapping("toJSON")
    public String toJSON(){
        return "AddJSON";
    }

    @RequestMapping("/findAllCollege")
    public String findAllCollege(Model model) {
        List<College> Colleges = collegeService.getAllCollege();
        model.addAttribute("Colleges", Colleges);
        return "collegeList";
    }
    @RequestMapping("AddCollege")
    public String AddCollege(College college){
        college.setAddtime(new Date());
        collegeService.insert(college);
        return "redirect:findAllCollege";
    }
    @RequestMapping("toAddCollege")
    public String toAddCollege(){
        return "AddTable";
    }

    @RequestMapping("DeleteCollege")
    public String DeleteCollege(int id){
        collegeService.deleteCollege(id);
        return "redirect:findAllCollege";
    }
    @RequestMapping("UpdateCollege")
    public String UpdateCollege(College College){
        System.out.println(College);
        collegeService.updateCollege(College);
        return "redirect:findAllCollege";
    }
    @RequestMapping("toUpdateCollege")
    public String toUpdateCollege(int id, Model model){
        model.addAttribute("College",collegeService.getOneCollegeById(id));
        return "UpdateTable";
    }
}
