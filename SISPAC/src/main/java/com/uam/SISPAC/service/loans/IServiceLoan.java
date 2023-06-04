package com.uam.SISPAC.service.loans;

import com.uam.SISPAC.dto.loans.LoanDto;
import com.uam.SISPAC.model.loans.Loan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceLoan {

    void loanCreate(LoanDto loan);

    void loanDelete(String id);

    List<Loan> checkLoans();

}
