import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue("LocalNumber is not 14", 14 == this.getLocalNumber());
    }
    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("ClassNumber bigger then 45", this.getClassNumber() > 19);
    }
    @Test
    public void testGetClassString() {
        String a = this.getClassString();
        //System.out.println("Word \"hello\" or \"Hello\" here? Answer: " + a.contains("hello") + " " + a.contains("Hello") + " соответсвенно");
        if (a.contains("hello") == true) {
            System.out.println("\"hello\" contains in class_string");
        } else if(a.contains("Hello") == true) {
            System.out.println("\"Hello\" contains in class_string");
        } else {
            System.out.println("Word does not contains in class_string");
        }
    }
}


