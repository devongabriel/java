public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator finalString = new StringManipulator();
        String result = finalString.trimAndConcat("         Charlie     ", "   Bucket          ");
        System.out.println(result);

        StringManipulator testIndex = new StringManipulator();
        Integer finalvalue = testIndex.getIndexOrNull("I love the ocean.", 'a');
        System.out.println(finalvalue);

        StringManipulator findSubString = new StringManipulator();
        Integer finalValue = findSubString.getIndexOrNull("I love the ocean.", "Val");
        System.out.println(finalValue);

        StringManipulator combineString = new StringManipulator();
        String endResult = combineString.concatSubstring("I love the ocean.", 10, 3, "crossfit");
        System.out.println(endResult);
    }
}
