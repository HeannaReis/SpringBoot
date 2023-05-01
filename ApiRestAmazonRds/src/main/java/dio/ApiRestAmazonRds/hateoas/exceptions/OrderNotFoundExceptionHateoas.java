package dio.ApiRestAmazonRds.hateoas.exceptions;

public class OrderNotFoundExceptionHateoas extends RuntimeException {
    public OrderNotFoundExceptionHateoas(long id){
        super("Could not found the order id: "+id);
    }
}