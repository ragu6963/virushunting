package com.coderby.myapp.consult.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.coderby.myapp.consult.model.ConsultVO;

@Repository
public interface IConsultRepository {
	List<ConsultVO> getConsultList();

	void insertConsult(ConsultVO consult);
}
