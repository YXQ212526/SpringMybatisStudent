package dao;

import org.mybatis.spring.annotation.MapperScan;

import pojo.Student;

@MapperScan
public interface StudentDao {


  Student select(int id);

  void insert(Student student);

  int update(Student student);

  void delete(int id);


}