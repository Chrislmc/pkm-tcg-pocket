package com.chris_lai.pkm_tcg_pocket_helper.card;

import com.chris_lai.pkm_tcg_pocket_helper.types.cardPack.CardPackEnum;

public class Card {
    String id;
    String name;
    CardPackEnum cardPack;
    
    public Card(String cardId, String cardName, CardPackEnum cardPackName) {
        id = cardId;
        name = cardName;
        cardPack = cardPackName;
    }

    public void log() {
        System.out.println(String.format("This card is %2$s(%1$s) from the %3$s pack.", id, name, cardPack));
    }
}