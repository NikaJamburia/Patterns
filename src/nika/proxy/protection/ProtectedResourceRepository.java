package nika.proxy.protection;

import java.util.Arrays;
import java.util.List;

public class ProtectedResourceRepository implements ResourceRepository {
    private ResourceRepositoryImpl resourceRepository;
    private User userTryingToAccess;

    public ProtectedResourceRepository(User userTryingToAccess) {
        this.resourceRepository = new ResourceRepositoryImpl();
        this.userTryingToAccess = userTryingToAccess;
    }

    @Override
    public void getResource1() {
        List<UserRole> acceptedRoles = Arrays.asList(
                UserRole.REGULAR_USER,
                UserRole.ADMIN,
                UserRole.SUPER_ADMIN
        );

        if (acceptedRoles.contains(userTryingToAccess.getRole())) {
            System.out.println("Granting user with role " + userTryingToAccess.getRole().toString() + " access to resource 1");
            resourceRepository.getResource1();
        }
        else {
            System.out.println("User with role " + userTryingToAccess.getRole().toString() + " denied access to resource 1");
        }
    }

    @Override
    public void getResource2() {
        List<UserRole> acceptedRoles = Arrays.asList(
                UserRole.ADMIN,
                UserRole.SUPER_ADMIN
        );

        if (acceptedRoles.contains(userTryingToAccess.getRole())) {
            System.out.println("Granting user with role " + userTryingToAccess.getRole().toString() + " access to resource 2");
            resourceRepository.getResource2();
        }
        else {
            System.out.println("User with role " + userTryingToAccess.getRole().toString() + " denied access to resource 2");
        }
    }

    @Override
    public void getResource3() {
        List<UserRole> acceptedRoles = Arrays.asList(
                UserRole.SUPER_ADMIN
        );

        if (acceptedRoles.contains(userTryingToAccess.getRole())) {
            System.out.println("Granting user with role " + userTryingToAccess.getRole().toString() + " access to resource 3");
            resourceRepository.getResource3();
        }
        else {
            System.out.println("User with role " + userTryingToAccess.getRole().toString() + " denied access to resource 3");
        }
    }
}
