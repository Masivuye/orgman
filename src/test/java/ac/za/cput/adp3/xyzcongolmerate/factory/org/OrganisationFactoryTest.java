package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {


    @Test
    public void buildOrganisation() {

        Organisation organisationTest = OrganisationFactory.buildOrganisation("Cape Peninsula University of Technology");
        System.out.println(organisationTest);
        Assert.assertNotNull(organisationTest.getOrgCode(),organisationTest.getOrgName());

    }
}