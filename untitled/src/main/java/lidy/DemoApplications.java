package lidy;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;


//@ComponentScan(basePackages ={"lidy.dao.ClassmateDao" })
@SpringBootApplication
@MapperScan("ldy.model.Classmate")
public class DemoApplications {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplications.class,args);
    }
}
