package ca.lluo.lisexpress.exception;

public class ItemNotFoundException extends RuntimeException {

    public ItemNotFoundException(Long id) {
        super("The item id '" + id + "' does not exist in our records");
    }

}