package adapter;

import java.time.LocalDate;

public class TwitterClient implements Client {
    private final TwitterUser user;

    public TwitterClient(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return LocalDate.parse(user.getLastActiveTime());
    }
}
