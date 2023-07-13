package activities;

class CustomException extends Exception {
    private String message = null;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

public class Activity8_CustomException {
    public static void main(String[] a){
        try {
            // Method call with correct input
            Activity8_CustomException.exceptionTest("Will print to console");
            // Method call with incorrect input
            Activity8_CustomException.exceptionTest(null); // Exception is thrown here
            Activity8_CustomException.exceptionTest("Won't execute");
        } catch(CustomException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }
}

