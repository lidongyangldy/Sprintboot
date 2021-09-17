package lidy.service;

import lidy.dao.ClassmateDao;
import lidy.model.Classmate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class ClassmateService {
    @Autowired
    private ClassmateDao classmatedao;
    public List<Classmate> query(){
        return classmatedao.query();
    };
    public int insert(Map<String,Object> datamap) {return classmatedao.insert(datamap);    };
    public int delete(Map<String,Object> datamap) {return classmatedao.delete(datamap);    };
    public int update(Map<String,Object> datamap) {return classmatedao.update(datamap);    };
    public List<Classmate> select(Map<String,Object> datamap){
        return classmatedao.select(datamap);
    };
}

