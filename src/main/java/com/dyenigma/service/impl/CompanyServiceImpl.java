package com.dyenigma.service.impl;

import com.dyenigma.entity.Company;
import com.dyenigma.service.CompanyService;
import com.dyenigma.utils.Constants;
import com.dyenigma.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * topic 公司信息处理业务类
 * author Dyenigma
 * create 2016/4/4 15:12
 */
@Transactional
@Service("companyService")
public class CompanyServiceImpl extends BaseServiceImpl<Company> implements CompanyService {

    private final Logger LOGGER = LoggerFactory.getLogger(CompanyServiceImpl.class);

    @Override
    public List<Company> findComp(String compId) {
        LOGGER.info("开始查找公司信息");
        List<Company> compList;
        if (compId == null || "".equals(compId)) {
            compList = companyMapper.findAll();
        } else {
            Company company = companyMapper.findById(Integer.parseInt(compId));
            compList = new ArrayList<>();
            compList.add(company);
        }
        return compList;
    }

    @Override
    public Long getCount() {
        return null;
    }

    @Override
    public boolean delComp(String compId) {
        int i = companyMapper.delete(Integer.parseInt(compId));
        if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean persistenceComp(Company company) {

        Integer userId = Constants.getCurrendUser().getUserId();
        if (StringUtil.isEmpty(company.getCompanyId() + "")) {
            company.setCreated(new Date());
            company.setLastmod(new Date());
            company.setCreater(userId);
            company.setModifyer(userId);
            company.setStatus(Constants.PERSISTENCE_STATUS);
            companyMapper.insert(company);
        } else {
            company.setLastmod(new Date());
            company.setModifyer(userId);
            companyMapper.update(company);
        }
        return true;
    }
}
