package com.fes.service;

import java.util.List;

import com.fes.entity.CateVO;
import com.fes.entity.Criteria;
import com.fes.entity.ItemDetailVO;
import com.fes.entity.ItemEqJoinVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fes.mapper.FindMapper;
import lombok.Setter;

@Service
public class FindService {
	
	@Setter(onMethod_ = @Autowired)
	private FindMapper mapper;

	public List<ItemDetailVO> getItemList(Criteria cri) {
		return mapper.getItemList(cri);
	}

	public List<ItemDetailVO> getItemListCate3(String category3, Criteria cri) {
		return mapper.getItemListCate3(category3, cri);
	}

	public List<ItemDetailVO> getItemListCate2(String category2, Criteria cri) {
		return mapper.getItemListCate2(category2, cri);
	}

	public ItemEqJoinVO getItemDetailInfo(int itemId) {
		return mapper.getItemDetailInfo(itemId);
	}

	public int getTotal(Criteria cri) {
		return mapper.getTotal(cri);
	}

	public int getTotalCate3(String category3, Criteria cri) {
		return mapper.getTotalCate3(category3, cri);
	}

	public int getTotalCate2(String category2, Criteria cri) {
		return mapper.getTotalCate2(category2, cri);
	}

	public String getItemDetailCate3(String itemCategory3) {
		return mapper.getItemDetailCate3(itemCategory3);
	}

	public String getWeaponCategory2() {
		return mapper.getWeaponCategory2();
	}

	public String getArmorCategory2() {
		return mapper.getArmorCategory2();
	}

	public String getAcceCategory2() {
		return mapper.getAcceCategory2();
	}

	public List<CateVO> getWeaponCategory3() {
		return mapper.getWeaponCategory3();
	}

	public List<CateVO> getArmorCategory3() {
		return mapper.getArmorCategory3();
	}

	public List<CateVO> getAcceCategory3() {
		return mapper.getAcceCategory3();
	}
}
