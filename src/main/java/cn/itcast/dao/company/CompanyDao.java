package cn.itcast.dao.company;

import cn.itcast.domain.company.Company;
import cn.itcast.domain.company.CompanyExample;
import java.util.List;

public interface CompanyDao {
    int deleteByPrimaryKey(String id);

    int insert(Company record);

    int insertSelective(Company record);

    List<Company> selectByExample(CompanyExample example);

    Company selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}