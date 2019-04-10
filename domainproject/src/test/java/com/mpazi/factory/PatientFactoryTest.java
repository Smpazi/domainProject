package com.mpazi.factory;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class PatientFactoryTest {
   @Test
    public void getPatient() {
        String name = "Salomi";
        Patient p= PatientFactory.getPatient(name);
        System.out.println(p);
        Assert.assertNotNull(p.getId());

    }
}
