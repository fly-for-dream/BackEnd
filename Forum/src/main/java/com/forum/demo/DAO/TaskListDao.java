package com.forum.demo.DAO;

import com.forum.demo.Entity.ClassInfoEntity;
import com.forum.demo.Entity.TaskEntity;
import com.forum.demo.Entity.TaskListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskListDao extends JpaRepository<TaskListEntity,String> {
    public TaskListEntity findTaskListEntityByUserAndTaskid(String user,String taskid);
}
