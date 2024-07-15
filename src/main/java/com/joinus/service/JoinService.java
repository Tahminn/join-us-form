package com.joinus.service;



import java.util.List;

import javax.transaction.Transactional;

import com.joinus.model.JoinModel;
import org.springframework.stereotype.Service;

import com.joinus.repository.JoinRepository;

@Service
@Transactional
public class JoinService {
		private JoinRepository repo;

		public JoinService(JoinRepository repo) {
			super();
			this.repo = repo;
		}
		
		public void saveMyUser(JoinModel join)
		{
			repo.save(join);
		}
		
		public List<JoinModel> findAll()
		{
			List<JoinModel> allJoins=(List<JoinModel>) repo.findAll();
			return allJoins;
		}
}
