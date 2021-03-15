package io.github.mat3e.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    List<Task> findAll();

    Optional<Task> findById(Integer i);

    boolean existsById(Integer id);

    Task save(Task entity);

    Page<Task> findAll(Pageable page);
}
