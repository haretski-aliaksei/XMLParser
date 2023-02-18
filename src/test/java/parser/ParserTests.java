package parser;

import helpers.TextHelpers;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import utilities.Iterator;

import java.lang.reflect.Field;

import static org.testng.Assert.assertEquals;

public class ParserTests {

    Assertion assertion = new Assertion();

    @Test(groups = "validationTests")
    public void getXMLErrorsTest() {
        XMLParser parser = new XMLParser("src/test/resources/TestErrorUnexpectedTag.xml");
        String expected = TextHelpers.UNEXPECTED_TAG_TEXT.getTextHelper();
        parser.parseDocument();
        Iterator<String> errorsIter = parser.getErrors().iterator();
        String actual = errorsIter.next();
        assertion.assertEquals(actual, expected);
    }

    @Test(groups = "validationTests")
    public void getValidXMLTest() {
        XMLParser parser = new XMLParser("src/test/resources/TestValidXML.xml");
        parser.parseDocument();
        assertion.assertTrue(parser.getErrors().isEmpty());
    }

    @Test(groups = "validationTests")
    public void checkValidationRootTagTest() {
        XMLParser parser = new XMLParser("src/test/resources/TestErrorRootTag.xml");
        String expected = TextHelpers.START_WITH_ROOT_TAG_TEXT.getTextHelper();
        parser.parseDocument();
        Iterator<String> errorsIter = parser.getErrors().iterator();
        String actual = errorsIter.next();
        assertion.assertEquals(actual, expected);
    }

    @Test(groups = "validationTests")
    public void checkValidationCloseRootTagTest() {
        XMLParser parser = new XMLParser("src/test/resources/TestErrorCloseRootTag.xml");
        String expected = TextHelpers.CLOSE_ROOT_TAG_TEXT.getTextHelper();
        parser.parseDocument();
        Iterator<String> errorsIter = parser.getErrors().iterator();
        String actual = errorsIter.next();
        assertion.assertEquals(actual, expected);
    }

    @Test(groups = "validationTests")
    public void checkValidationDataInRootTagTest() {
        XMLParser parser = new XMLParser("src/test/resources/TestErrorDataInRootTag.xml");
        String expected = TextHelpers.ALL_DATA_IN_ROOT_TAG_TEXT.getTextHelper();
        parser.parseDocument();
        Iterator<String> errorsIter = parser.getErrors().iterator();
        String actual = errorsIter.next();
        assertion.assertEquals(actual, expected);
    }

    @Test(groups = "validationTests")
    public void checkValidationFormatTagTest() {
        XMLParser parser = new XMLParser("src/test/resources/TestErrorFormatTag.xml");
        String expected = TextHelpers.TAG_FORMAT_TEXT.getTextHelper();
        parser.parseDocument();
        Iterator<String> errorsIter = parser.getErrors().iterator();
        String actual = errorsIter.next();
        assertion.assertEquals(actual, expected);
    }

    @Test(groups = "validationTests")
    public void checkValidationCloseTagTest() {
        XMLParser parser = new XMLParser("src/test/resources/TestErrorCloseTag.xml");
        String expected = TextHelpers.CLOSE_TAG_TEXT.getTextHelper();
        parser.parseDocument();
        Iterator<String> errorsIter = parser.getErrors().iterator();
        String actual = errorsIter.next();
        assertion.assertEquals(actual, expected);
    }

    @Test(groups = "simpleTests")
    public void testGetNameFromRoot(){
        XMLParser parser = new XMLParser("src/test/resources/TestValidXML.xml");
        parser.parseDocument();
        String xmlTageName;
        try {
            Field field = parser.getClass().getDeclaredField("root");
            field.setAccessible(true);
            XMLTag xmlTag = (XMLTag) field.get(parser);
            xmlTageName = xmlTag.getName();
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        assertEquals(xmlTageName, "contacts");
    }
}