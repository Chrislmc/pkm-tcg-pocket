package com.chris_lai.pkm_tcg_pocket_helper.card;

import java.util.HashMap;
import java.util.Map;

import com.chris_lai.pkm_tcg_pocket_helper.types.cardPack.CardPackEnum;
import com.chris_lai.pkm_tcg_pocket_helper.types.rarity.RarityEnum;

public class Card {
    String id;
    String name;
    CardPackEnum cardPack;
    RarityEnum rarity;
    HashMap<RarityEnum, String> rarityDesc = new HashMap<RarityEnum, String>(Map.ofEntries(
            Map.entry(
                    RarityEnum.NORMAL_ONE,
                    "♢"),
            Map.entry(
                    RarityEnum.NORMAL_TWO,
                    "♢♢"),
            Map.entry(
                    RarityEnum.NORMAL_THREE,
                    "♢♢♢"),
            Map.entry(
                    RarityEnum.NORMAL_FOUR,
                    "♢♢♢♢"),
            Map.entry(
                    RarityEnum.STAR_ONE,
                    "☆"),
            Map.entry(
                    RarityEnum.STAR_TWO,
                    "☆☆"),
            Map.entry(
                    RarityEnum.CROWN,
                    "♛")));

    public Card(String cardId, String cardName, CardPackEnum cardPackName, RarityEnum cardRarity) {
        id = cardId;
        name = cardName;
        cardPack = cardPackName;
        rarity = cardRarity;
    }

    public String parseRarity() {
        return rarityDesc.get(
                rarity);
    }

    public void log() {
        System.out.println(
                String.format(
                        "This %4$s card is %2$s(%1$s) from the %3$s pack.",
                        id,
                        name,
                        cardPack,
                        parseRarity()));
    }
}