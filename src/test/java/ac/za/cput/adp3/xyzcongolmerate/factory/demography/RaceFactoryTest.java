package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {


    @Test
    public void buildRace() {

        Race raceTest = RaceFactory.buildRace("African");
        System.out.println(raceTest);
        Assert.assertNotNull(raceTest.getRaceDescription(),raceTest.getRaceId());

    }
}