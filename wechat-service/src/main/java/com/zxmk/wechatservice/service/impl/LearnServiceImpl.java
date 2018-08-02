package com.zxmk.wechatservice.service.impl;



import com.zxmk.model.LearnResouce;
import com.zxmk.wechatservice.mapper.LearnMapper;
import com.zxmk.wechatservice.service.LearnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by tengj on 2017/4/7.
 */
@Service
public class LearnServiceImpl implements LearnService {

   /* @Autowired
    LearnDao learnDao;
    @Override
    public int add(LearnResouce learnResouce) {
        return this.learnDao.add(learnResouce);
    }

    @Override
    public int update(LearnResouce learnResouce) {
        return this.learnDao.update(learnResouce);
    }

    @Override
    public int deleteByIds(String ids) {
        return this.learnDao.deleteByIds(ids);
    }

    @Override
    public LearnResouce queryLearnResouceById(Long id) {
        return this.learnDao.queryLearnResouceById(id);
    }

    @Override
    public Page queryLearnResouceList(Map<String,Object> params) {
        return this.learnDao.queryLearnResouceList(params);
    }*/
   @Autowired
   LearnMapper learnMapper;
    @Override
    public int add(LearnResouce learnResouce) {
        return this.learnMapper.add(learnResouce);
    }

    @Override
    public int update(LearnResouce learnResouce) {
        return this.learnMapper.update(learnResouce);
    }

    @Override
    public int deleteByIds(String[] ids) {
        return this.learnMapper.deleteByIds(ids);
    }

    @Override
    public LearnResouce queryLearnResouceById(Long id) {
        return this.learnMapper.queryLearnResouceById(id);
    }


}
