package gov.weather;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by katana on 2/27/17.
 */
public class NdfdXMLBindingStubTest {

    @Test
    public void NDFDgenLatLonList() throws Exception {

        NdfdXMLBindingStub binding = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();

        String result = binding.latLonListZipCode("53711");

        assertEquals("Result did not match expected value.", "???", result);

    }

}