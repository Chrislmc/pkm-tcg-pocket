package com.chris_lai.pkm_tcg_pocket_helper.card;

interface CardProps {
    public void log();
}

public class Card implements CardProps {
    String id = "";
    String name;
    String cardPack = "";
    
    public Card(String cardId, String cardName, String cardPackName) {
        id = cardId;
        name = cardName;
        cardPack = cardPackName;
    }

    public void log() {
        System.out.println(String.format("This card is %2$s(%1$s) from the %3$s pack.", id, name, cardPack));
    }
}