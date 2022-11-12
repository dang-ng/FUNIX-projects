select company_code, founder, 
       count(distinct lead_manager_code), 
       count(distinct senior_manager_code), 
       count(distinct manager_code), 
       count(distinct employee_code) 
from (select company.company_code, company.founder, lead_manager.lead_manager_code, senior_manager.senior_manager_code, manager.manager_code, employee.employee_code 
      from company, lead_manager, senior_manager, manager, employee 
      where employee.company_code = company.company_code 
      and manager.company_code = company.company_code 
      and senior_manager.company_code = company.company_code 
      and lead_manager.company_code = company.company_code) as a 
group by company_code, founder 
order by company_code