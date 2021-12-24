public enum TypeOfHands {
    CHUBBY("пухленькой"),
    BUSY("тряпкой");
    private final String typeOfHand;

    TypeOfHands(String typeOfHand) {
        this.typeOfHand = typeOfHand;
    }

    public String getTypeOfHand(){
        return typeOfHand;
    }
}
