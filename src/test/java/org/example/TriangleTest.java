package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class TriangleTest {

    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @Test
    public void correctTriangle(){
        Triangle obj1= new Triangle(3, 4, 5);
        Assert.assertNotNull(obj1);
    }

    @Test
    public void triangleHasWrongSides(){
        Triangle obj1= new Triangle(1, 2, 2);
        obj1.areaOfTriangle(obj1);
        Assert.assertTrue(true);

    }

    @Test
    public void TriangleHaveNegativeSides(){
        Triangle obj1= new Triangle(-1, 2, 2);
        obj1.areaOfTriangle(obj1);
        Assert.assertTrue(true);
    }

    @Test
    public void itsTriangleTest(){
        Triangle obj1= new Triangle(3, 4, 5);
        Assert.assertEquals(true, obj1.itsTriangle());
    }

    @Test
    public void itsNotTriangleTest(){
        Triangle obj1= new Triangle(-3, 4, 5);
        Assert.assertEquals(false, obj1.itsTriangle());
    }

    @Test
    public void ColculateArea(){
        Triangle obj1= new Triangle(3, 4, 5);
        Assert.assertEquals(true, obj1.canColculateArea(obj1));
    }

    @Test
    public void NotColculateArea(){
        Triangle obj1= new Triangle(-3, 1, 5);
        Assert.assertEquals(false, obj1.canColculateArea(obj1));
    }
}
