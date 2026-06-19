public class CustomerService {

    private CustomerRepository repository;

    public CustomerService(
            CustomerRepository repository) {

        this.repository = repository;
    }

    public void getCustomer() {

        repository.displayCustomer();

    }

}