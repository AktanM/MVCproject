package peaksoft.dao;

import org.springframework.stereotype.Repository;
import peaksoft.model.Company;
import peaksoft.model.Group;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.List;
@Transactional
@Repository
public class CompanyDaoImpl implements CompanyDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void UpdateCompaniesTable(long id, Company company) {
    entityManager.merge(company);
    }

    @Override
    public void saveCompanies(Company company){
    entityManager.persist(company);
    }

    @Override
    public void removeCompaniesById(long id) {
    entityManager.remove(getById(id));
    }

    @Override
    public List<Company> getAllCompanies() {
        return entityManager.createQuery("select co from Company co ",Company.class).getResultList();
    }

    @Override
    public Company getById(long id) {
        return entityManager.find(Company.class,id);
    }

}
