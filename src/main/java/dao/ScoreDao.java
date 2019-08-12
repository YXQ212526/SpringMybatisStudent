package dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import pojo.Score;
import pojo.StuCourScor;

@MapperScan
public interface ScoreDao {


  List<StuCourScor> select(@Param("studentId") int studentId, @Param("year") int year);


  List<StuCourScor> getTop10();


  List<StuCourScor> GPA();


  void insert(Score score);


}
