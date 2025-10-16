package calculator;

import calculator.service.Service;
import calculator.validation.Validators;
import calculator.validation.ValidatorsImpl;
import calculator.verification.Verification;
import calculator.verification.VerificationImpl;

public class Application {
    public static void main(String[] args) {

        Validators validators = new ValidatorsImpl();
        Verification verification = new VerificationImpl(validators);
        Service service = new Service(verification);

        try{
            service.run();
        } catch (Exception e){
            e.printStackTrace();
            return;
        }

    }
}