package com.fes.service;

import java.util.List;
import com.fes.entity.ItemEqJoinVO;
import com.fes.entity.JobVO;
import com.fes.entity.MateriaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fes.mapper.SimMapper;
import lombok.Setter;

@Service
public class SimService {
	
	@Setter(onMethod_ = @Autowired)
	private SimMapper mapper;

	public List<JobVO> getItemList() {
		return mapper.getJobList();
	}

	public String getJobName(Integer jobCode) {
		return mapper.getJobName(jobCode);
	}

	public List<ItemEqJoinVO> getWeaponList(Integer minLv, Integer maxLv, Integer minItemLv, Integer maxItemLv, String jobName) {
		return mapper.getWeaponList(minLv, maxLv, minItemLv, maxItemLv, jobName);
	}

	public List<ItemEqJoinVO> getShieldList(Integer minLv, Integer maxLv, Integer minItemLv, Integer maxItemLv, String jobName) {
		return mapper.getShieldList(minLv, maxLv, minItemLv, maxItemLv, jobName);
	}

	public List<ItemEqJoinVO> getHeadList(Integer minLv, Integer maxLv, Integer minItemLv, Integer maxItemLv, String jobName) {
		return mapper.getHeadList(minLv, maxLv, minItemLv, maxItemLv, jobName);
	}

	public List<ItemEqJoinVO> getTopList(Integer minLv, Integer maxLv, Integer minItemLv, Integer maxItemLv, String jobName) {
		return mapper.getTopList(minLv, maxLv, minItemLv, maxItemLv, jobName);
	}

	public List<ItemEqJoinVO> getHandList(Integer minLv, Integer maxLv, Integer minItemLv, Integer maxItemLv, String jobName) {
		return mapper.getHandList(minLv, maxLv, minItemLv, maxItemLv, jobName);
	}

	public List<ItemEqJoinVO> getBottomsList(Integer minLv, Integer maxLv, Integer minItemLv, Integer maxItemLv, String jobName) {
		return mapper.getBottomsList(minLv, maxLv, minItemLv, maxItemLv, jobName);
	}

	public List<ItemEqJoinVO> getFootList(Integer minLv, Integer maxLv, Integer minItemLv, Integer maxItemLv, String jobName) {
		return mapper.getFootList(minLv, maxLv, minItemLv, maxItemLv, jobName);
	}

	public List<ItemEqJoinVO> getEarList(Integer minLv, Integer maxLv, Integer minItemLv, Integer maxItemLv, String jobName) {
		return mapper.getEarList(minLv, maxLv, minItemLv, maxItemLv, jobName);
	}

	public List<ItemEqJoinVO> getNeckList(Integer minLv, Integer maxLv, Integer minItemLv, Integer maxItemLv, String jobName) {
		return mapper.getNeckList(minLv, maxLv, minItemLv, maxItemLv, jobName);
	}

	public List<ItemEqJoinVO> getArmList(Integer minLv, Integer maxLv, Integer minItemLv, Integer maxItemLv, String jobName) {
		return mapper.getArmList(minLv, maxLv, minItemLv, maxItemLv, jobName);
	}

	public List<ItemEqJoinVO> getFingerList(Integer minLv, Integer maxLv, Integer minItemLv, Integer maxItemLv, String jobName) {
		return mapper.getFingerList(minLv, maxLv, minItemLv, maxItemLv, jobName);
	}

	public List<MateriaVO> getMateriaList(){
		return mapper.getMateriaList();
	}

	public int getMateria(Integer itemId) {
		return mapper.getMateria(itemId);
	}

}
