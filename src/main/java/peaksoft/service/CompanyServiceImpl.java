package peaksoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.dao.CompanyDao;
import peaksoft.dao.CompanyDaoImpl;
import peaksoft.model.Company;
import java.util.List;
@Service
public class CompanyServiceImpl implements CompanyService{
    @Autowired
    private CompanyDao companyDao;


    @Override
    public void UpdateCompaniesTable(long id, Company company) {
        companyDao.UpdateCompaniesTable(id,company);
    }

    @Override
    public void saveCompanies(Company company){
        companyDao.saveCompanies(company);
    }

    @Override
    public void removeCompaniesById(long id) {
        companyDao.removeCompaniesById(id);
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyDao.getAllCompanies();
    }

    @Override
    public Company getById(long id) {
        return companyDao.getById(id);
    }
}
