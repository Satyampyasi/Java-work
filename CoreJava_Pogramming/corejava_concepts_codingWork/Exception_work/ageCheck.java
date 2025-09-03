package Exception_work;

public class ageCheck {  // Class names should start with uppercase letter (convention)
    public void checkAge(int age) throws InvalidAgeException, NotEligibleException {  // Fixed typo in exception name
        if (age > 120 || age <= 0)
            throw new InvalidAgeException("InvalidAgeException: Enter age in a valid range (0 < age <= 120)");
        else {
            if (age < 18)
                throw new NotEligibleException("NotEligibleException: You cannot vote as you're under 18");
            else 
                System.out.println("You can vote as you are eligible");
        }
    }

    public static void main(String[] args) {
        ageCheck a1 = new ageCheck();
        try {
            a1.checkAge(15);
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());  // Actually print the message
        }
        catch(NotEligibleException e) {
            System.out.println(e.getMessage());  // Print the message for this exception too
        }
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class NotEligibleException extends Exception {  // Fixed spelling of "Eligible"
    NotEligibleException(String message) {
        super(message);
    }
}