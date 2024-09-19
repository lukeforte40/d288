B.   Create your subgroup and project by logging into GitLab using the web link provided and do the following:

•    connect your new Java project

•    commit with a message and push when you complete each of the tasks listed below (parts B to F, etc.)



Note: Any submissions that do not have a commit after each task will not be evaluated.


Note: You may commit and push whenever you want to back up your changes, even if a task is not complete.


•    Submit a copy of the git repository URL and a copy of the repository branch history retrieved from your repository, which must include the commit messages and dates.


Note: Wait until you have completed all the following prompts before you create your copy of the repository branch history.

    See Commit.

C.   Construct four new packages, one for each of the following: controllers, entities, dao, and services. The packages will need to be used for a checkout form and vacations packages list.


Note: The packages should be on the same level of the hierarchy.


Note: Construct a package named config and copy the RestDataConfig.java provided in the laboratory environment to the package. Modify it so that the package and imports have the correct package and import addresses. Copy the application.properties file that is provided in the laboratory environment into your application properties resource file.

    See application.properties, RestDataConfig.java

D.   Write code for the entities package that includes entity classes and the enum designed to match the UML diagram.

    See: StatusType.java, Cart.java, CartItem.java, Country.java, Customer.java, Division.java, Excursion.java, Vacation.java

E.   Write code for the dao package that includes repository interfaces for the entities that extend JpaRepository, and add cross-origin support.

    See: CartItemRepository.java, CartRepository.java, CountryRepository.java, CustomerRepository.java, DivisionRepository.java, ExcursionRepository.java, VacationRepository.java

F.   Write code for the services package that includes each of the following:

•    a purchase data class with a customer cart and a set of cart items

•    a purchase response data class that contains an order tracking number

•    a checkout service interface

•    a checkout service implementation class

    See: Purchase.java, PurchaseResponse.java, CheckoutService.java, Cart.java, Customer.Java, CheckoutServiceImpl.java

G.   Write code to include validation to enforce the inputs needed by the Angular front-end.
    
    See: Customer.java

H.   Write code for the controllers package that includes a REST controller checkout controller class with a post mapping to place orders.


Note: You do not need to duplicate REST functionality for each repository by creating methods in Java.

    See:  CheckoutController.java

I.   Add five sample customers to the application programmatically.

    See: BootStrapData.java

