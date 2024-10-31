package com.fes.mapper;

import com.fes.entity.DbScrapVO;
import com.fes.entity.EqDetailVO;
import com.fes.entity.ItemDetailVO;
import com.fes.entity.MealsDetailVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Mapper
public interface DbScrapMapper {
	
	public int selectSeq();
	
	public int selectSeq2();
	
	public int insertId(ItemDetailVO vo);
	
	public void insertEd(EqDetailVO evo);
	
	public void insertMd(MealsDetailVO mvo);

	public void insertCt(DbScrapVO dvo);
}
