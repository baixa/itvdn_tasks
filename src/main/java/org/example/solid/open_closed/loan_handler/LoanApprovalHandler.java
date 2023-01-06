package org.example.solid.open_closed.loan_handler;

public class LoanApprovalHandler {
    public void approveLoan(PersonalLoanValidator validator) {
        if(validator.isValid()) {
            //Process pf the loan
        }
    }

    public void approveVehicleLoan(VehicleLoanValidator validator) {
        if(validator.isValid()) {
            //Process pf the loan
        }
    }

}

class PersonalLoanValidator {
    public boolean isValid() {
        //validation logic
        return true;
    }
}

class VehicleLoanValidator {
    public boolean isValid() {
        //validation logic
        return true;
    }
}
