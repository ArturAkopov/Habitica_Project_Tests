package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:auth.properties"
})

public interface AuthConfig extends Config {
    @Key("login")
    String login();

    @Key("email")
    String email();

    @Key("password")
    String password();

    @Key("userId")
    String userId();

    @Key("apiToken")
    String apiToken();

    @Key("browserstackUser")
    String browserstackUser();

    @Key("browserstackPassword")
    String browserstackPassword();

    @Key("selenoidUrl")
    String selenoidUrl();
}
