package com.zxmk.wechatservice.service;




import com.zxmk.model.LearnResouce;

import java.util.List;
import java.util.Map;

/**
 * Created by tengj on 2017/4/7.
 */
public interface LearnService {
    int add(LearnResouce learnResouce);
    int update(LearnResouce learnResouce);
    int deleteByIds(String[] ids);
    LearnResouce queryLearnResouceById(Long learnResouce);

}
