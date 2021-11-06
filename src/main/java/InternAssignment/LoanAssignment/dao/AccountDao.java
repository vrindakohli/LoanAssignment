package InternAssignment.LoanAssignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import InternAssignment.LoanAssignment.entities.LoanData;

public interface AccountDao extends JpaRepository<LoanData, Long> {

}
