package com.chris_lai.pkm_tcg_pocket_helper.card;

import com.chris_lai.pkm_tcg_pocket_helper.types.cardPack.CardPackEnum;
import com.chris_lai.pkm_tcg_pocket_helper.types.rarity.RarityEnum;

public class Card {
    String id;
    String name;
    CardPackEnum cardPack;
    RarityEnum rarity;
    
    public Card(String cardId, String cardName, CardPackEnum cardPackName, RarityEnum cardRarity) {
        id = cardId;
        name = cardName;
        cardPack = cardPackName;
        rarity = cardRarity;
    }

    public void log() {
        System.out.println(String.format("This card is %2$s(%1$s) from the %3$s pack.", id, name, cardPack));
    }
}