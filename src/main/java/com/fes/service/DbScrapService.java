package com.fes.service;

import com.fes.entity.DbScrapVO;
import com.fes.entity.EqDetailVO;
import com.fes.entity.ItemDetailVO;
import com.fes.entity.MealsDetailVO;
import com.fes.mapper.DbScrapMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.Setter;

@Service
public class DbScrapService{

	@Setter(onMethod_ = @Autowired)
	private DbScrapMapper mapper;

	public int selectSeq() {
		 return mapper.selectSeq();	
	}

	public int selectSeq2() {
		 return mapper.selectSeq2();		
	}

	public int insertId(ItemDetailVO vo) {
		return mapper.insertId(vo);
	}

	public void insertEd(EqDetailVO evo) {
		mapper.insertEd(evo);
	}

	public void insertMd(MealsDetailVO mvo) {
		mapper.insertMd(mvo);
	}
	
	public void insertCt(DbScrapVO dvo) {
		mapper.insertCt(dvo);
	}
}
