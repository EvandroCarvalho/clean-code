package com.study.capitulo12.before;

public abstract class VacationPolicyTemplateMethod {
    public void accrueVacation() {
        calculateBaseVacationHours();
        alterForLegalMinimums();
        applyToPayroll();
    }

    private void calculateBaseVacationHours() {
        //
    }

    abstract protected void alterForLegalMinimums();

    private void applyToPayroll() {
        //
    }
}
