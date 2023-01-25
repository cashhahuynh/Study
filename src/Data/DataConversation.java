package Data;

public class DataConversation {

    public static void stringToInteger() {
        String [] numArr = {"1", "2", "3"};

        for (int i = 0; i < numArr.length; i++) {
            Integer num = Integer.parseInt(numArr[i]);
            if (num.getClass().getSimpleName().equals("Integer")) {
                System.out.println("This element is a number: " + numArr[i]);
            }
        }
    }

    public static void integerToString() {
        Integer [] numArr = {1, 2, 3};

        for(int i = 0; i < numArr.length; i ++) {
            String str = String.valueOf(numArr[i]);
            if(str.getClass().getSimpleName().equals("String")) {
                System.out.println("This element is a string: " + str);
            }
        }
    }
}
