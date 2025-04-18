package com.example.demo;

public class InstitutionComposite {
    private final IInstitution institution;

    public InstitutionComposite(IInstitution institution) {
        this.institution = institution;
    }

    public void showInstitution() {
        institution.displayInfo();
    }
}
