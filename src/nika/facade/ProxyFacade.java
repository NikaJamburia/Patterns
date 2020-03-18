package nika.facade;

import nika.proxy.protection.*;
import nika.proxy.virtual.LazyHtmlParser;
import nika.proxy.virtual.Parser;

public class ProxyFacade implements Facade {
    @Override
    public void compose() {
        System.out.println("Creating lazy parser");
        Parser parser = new LazyHtmlParser("this string represents some html");

        System.out.println("Calling some method of parser when needed");
        System.out.println(parser.getHeadings());

        System.out.println("****");
        System.out.println("Calling other method");
        System.out.println(parser.getNumberOfDivs());

        System.out.println("**** Protection proxy:");

        User superAdmin = new User(UserRole.SUPER_ADMIN);
        User regular = new User(UserRole.REGULAR_USER);
        User admin = new User(UserRole.ADMIN);

        // We dont know that abstract ResourceRepository we have is actually protected
        ResourceRepository repoForSuperAdmin = new ProtectedResourceRepository(superAdmin);
        ResourceRepository repoForRegular = new ProtectedResourceRepository(regular);
        ResourceRepository repoForAdmin = new ProtectedResourceRepository(admin);

        repoForRegular.getResource1();
        repoForRegular.getResource2();
        repoForRegular.getResource3();

        repoForAdmin.getResource1();
        repoForAdmin.getResource2();
        repoForAdmin.getResource3();

        repoForSuperAdmin.getResource1();
        repoForSuperAdmin.getResource2();
        repoForSuperAdmin.getResource3();

    }
}
