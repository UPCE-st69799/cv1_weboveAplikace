package fei.upce.cz.cv1_weboveAplikace.repository;

import fei.upce.cz.cv1_weboveAplikace.domain.Task;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {
}
