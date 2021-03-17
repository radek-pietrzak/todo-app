package io.github.mat3e.adapter;

import io.github.mat3e.model.TaskGroup;
import io.github.mat3e.model.TaskGroupRepository;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SqlTaskGroupRepository extends TaskGroupRepository, JpaRepository<TaskGroup, Integer> {
    @Override
    @Query("from TaskGroup g join fetch g.tasks")
    List<TaskGroup> findAll() ;
}
