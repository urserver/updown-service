package userve;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class updownApplication extends Application<updownConfiguration> {

    public static void main(final String[] args) throws Exception {
        new updownApplication().run(args);
    }

    @Override
    public String getName() {
        return "updown";
    }

    @Override
    public void initialize(final Bootstrap<updownConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final updownConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
