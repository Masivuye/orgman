package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {


    @Test
    public void buildOrganisationUser() {

        OrganisationUser organisationUserTest = OrganisationUserFactory.buildOrganisationUser("CD4562","211210471@mycput.ac.za");
        System.out.println(organisationUserTest);
        Assert.assertNotNull(organisationUserTest.getOrgCode(),organisationUserTest.getUserEmail());

    }
}