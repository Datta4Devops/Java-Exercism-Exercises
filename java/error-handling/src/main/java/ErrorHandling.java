import java.io.IOException;
import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() {
        throw new IllegalArgumentException();
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws IOException{
        throw new IOException(message);
    }

    void handleErrorByThrowingAnyUncheckedException() {
        throw new ArithmeticException();
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {

        throw new ArithmeticException(message);
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException{
        throw new CustomCheckedException();
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException
    {
        throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingCustomUncheckedException() throws  CustomUncheckedException{
        throw new CustomUncheckedException();
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        Optional<Integer> opt;
        try {
            opt = Optional.of(Integer.valueOf(integer));

        }catch (Exception e){
            e.getMessage();
            opt = Optional.empty();
        }
        return opt;
    }

}
