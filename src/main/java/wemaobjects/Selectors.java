package wemaobjects;

public interface Selectors {
    String usernameField = "[data-test='username']";
    String passwordField = "[data-test=\"password\"]";
    String loginButton = "[data-test=\"login-button\"]";
    String burgerMenu = "#react-burger-menu-btn";
    String logoutButton = "#logout_sidebar_link";

    String standard = "standard_user";

    String locked = "locked_out_user";

    String problem = "problem_user";

    String glitch = "performance_glitch_user";

    String error = "error_user";

    String visual = "visual_user";

    String password = "secret_sauce";
}
