package com.joinus.repository;

import java.util.List;

import com.joinus.model.JoinModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JoinRepository extends CrudRepository<JoinModel, Long> {
		public List<JoinModel> findAll();
}
