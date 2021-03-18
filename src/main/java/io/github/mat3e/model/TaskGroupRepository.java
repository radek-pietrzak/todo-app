package io.github.mat3e.model;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

public interface TaskGroupRepository {
    List<TaskGroup> findAll();

    Optional<TaskGroup> findById(Integer id);

    TaskGroup save(TaskGroup entity);

    List<TaskGroup> findByDone(boolean done);

    boolean existsByDoneIsFalseAndProject_Id(Integer projectId);
}
