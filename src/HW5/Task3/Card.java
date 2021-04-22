package HW5.Task3;

import java.util.Date;

public class Card {
    private String numberCard;
    private String typeCard;
    private String nameCard;
    private Date dateCard;
    private String cvvCard;

    public Card(String numberCard, String typeCard, String nameCard, int year, int month, int date, String cvvCard) {
        this.numberCard = numberCard;
        this.typeCard = typeCard;
        this.nameCard = nameCard;
        this.dateCard = new Date(year, month, date);
        this.cvvCard = cvvCard;
    }
    public boolean checkCard(){
        if (checkNumberCard() && checkTypeCard() && checkNameCard() && checkDateCard() && checkCvvCard()){
            return true;
        }else return false;
    }

    public boolean checkNumberCard(){
        int numberCount = numberCard.length();
        if (numberCount == 16){
            return true;
        } else return false;
    }

    public boolean checkTypeCard(){
        if (typeCard == "debit"){
            return true;
        } else return false;
    }

    public boolean checkNameCard(){
        if (nameCard != ""){
            return true;
        } else return false;
    }

    public boolean checkDateCard(){
        Date currentDate = new Date(2021, 4, 22);

        if (dateCard.after(currentDate)){
            return true;
        } else return false;
    }

    public boolean checkCvvCard(){
        int numberCvv = cvvCard.length();
        if (numberCvv == 3){
            return true;
        } else return false;
    }









}
