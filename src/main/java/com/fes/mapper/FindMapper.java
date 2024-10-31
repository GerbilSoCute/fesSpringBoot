package com.fes.mapper;

import java.util.List;

import com.fes.entity.CateVO;
import com.fes.entity.Criteria;
import com.fes.entity.ItemDetailVO;
import com.fes.entity.ItemEqJoinVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Mapper
public interface FindMapper {
	
	public List<ItemDetailVO> getItemList(Criteria cri);
	
	public List<ItemDetailVO> getItemListCate3(@Param("category3")String category3, @Param("cri")Criteria cri);
	
	public List<ItemDetailVO> getItemListCate2(@Param("category2")String category2, @Param("cri")Criteria cri);
	
	public ItemEqJoinVO getItemDetailInfo(int itemId);
	
	public int getTotal(Criteria cri);
	
	public int getTotalCate3(@Param("category3")String category3, @Param("cri")Criteria cri);
	
	public int getTotalCate2(@Param("category2")String category2, @Param("cri")Criteria cri);
	
	public String getItemDetailCate3(String itemCategory3);

	public String getWeaponCategory2();
	
	public String getArmorCategory2();
	
	public String getAcceCategory2();
	
	public List<CateVO> getWeaponCategory3();
	
	public List<CateVO> getArmorCategory3();
	
	public List<CateVO> getAcceCategory3();
}
