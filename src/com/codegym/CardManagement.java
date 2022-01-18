package com.codegym;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CardManagement {
   private ArrayList<Card> cards = new ArrayList<>();

    public CardManagement() {
    }

    public CardManagement(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
    public void displayAllCards(){
        for (int i = 0; i < cards.size(); i++) {
            System.out.println((i+1)+". "+cards.get(i));
        }
    }
    public void addNewCard(Card newCard){
        cards.add(newCard);
    }
    public Date convertStringToDate(String fromDate){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            date = simpleDateFormat.parse(fromDate);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return date;
    }
    public void findCard(){
        for (int i = 0; i < cards.size(); i++) {
            if (convertStringToDate(cards.get(i).getFormDate()).getDate()==31){
                System.out.println(cards.get(i));
            }
        }
    }

}
