package main.exceptions;

public class Exceptions {
    public static void main(String[] args) {
        try {
            Connect(); // biblioteka co łączy się z epuap
        } catch (Exception e){
            throw new ConnectionCouldNotBeEstablishedException(e);
        }

        getTenUsers();
    }

    public static void Connect() throws ConnectionException {
        throw new ConnectionException();
    }

    private static class ConnectionException extends Exception {
    }

    private static void getTenUsers(){
        throw new NotEnoughUsersException("Found only 7 users need 3 more to work");
    }

    private static class NotEnoughUsersException extends RuntimeException {
        public NotEnoughUsersException(String message) {
            super(message);
        }
    }

    private static class ConnectionCouldNotBeEstablishedException extends RuntimeException {
        public ConnectionCouldNotBeEstablishedException(Throwable cause) {
            super(cause);
        }
    }

}
