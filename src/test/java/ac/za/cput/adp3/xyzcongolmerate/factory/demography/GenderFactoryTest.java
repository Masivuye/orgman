package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {


    @Test
    public void buildGender() {
        //throw new UnsupportedOperationException("Not supported yet!");
        Gender genderTest = GenderFactory.buildGender("Female");
        System.out.println(genderTest);
        Assert.assertNotNull(genderTest.getGenderId(),genderTest.getGenderDescription());

    }
}