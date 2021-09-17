package lidy.dao;

import lidy.model.Classmate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
import java.util.Map;

@Mapper
public interface ClassmateDao {
     List<Classmate> query();
     int insert(Map<String,Object> datamap);
     int delete(Map<String,Object> datamap);
     int update(Map<String,Object> datamap);
     List<Classmate> select(Map<String,Object> datamap);
}
