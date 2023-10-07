class CustomCheckedException extends Exception {
    public String message;
    CustomCheckedException() {
        System.out.println("CustomCheckedException class");
    }

    CustomCheckedException(String message)  {
        super(message);
    }

}
