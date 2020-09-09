package com.lagou.edu.factory;

import com.lagou.edu.pojo.Company;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/9/8
 * Time: 9:20 PM
 *
 * @author kevliu3
 */
public class CompanyFactoryBean implements FactoryBean<Company> {

    //公司名称,地址,规模
    private String companyInfo;

    public void setCompanyInfo(String companyInfo) {
        this.companyInfo = companyInfo;
    }

    @Override
    public Company getObject() throws Exception {
        //创建复杂对象
        Company company = new Company();
        String[] split = companyInfo.split(",");
        company.setName(split[0]);
        company.setAddress(split[1]);
        company.setScale(Integer.parseInt(split[2]));
        return company;
    }

    @Override
    public Class<?> getObjectType() {
        return Company.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
