package nika;

import nika.facade.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Facade> facades = Arrays.asList(
                new LoggedFacade(new DecoratorFacade(), "Decorator"),
                new LoggedFacade(new ObserverFacade(), "Observer"),
                new LoggedFacade(new FactoryFacade(), "Factory"),
                new LoggedFacade(new SingletonFacade(), "Singleton"),
                new LoggedFacade(new CommandFacade(), "Command"),
                new LoggedFacade(new AdapterFacade(), "Adapter")
        );
        facades.forEach(Facade::compose);
    }
}
