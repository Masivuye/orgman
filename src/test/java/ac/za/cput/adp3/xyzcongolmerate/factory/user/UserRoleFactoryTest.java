package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {


    @Test
    public void buildUserRole() {

        UserRole userRoleTest = UserRoleFactory.buildUserRole("CD45236","211210471@mycput.ac.za","Student");
        System.out.println(userRoleTest);
        Assert.assertNotNull(userRoleTest.toString());

    }
}