package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {


    @Test
    public void buildUserDemography() {

        UserDemography userDemographyTest = UserDemographyFactory.buildUserDemography("211210471@mycput.ac.za","Mrs",
                "Female","African", new Date(1990,03,05));
        System.out.println(userDemographyTest);
        Assert.assertNotNull(userDemographyTest.toString());

    }
}