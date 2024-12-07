package com.chris_lai.pkm_tcg_pocket_helper.cardList;

import java.util.ArrayList;
import java.util.Arrays;

import com.chris_lai.pkm_tcg_pocket_helper.card.Card;
import com.chris_lai.pkm_tcg_pocket_helper.types.cardPack.CardPackEnum;
import com.chris_lai.pkm_tcg_pocket_helper.types.rarity.RarityEnum;

public class CardList {
    ArrayList<Card> cardDataList = new ArrayList<Card>(Arrays.asList(
            new Card("001", "Bulbasaur", CardPackEnum.MEWTWO, RarityEnum.NORMAL_ONE),
            new Card("002", "Ivysaur", CardPackEnum.MEWTWO, RarityEnum.NORMAL_TWO),
            new Card("003", "Venusaur", CardPackEnum.MEWTWO, RarityEnum.NORMAL_THREE),
            new Card("004", "Venusaur ex", CardPackEnum.MEWTWO, RarityEnum.NORMAL_FOUR),
            new Card("005", "Caterpie", CardPackEnum.PIKACHU, RarityEnum.NORMAL_ONE),
            new Card("006", "Metapod", CardPackEnum.PIKACHU, RarityEnum.NORMAL_ONE),
            new Card("007", "Butterfree", CardPackEnum.PIKACHU, RarityEnum.NORMAL_THREE),
            new Card("008", "Weedle", CardPackEnum.MEWTWO, RarityEnum.NORMAL_ONE),
            new Card("009", "Kakuna", CardPackEnum.MEWTWO, RarityEnum.NORMAL_ONE),
            new Card("010", "Beedrill", CardPackEnum.MEWTWO, RarityEnum.NORMAL_THREE)));

    public void log() {
        for (Card card : cardDataList) {
            card.log();
        }
    }
}
