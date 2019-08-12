package dao;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import pojo.Course;

@MapperScan
public interface CourseDao {


  Course select(int id);

  void insert(Course course);


  int update(@Param("id") int id, @Param("name") String name);


  void delete(int id);

}
