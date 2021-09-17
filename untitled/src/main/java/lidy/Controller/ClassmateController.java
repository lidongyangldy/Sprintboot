package lidy.Controller;
import lidy.dao.ClassmateDao;
import lidy.model.Classmate;
import lidy.service.ClassmateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import java.util.*;
@EnableAutoConfiguration
@Controller
public class ClassmateController {
    @RequestMapping("/lidy")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }
    @Autowired
    private ClassmateService cs;
    //查询所有
    @RequestMapping("/query")
    @ResponseBody
    public List<Classmate> queryall(){
        List<Classmate> list=cs.query();
        return list;
    }
    @RequestMapping("/insert/{insertid}")
    @ResponseBody
    public int insert(@PathVariable(name = "insertid") String insertid, @RequestParam(name = "id") String id,@RequestParam(name = "name") String name,@RequestParam(name = "sex") String sex,@RequestParam(name = "age") int age){
        Map<String,Object> datamap = new HashMap<>();
        datamap.put("id",id);
        datamap.put("name",name);
        datamap.put("sex",sex);
        datamap.put("age",age);
        int resinsert = cs.insert(datamap);
        return resinsert;
    }
    @RequestMapping("/delete/{deletetid}")
    @ResponseBody
    public int delete(@PathVariable(name = "deletetid") String deletetid, @RequestParam(name = "id") String id){
        Map<String,Object>datamap = new HashMap<>();
        datamap.put("id",id);
        int resdelete = cs.delete(datamap);
        return resdelete;
    }
    @RequestMapping("/update/{updateid}")
    @ResponseBody
    public int update(@PathVariable(name = "updateid") String updateid, @RequestParam(name = "id") String id,@RequestParam(name = "name") String name){
        Map<String,Object>datamap = new HashMap<>();
        datamap.put("id",id);
        datamap.put("name",name);
        int resupdate = cs.update(datamap);
        return resupdate;
    }
    @RequestMapping("/select/{selectid}")
    @ResponseBody
    public List<Classmate> select(@PathVariable(name = "selectid") String selectid, @RequestParam(name = "name") String name){
        /*name的形式为['A','B'],要改成（‘A’，‘B’）的list*/
        name.replace("","");
        name.replace("","");
        name.replace("'","");
        String [] namelist = name.split(",");
        List<String> list = new ArrayList<>();
        for (String curr:namelist){
            list.add(curr);
        }
        Map<String,Object>datamap = new HashMap<>();
        datamap.put("name",list);
        List<Classmate>resselect = cs.select(datamap);
        return resselect;
    }
}
