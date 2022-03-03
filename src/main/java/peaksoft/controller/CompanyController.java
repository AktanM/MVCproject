package peaksoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import peaksoft.model.Company;
import peaksoft.service.CompanyServiceImpl;

@Controller
public class CompanyController {

    private final CompanyServiceImpl companyService;
    @Autowired
    public CompanyController(CompanyServiceImpl companyService) {
        this.companyService = companyService;
    }
    @GetMapping("/getAllCompanies")
    public String create(Model model){
        model.addAttribute("comp",companyService.getAllCompanies());
     return "company/mainPage";
    }

    @GetMapping("/newCompany")
    public String newCom(Model model){
        model.addAttribute("company",new Company());
        return "company/addCompany";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("company") Company company){
        companyService.saveCompanies(company);
        return "redirect:/getAllCompanies";
    }

}
