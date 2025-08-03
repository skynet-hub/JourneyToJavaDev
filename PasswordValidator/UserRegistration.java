package PasswordValidator;

public class UserRegistration {
    public void RegisterUSer(String password, String ConfirmPassword){
        try (ValidationLogger logger = new ValidationLogger()){
            PasswordValidator validator = new PasswordValidator();
            validator.validatePassword(password, ConfirmPassword);
            logger.logSuccess();
        } catch (Exception e) {
            try (ValidationLogger logger = new ValidationLogger()){
                logger.logFailure("Error registering user, Please check you have followed all necessary steps");
            }
        } finally {
            try (ValidationLogger logger = new ValidationLogger()){
                logger.close();
            }
        }
    }
}
