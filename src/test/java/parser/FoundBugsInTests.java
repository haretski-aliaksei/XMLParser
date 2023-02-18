package parser;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class FoundBugsInTests {

    @Test(groups = "testsWithBugs", description = "This programme don't support comments")
    public void getValidXMLWithCommentTest() {
        Assertion assertion = new Assertion();
        XMLParser parser = new XMLParser("src/test/resources/TestErrorCommentXML.xml");
        parser.parseDocument();
        assertion.assertTrue(parser.getErrors().isEmpty());
    }
}
